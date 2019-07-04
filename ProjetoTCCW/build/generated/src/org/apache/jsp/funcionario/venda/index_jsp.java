package org.apache.jsp.funcionario.venda;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/funcionario/venda/../cabecalho.jsp");
    _jspx_dependants.add("/funcionario/venda/../rodape.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("  <div class=\"container-fluid\">\n");
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
      out.write("              <h3 class=\"mb-0\">Relação de Vendas</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("              <table class=\"table align-items-center table-flush\">\n");
      out.write("                <thead class=\"thead-light\">\n");
      out.write("                   <tr>\n");
      out.write("                   <th scope=\"col\">ID</th>\n");
      out.write("                   <th scope=\"col\">Cliente</th>\n");
      out.write("                    <th scope=\"col\">Produtos</th>\n");
      out.write("                    <th scope=\"col\">Valor Unitário</th>\n");
      out.write("                    <th scope=\"col\">Valor Total</th>\n");
      out.write("                    <th scope=\"col\">Vendedor</th>\n");
      out.write("                    <th scope=\"col\">Forma de Pagamento</th>\n");
      out.write("                    <th scope=\"col\">Data da Venda</th>\n");
      out.write("                     <th scope=\"col\">Edita</th>\n");
      out.write("                    <th scope=\"col\">Deleta</th>\n");
      out.write("                   </tr>\n");
      out.write("                </thead>\n");
      out.write("                  <tbody>\n");
      out.write("                       <tr>\n");
      out.write("                            <td>1</td>\n");
      out.write("                            <td>cliente</td>\n");
      out.write("                            <td>15151,15185</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.marca}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.tamanho}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.quantidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.precocusto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                             <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.dataregistro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                             <td>\n");
      out.write("                                <a class=\"ni ni-ruler-pencil\" href=\"../venda/edita.jsp ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <i class=\"tim-icons icon-pencil\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a class=\"ni ni-basket\" href=\"ProdutoWS?acao=del&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <i class=\"tim-icons icon-pencil\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                    \n");
      out.write("                  <tr>\n");
      out.write("                    \n");
      out.write("                    <td>\n");
      out.write("                     \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                      <span class=\"badge badge-dot mr-4\">\n");
      out.write("                        \n");
      out.write("                      </span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                      <div class=\"avatar-group\">\n");
      out.write("                       \n");
      out.write("                      </div>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                      <div class=\"d-flex align-items-center\">\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                         \n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"text-right\">\n");
      out.write("                      <div class=\"dropdown\">\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                      </div>\n");
      out.write("                    </td>\n");
      out.write("                  </tr>\n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-footer py-4\">\n");
      out.write("                <a class=\"btn btn-primary btn-round text-center\" href=\"add.jsp\">\n");
      out.write("            <i class=\"tim-icons icon-simple-add\"></i> Adicionar\n");
      out.write("        </a>\n");
      out.write("                \n");
      out.write("              <nav aria-label=\"...\">\n");
      out.write("                <ul class=\"pagination justify-content-end mb-0\">\n");
      out.write("                  <li class=\"page-item disabled\">\n");
      out.write("                    <a class=\"page-link\" href=\"#\" tabindex=\"-1\">\n");
      out.write("                      <i class=\"fas fa-angle-left\"></i>\n");
      out.write("                      <span class=\"sr-only\">Previous</span>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"page-item active\">\n");
      out.write("                    <a class=\"page-link\" href=\"#\">1</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"page-item\">\n");
      out.write("                    <a class=\"page-link\" href=\"#\">2 <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\n");
      out.write("                  <li class=\"page-item\">\n");
      out.write("                    <a class=\"page-link\" href=\"#\">\n");
      out.write("                      <i class=\"fas fa-angle-right\"></i>\n");
      out.write("                      <span class=\"sr-only\">Next</span>\n");
      out.write("                    </a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </nav>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("         \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("    </div>\n");
      out.write("                                    \n");
      out.write("    ");
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
      out.write("\n");
      out.write("       ");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        \n");
          out.write("                    ");
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
}
