package org.apache.jsp.funcionario.venda;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/funcionario/venda/../cabecalho.jsp");
    _jspx_dependants.add("/funcionario/venda/../rodape.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"Start your development with a Dashboard for Bootstrap 4.\">\r\n");
      out.write("  <meta name=\"author\" content=\"Creative Tim\">\r\n");
      out.write("  <title>Sistema de Controle de Vendas</title>\r\n");
      out.write("  <!-- Favicon -->\r\n");
      out.write("  <link href=\"../assets/img/brand/favicon.png\" rel=\"icon\" type=\"image/png\">\r\n");
      out.write("  <!-- Fonts -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- Icons -->\r\n");
      out.write("  <link href=\"../assets/vendor/nucleo/css/nucleo.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"../assets/vendor/@fortawesome/fontawesome-free/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- Argon CSS -->\r\n");
      out.write("  <link type=\"text/css\" href=\"../assets/css/argon.css?v=1.0.0\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <!-- Sidenav -->\r\n");
      out.write("  <nav class=\"navbar navbar-vertical fixed-left navbar-expand-md navbar-light bg-white\" id=\"sidenav-main\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <!-- Toggler -->\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#sidenav-collapse-main\" aria-controls=\"sidenav-main\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <!-- Brand -->\r\n");
      out.write("      <a class=\"navbar-brand pt-3\" href=\"../index.html\">\r\n");
      out.write("         <img src=\"../assets/img/brand/lojagraf.png\" class=\"navbar-brand-img fa-2x\" alt=\"...\">\r\n");
      out.write("\r\n");
      out.write("      </a>\r\n");
      out.write("      <!-- User -->\r\n");
      out.write("      <ul class=\"nav align-items-center d-md-none\">\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link nav-link-icon\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("            <i class=\"ni ni-bell-55\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\" aria-labelledby=\"navbar-default_dropdown_1\">\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Action</a>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Another action</a>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("            <div class=\"media align-items-center\">\r\n");
      out.write("              <span class=\"avatar avatar-sm rounded-circle\">\r\n");
      out.write("                <img alt=\"Image placeholder\" src=\"../assets/img/theme/team-1-800x800.jpg\">\r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\">\r\n");
      out.write("            <div class=\" dropdown-header noti-title\">\r\n");
      out.write("              <h6 class=\"text-overflow m-0\">Bem-Vindo!</h6>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"../examples/profile.html\" class=\"dropdown-item\">\r\n");
      out.write("              <i class=\"ni ni-single-02\"></i>\r\n");
      out.write("              <span>Meu perfil</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"../examples/profile.html\" class=\"dropdown-item\">\r\n");
      out.write("              <i class=\"ni ni-settings-gear-65\"></i>\r\n");
      out.write("              <span>Settings</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"../examples/profile.html\" class=\"dropdown-item\">\r\n");
      out.write("              <i class=\"ni ni-calendar-grid-58\"></i>\r\n");
      out.write("              <span>Activity</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"../examples/profile.html\" class=\"dropdown-item\">\r\n");
      out.write("              <i class=\"ni ni-support-16\"></i>\r\n");
      out.write("              <span>Support</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a href=\"#!\" class=\"dropdown-item\">\r\n");
      out.write("              <i class=\"ni ni-user-run\"></i>\r\n");
      out.write("              <span>Sair</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <!-- Collapse -->\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"sidenav-collapse-main\">\r\n");
      out.write("        <!-- Collapse header -->\r\n");
      out.write("        <div class=\"navbar-collapse-header d-md-none\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-6 collapse-brand\">\r\n");
      out.write("              <a href=\"../index.html\">\r\n");
      out.write("               <img src=\"../assets/img/brand/lojagraf.png\">\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-6 collapse-close\">\r\n");
      out.write("              <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#sidenav-collapse-main\" aria-controls=\"sidenav-main\" aria-expanded=\"false\" aria-label=\"Toggle sidenav\">\r\n");
      out.write("                <span></span>\r\n");
      out.write("                <span></span>\r\n");
      out.write("              </button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Form -->\r\n");
      out.write("        <form class=\"mt-4 mb-3 d-md-none\">\r\n");
      out.write("          <div class=\"input-group input-group-rounded input-group-merge\">\r\n");
      out.write("            <input type=\"search\" class=\"form-control form-control-rounded form-control-prepended\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("            <div class=\"input-group-prepend\">\r\n");
      out.write("              <div class=\"input-group-text\">\r\n");
      out.write("                <span class=\"fa fa-search\"></span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <!-- Navigation -->\r\n");
      out.write("        <ul class=\"navbar-nav\">\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"../home/home.jsp\">\r\n");
      out.write("              <i class=\"ni ni-tv-2 text-primary\"></i> Tela Inicial\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"../cliente/index.jsp\">\r\n");
      out.write("              <i class=\"ni ni-circle-08 text-pink\"></i> Cliente\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          \r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link active\" href=\"../venda/index.jsp\">\r\n");
      out.write("              <i class=\"ni ni-bullet-list-67 text-red\"></i> Venda\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"../crediario/index.jsp\">\r\n");
      out.write("              <i class=\"ni ni-single-02 text-yellow\"></i> Crediario\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("           <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"../pagamento/index.jsp\">\r\n");
      out.write("              <i class=\"ni ni-planet text-blue\"></i> Pagamento\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("         \r\n");
      out.write("          \r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- Divider -->\r\n");
      out.write("        <hr class=\"my-3\">\r\n");
      out.write("        \r\n");
      out.write("          \r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("  <!-- Main content -->\r\n");
      out.write("  <div class=\"main-content\">\r\n");
      out.write("    <!-- Top navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-top navbar-expand-md navbar-dark\" id=\"navbar-main\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <!-- Brand -->\r\n");
      out.write("        <a class=\"h4 mb-0 text-white text-uppercase d-none d-lg-inline-block\" href=\"../index.html\">Sistema de Controle de Vendas</a>\r\n");
      out.write("        <!-- Form -->\r\n");
      out.write("        <form class=\"navbar-search navbar-search-dark form-inline mr-3 d-none d-md-flex ml-lg-auto\">\r\n");
      out.write("          <div class=\"form-group mb-0\">\r\n");
      out.write("            <div class=\"input-group input-group-alternative\">\r\n");
      out.write("              <div class=\"input-group-prepend\">\r\n");
      out.write("                <span class=\"input-group-text\"><i class=\"fas fa-search\"></i></span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <input class=\"form-control\" placeholder=\"Pesquisar\" type=\"text\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <!-- User -->\r\n");
      out.write("        <ul class=\"navbar-nav align-items-center d-none d-md-flex\">\r\n");
      out.write("          <li class=\"nav-item dropdown\">\r\n");
      out.write("            <a class=\"nav-link pr-0\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("              <div class=\"media align-items-center\">\r\n");
      out.write("                <span class=\"avatar avatar-sm rounded-circle\">\r\n");
      out.write("                  <img alt=\"Image placeholder\" src=\"../assets/img/theme/team-4-800x800.jpg\">\r\n");
      out.write("                </span>\r\n");
      out.write("                <div class=\"media-body ml-2 d-none d-lg-block\">\r\n");
      out.write("                  <span class=\"mb-0 text-sm  font-weight-bold\">Funcionário</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\">\r\n");
      out.write("              <div class=\" dropdown-header noti-title\">\r\n");
      out.write("                <h6 class=\"text-overflow m-0\">Bem-Vindo!</h6>\r\n");
      out.write("              </div>\r\n");
      out.write("              <a href=\"../examples/profile.html\" class=\"dropdown-item\">\r\n");
      out.write("                <i class=\"ni ni-single-02\"></i>\r\n");
      out.write("                <span>Meu Perfil</span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a href=\"../examples/profile.html\" class=\"dropdown-item\">\r\n");
      out.write("                <i class=\"ni ni-settings-gear-65\"></i>\r\n");
      out.write("                <span>Settings</span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a href=\"../examples/profile.html\" class=\"dropdown-item\">\r\n");
      out.write("                <i class=\"ni ni-calendar-grid-58\"></i>\r\n");
      out.write("                <span>Activity</span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <a href=\"../examples/profile.html\" class=\"dropdown-item\">\r\n");
      out.write("                <i class=\"ni ni-support-16\"></i>\r\n");
      out.write("                <span>Support</span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <div class=\"dropdown-divider\"></div>\r\n");
      out.write("              <a href=\"#!\" class=\"dropdown-item\">\r\n");
      out.write("                <i class=\"ni ni-user-run\"></i>\r\n");
      out.write("                <span>Sair</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("    <div class=\"header bg-gradient-primary pb-8 pt-5 pt-md-8\">");
      out.write("     \n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("        <div class=\"header-body\">\n");
      out.write("          <!-- Card stats -->\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-xl-3 col-lg-6\">\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("</div>  \n");
      out.write("    <!-- Page content -->\n");
      out.write("    <div class=\"container-fluid mt--7\">\n");
      out.write("      <!-- Table -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <div class=\"card shadow\">\n");
      out.write("            <div class=\"card-header border-0\">\n");
      out.write("        <h5 class=\"title\">Registrar Venda</h5>\n");
      out.write("    \n");
      out.write("     </div>  \n");
      out.write("     \n");
      out.write("        <!--MODIFICAR PARA ADD-->\n");
      out.write("        <form action=\"UploadWS\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("            <input type=\"hidden\" name=\"urldestino\" value=\"ProdutoWS\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Cliente</label>\n");
      out.write("                        <select class=\"form-control\" name=\"txtCliente\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               </div>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("             <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Produtos</label>\n");
      out.write("                        <select class=\"form-control\" name=\"txtProdutos\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               </div>\n");
      out.write("             <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Vendedor</label>\n");
      out.write("                        <select class=\"form-control\" name=\"txtVendedor\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </select>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               </div>\n");
      out.write("             <div class=\"row\">\n");
      out.write("            <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Valor Unitário</label>\n");
      out.write("                        <input type=\"number\" step=\"0.01\" name=\"txtValorUnitario\" required class=\"form-control\" >\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-md-5 pr-md-1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Preço de Venda</label>\n");
      out.write("                        <input type=\"number\" step=\"0.01\" name=\"txtValorTotal\" required class=\"form-control\" >\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           <div class=\"form-group\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                          <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text\">Crediário</span>\n");
      out.write("                          </div>\n");
      out.write("                          <input type=\"checkbox\"  name=\"chkCrediario\" class=\"form-control\">\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                          <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text\">Á Vista</span>\n");
      out.write("                          </div>\n");
      out.write("                          <input type=\"checkbox\"  name=\"chkAvista\" class=\"form-control\">\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("          \n");
      out.write("            <div class=\"row\">\n");
      out.write("             <div class=\"col-md-5 pr-md-1\">\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                        <label>Data da Venda</label>\n");
      out.write("                        <input type=\"date\" name=\"txtDatadaVenda\" required class=\"form-control\" >\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("            </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("            <button class=\"btn btn-primary btn-round text-center\" type=\"submit\">\n");
      out.write("                <i class=\"tim-icons icon-cloud-upload-94\"></i> Salvar\n");
      out.write("            </button>\n");
      out.write("            <a class=\"btn btn-primary btn-round text-center\" href=\"index.jsp\">\n");
      out.write("                <i class=\"tim-icons icon-bullet-list-67\"></i> Listar\n");
      out.write("            </a>\n");
      out.write("              \n");
      out.write("             </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("    <div class=\"card-footer\">\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("      \n");
      out.write("          </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("      <footer class=\"footer\">\n");
      out.write("        <div class=\"row align-items-center justify-content-xl-between\">\n");
      out.write("          <div class=\"col-xl-6\">\n");
      out.write("            <div class=\"copyright text-center text-xl-left text-muted\">\n");
      out.write("              &copy; 2018 <a href=\"https://www.creative-tim.com\" class=\"font-weight-bold ml-1\" target=\"_blank\">Creative Tim</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-xl-6\">\n");
      out.write("            <ul class=\"nav nav-footer justify-content-center justify-content-xl-end\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a href=\"https://www.creative-tim.com\" class=\"nav-link\" target=\"_blank\">Creative Tim</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a href=\"https://www.creative-tim.com/presentation\" class=\"nav-link\" target=\"_blank\">About Us</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a href=\"http://blog.creative-tim.com\" class=\"nav-link\" target=\"_blank\">Blog</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a href=\"https://github.com/creativetimofficial/argon-dashboard/blob/master/LICENSE.md\" class=\"nav-link\" target=\"_blank\">MIT License</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- Argon Scripts -->\n");
      out.write("  <!-- Core -->\n");
      out.write("  <script src=\"../assets/vendor/jquery/dist/jquery.min.js\"></script>\n");
      out.write("  <script src=\"../assets/vendor/bootstrap/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <!-- Argon JS -->\n");
      out.write("  <script src=\"../assets/js/argon.js?v=1.0.0\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${funcionario}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty msg}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"alert alert-primary alert-dismissible fade show\" role=\"alert\">\n");
        out.write("                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
        out.write("                    <i class=\"tim-icons icon-simple-remove\"></i>\n");
        out.write("                </button>\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
