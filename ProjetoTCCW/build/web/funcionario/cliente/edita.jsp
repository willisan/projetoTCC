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
        <h5 class="title">Editar Informações do Cliente</h5>
    
     </div>  
     
        <!--MODIFICAR PARA ADD-->
         
        <form action="UploadWS" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="urldestino" value="ClienteWS">
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" name="txtNome" required class="form-control" placeholder="Nome" >
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>CPF</label>
                        <input type="text" name="txtCpf" required class="form-control" placeholder="Cpf" >
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>RG</label>
                        <input type="text" name="txtRg" required class="form-control" placeholder="RG" >
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Endereço</label>
                        <input type="text" name="txtEndereco" required class="form-control" placeholder="Endereço" >
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Telefone</label>
                        <input type="text" name="txtTelefone" required class="form-control" placeholder="Telefone" >
                    </div>
                </div>
            </div>
  
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Email</label>
                        <input type="email" name="txtEmail" required class="form-control" placeholder="Email" >
                    </div>
                </div>
            </div>
           
                
             <button class="btn btn-primary btn-round text-center" type="submit">
                <i class="tim-icons icon-cloud-upload-94"></i> Salvar
            </button>
           <button class="btn btn-primary btn-round text-center" type="submit">
                <i class="tim-icons icon-cloud-upload-94"></i> Listar
            </button>
        </form>
    </div>
          </div>
    
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
</div>

    
<%@include file="../rodape.jsp" %>