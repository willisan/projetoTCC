/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.FuncionarioDAO;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Funcionario;
import util.Criptografia;

/**
 *
 * @author dappo
 */
@WebServlet(name = "FuncionarioWS", urlPatterns = {"/admin/funcionario/FuncionarioWS"})
public class FuncionarioWS extends HttpServlet {
    private FuncionarioDAO dao;
    private Funcionario obj;
    private String pagina;
    private String acao;
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        acao = request.getParameter("acao");
        List<Funcionario> lista = null;
        String id;
        switch(String.valueOf(acao)){
            case "del":
                id = request.getParameter("id");
                dao = new FuncionarioDAO();
                pagina = "index.jsp";
                obj = dao.buscarPorChavePrimaria(Long.parseLong(id));
                Boolean deucerto = dao.excluir(obj);
                if(deucerto){   
                    lista = dao.listar();
                    request.setAttribute("lista", lista);
                    request.setAttribute("msg", "Excluído com sucesso");
                }
                else{
                    request.setAttribute("msg", "Erro ao excluir");
                }
                break;
            case "edit":
                id = request.getParameter("id");
                dao = new FuncionarioDAO();
                Funcionario obj = dao.buscarPorChavePrimaria(Long.parseLong(id));
                request.setAttribute("obj", obj);
                pagina = "edita.jsp";
                break;
            default:
                dao = new FuncionarioDAO();
                if (request.getParameter("filtro") != null) {
                    try {
                        lista = dao.listar(request.getParameter("filtro"));
                    } catch (Exception ex) {
                        Logger.getLogger(FuncionarioWS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    lista = dao.listar();
                }
                //pra onde deve ser redirecionada a página
                pagina = "index.jsp";
                //passar a listagem para a página
                request.setAttribute("lista", lista);
                break;
                
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String msg;
            request.setCharacterEncoding("UTF-8");
            //verificar campos obrigatórios
            if(request.getParameter("txtNome") == null){
                msg = "Campos obrigatórios não informados";
            }
            else{
                dao = new FuncionarioDAO();
                obj = new Funcionario();
                //preencho o objeto com o que vem do post
                
                Boolean deucerto;
                
                //se veio com a chave primaria então tem q alterar
                if(request.getParameter("txtId")!= null){
                    obj = dao.buscarPorChavePrimaria(Long.parseLong(request.getParameter("txtId")));
                    obj.setNome(request.getParameter("txtNome"));
                    obj.setCpf(request.getParameter("txtCpf"));
                    obj.setRg(request.getParameter("txtRg"));
                    obj.setEndereco(request.getParameter("txtEndereco"));
                    obj.setTelefone(request.getParameter("txtTelefone"));
                    obj.setEmail(request.getParameter("txtEmail"));
                    obj.setFuncao(request.getParameter("txtFuncao"));
                     try {
                        obj.setSenha(Criptografia.convertPasswordToMD5(request.getParameter("txtSenha")));
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(AdminWS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    deucerto = dao.alterar(obj);
                    pagina="edita.jsp";
                }
                else{
                    obj.setNome(request.getParameter("txtNome"));
                    obj.setCpf(request.getParameter("txtCpf"));
                    obj.setRg(request.getParameter("txtRg"));
                    obj.setEndereco(request.getParameter("txtEndereco"));
                    obj.setTelefone(request.getParameter("txtTelefone"));
                    obj.setEmail(request.getParameter("txtEmail"));
                    obj.setFuncao(request.getParameter("txtFuncao"));
                     try {
                        obj.setSenha(Criptografia.convertPasswordToMD5(request.getParameter("txtSenha")));
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(AdminWS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    deucerto = dao.incluir(obj);
                    pagina="add.jsp";   
                }
                if(deucerto){
                    msg = "Operação realizada com sucesso";    
                }
                else{
                    msg = "Erro ao realizar a operação";
                }
            }
            dao.fecharConexao();
            request.setAttribute("msg", msg);
            RequestDispatcher destino = request.getRequestDispatcher(pagina);
            destino.forward(request, response);
    }


}
