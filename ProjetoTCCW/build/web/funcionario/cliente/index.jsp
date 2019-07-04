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
              <h3 class="mb-0">Rela��o de Clientes</h3>
            </div>
            <div class="table-responsive">
              <table class="table align-items-center table-flush">
                <thead class="thead-light">
                  <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">CPF</th>
                    <th scope="col">RG</th>
                    <th scope="col">Endere�o</th>
                    <th scope="col">Telefone</th>
                    <th scope="col">Email</th>
                    <th scope="col">Edita</th>
                    <th scope="col">Deleta</th>
                  </tr>
                </thead>
                 <tbody>
                     <tr>
                            <td>1</td>
                            <td>nome</td>
                            <td>1598741236</td>
                            <td>${obj.rg}</td>
                            <td>${obj.endereco}</td>
                            <td>${obj.telefone}</td>
                            <td>${obj.email}</td>
                           
                            
                            <td>
                                <a class="ni ni-ruler-pencil" href="../cliente/edita.jsp ${obj.id}">
                                    <i class="tim-icons icon-pencil"></i>
                                </a>
                            </td>
                            <td>
                                <a class="ni ni-basket" href="ClienteWS?acao=del&id=${obj.id}">
                                    <i class="tim-icons icon-pencil"></i>
                                </a>
                            </td>
                        </tr>
                    <c:forEach items="${lista}" var="obj">
                        
                    </c:forEach>  
                    
                  <tr>
                    
                    <td>
                     
                    </td>
                    <td>
                      <span class="badge badge-dot mr-4">
                        
                      </span>
                    </td>
                    <td>
                      <div class="avatar-group">
                       
                      </div>
                    </td>
                    <td>
                      <div class="d-flex align-items-center">
                        
                        <div>
                         
                        </div>
                      </div>
                    </td>
                    <td class="text-right">
                      <div class="dropdown">
                       
                        
                      </div>
                    </td>
                  </tr>
                </tbody>
              </table>
            </div>
            <div class="card-footer py-4">
                <a class="btn btn-primary btn-round text-center" href="add.jsp">
            <i class="tim-icons icon-simple-add"></i> Adicionar
        </a>
              <nav aria-label="...">
                <ul class="pagination justify-content-end mb-0">
                  <li class="page-item disabled">
                    <a class="page-link" href="#" tabindex="-1">
                      <i class="fas fa-angle-left"></i>
                      <span class="sr-only">Previous</span>
                    </a>
                  </li>
                  <li class="page-item active">
                    <a class="page-link" href="#">1</a>
                  </li>
                  <li class="page-item">
                    <a class="page-link" href="#">2 <span class="sr-only">(current)</span></a>
                  </li>
                  <li class="page-item"><a class="page-link" href="#">3</a></li>
                  <li class="page-item">
                    <a class="page-link" href="#">
                      <i class="fas fa-angle-right"></i>
                      <span class="sr-only">Next</span>
                    </a>
                  </li>
                </ul>
              </nav>
            </div>
          </div>
        </div>
      </div>
      
         
           
                  
                    
                 
    </div>

 <%@include file="../rodape.jsp" %>
          
       