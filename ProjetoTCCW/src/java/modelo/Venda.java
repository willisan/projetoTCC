/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marcelosiedler
 */
@Entity
@Table(name = "venda")
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v")})
public class Venda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
  
   
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Float valor;
    @JoinColumn(name = "cliente", referencedColumnName = "id")
    @ManyToOne
    private Cliente cliente;
    @JoinColumn(name = "funcionario", referencedColumnName = "id")
    @ManyToOne
    private Funcionario funcionario;
    @OneToMany(mappedBy = "venda")
    private List<ProdutoVenda> produtovendaList;
    @OneToMany(mappedBy = "venda")
    private List<Produto> produtoList;
    @Column(nullable=false)
    private Boolean avista;
    @Column(nullable=false)
    private Boolean crediario;
    @Column(name = "datavenda")
    @Temporal(TemporalType.DATE)
    private Date datavenda;
    
   
    public Venda() {
    }

    public Venda(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    

    public List<ProdutoVenda> getProdutoVendaList() {
        return produtovendaList;
    }

    public void setVendalivroList(List<ProdutoVenda> produtovendaList) {
        this.produtovendaList = produtovendaList;
    }

    public List<ProdutoVenda> getProdutovendaList() {
        return produtovendaList;
    }

    public void setProdutovendaList(List<ProdutoVenda> produtovendaList) {
        this.produtovendaList = produtovendaList;
    }


    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }
    
 public Boolean getAvista() {
        return avista;
    }

    public void setAvista(Boolean avista) {
        this.avista = avista;
    }

    public Boolean getCrediario() {
        return crediario;
    }

    public void setCrediario(Boolean crediario) {
        this.crediario = crediario;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Venda[ id=" + id + " ]";
    }
    
}
