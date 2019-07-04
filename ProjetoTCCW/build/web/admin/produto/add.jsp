<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../cabecalho.jsp" %>     
<div class="container-fluid">
        <div class="header-body">
          <!-- Card stats -->
          <div class="row">
            <div class="col-xl-3 col-lg-6">
              
            </div>
          </div>
        </div>
      </div>
</div>  
    <!-- Page content -->
    <div class="container-fluid mt--7">
      <!-- Table -->
      <div class="row">
        <div class="col">
          <div class="card shadow">
            <div class="card-header border-0">
        <h5 class="title">Registrar Produto</h5>
    
     </div>  
     
        <!--MODIFICAR PARA ADD-->
        <form action="UploadWS" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="urldestino" value="ProdutoWS">
            <div class="row ">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Nome do Produto</label>
                        <input type="text" name="txtNome" required class="form-control" placeholder="Nome do Produto" >
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Código do Produto</label>
                        <input type="text" name="txtCodigo" required class="form-control" placeholder="Código" >
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Marca</label>
                        <input type="text" name="txtMarca" required class="form-control" placeholder="Marca" >
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Tamanho</label>
                        <input type="number" name="txtTamanho" required class="form-control" placeholder="Tamanho" >
                    </div>
                </div>
            </div>
             <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Quantidade</label>
                        <input type="number" name="txtQuantidade" required class="form-control" placeholder="Quantidade" >
                    </div>
                </div>
            </div>
            <div class="row">
            <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Preço de Custo</label>
                        <input type="number" step="0.01" name="txtPrecoCusto" required class="form-control" >
                    </div>
                </div>
            </div>
            
            <div class="row">
            <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Preço de Venda</label>
                        <input type="number" step="0.01" name="txtPrecoVenda" required class="form-control" >
                    </div>
                </div>
            </div>
            <div class="row">
             <div class="col-md-5 pr-md-1">
             <div class="form-group">
                        <label>Registrado em</label>
                        <input type="date" name="txtDatadeRegistro" required class="form-control" >
                    </div>
                </div>   
            </div>
       


           <button class="btn btn-primary btn-round text-center" type="submit">
                <i class="tim-icons icon-cloud-upload-94"></i> Salvar
            </button>
            <a class="btn btn-primary btn-round text-center" href="index.jsp">
                <i class="tim-icons icon-bullet-list-67"></i> Listar
            </a>
              
             </form>
          </div>
        </div>

 
 

    <div class="card-footer">
        <c:if test = "${not empty msg}">
            <div class="alert alert-primary alert-dismissible fade show" role="alert">
                ${msg}
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <i class="tim-icons icon-simple-remove"></i>
                </button>
            </div>
        </c:if>
    </div>
            
            
      
          </div>

 





<%@include file="../rodape.jsp" %>