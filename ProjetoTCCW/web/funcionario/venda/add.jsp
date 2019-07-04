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
        <h5 class="title">Registrar Venda</h5>
    
     </div>  
     
        <!--MODIFICAR PARA ADD-->
        <form action="UploadWS" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="urldestino" value="ProdutoWS">
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
                        <label>Produtos</label>
                        <select class="form-control" name="txtProdutos">
                            <c:forEach items="${produto}" var="obj">
                                <option value="${obj.id}">${obj.nome}</option>
                            </c:forEach>
                        </select>                        
                    </div>
                </div>
               </div>
             <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Vendedor</label>
                        <select class="form-control" name="txtVendedor">
                            <c:forEach items="${funcionario}" var="obj">
                                <option value="${obj.id}">${obj.nome}</option>
                            </c:forEach>
                        </select>                        
                    </div>
                </div>
               </div>
             <div class="row">
            <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Valor Unitário</label>
                        <input type="number" step="0.01" name="txtValorUnitario" required class="form-control" >
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
                        <label>Data da Venda</label>
                        <input type="date" name="txtDatadaVenda" required class="form-control" >
                    </div>
                </div>   
            </div>
            
           <fieldset>
  <label>Forma de Pagamento</label>
  <div>
    <input type="checkbox" id="crediario" name="pagamento" value="crediario">
    <label for="coding">Crediário</label>
  </div>
  <div>
    <input type="checkbox" id="avista" name="pagamento" value="avista">
    <label for="music">Á vista</label>
  </div>
</fieldset>

         
       


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