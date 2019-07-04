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
        <h5 class="title">Crediário da Loja</h5>
    
     </div>  
     
        <!--MODIFICAR PARA ADD-->
         
        <form action="UploadWS" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="urldestino" value="ClienteWS">
             <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Cliente</label>
                        <select class="form-control" name="txtCliente">
                            <c:forEach items="${cliente}" var="obj">
                                <option value="${obj.id}">${obj.nome}</option>
                            </c:forEach>
                        </select>                        
                    </div>
                </div>
               </div>
           <div class="row">
            <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Valor Total</label>
                        <input type="number" step="0.01" name="txtValorTotal" required class="form-control" >
                    </div>
                </div>
            </div>
            <div class="row">
            <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Valor de Parcelas</label>
                        <input type="number" step="0.01" name="txtValorParcelas" required class="form-control" >
                    </div>
                </div>
            </div>
             <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Número de Parcelas</label>
                        <input type="number" name="txtNumeroParcelas" required class="form-control" placeholder="Número de Parcelas" >
                    </div>
                </div>
            </div>
            <div class="row">
             <div class="col-md-5 pr-md-1">
             <div class="form-group">
                        <label>Vencimento</label>
                        <input type="date" name="txtVencimento" required class="form-control" >
                    </div>
                </div>   
            </div>
       
   <div class="row">
             <div class="col-md-5 pr-md-1">
             <div class="form-group">
                        <label>Data da Venda</label>
                        <input type="date" name="txtDataVenda" required class="form-control" >
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
    
<%@include file="../rodape.jsp" %>