package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cabecalho_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"Start your development with a Dashboard for Bootstrap 4.\">\n");
      out.write("  <meta name=\"author\" content=\"Creative Tim\">\n");
      out.write("  <title>Sistema de Controle de Vendas</title>\n");
      out.write("  <!-- Favicon -->\n");
      out.write("  <link href=\"../assets/img/brand/favicon.png\" rel=\"icon\" type=\"image/png\">\n");
      out.write("  <!-- Fonts -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\">\n");
      out.write("  <!-- Icons -->\n");
      out.write("  <link href=\"../assets/vendor/nucleo/css/nucleo.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"../assets/vendor/@fortawesome/fontawesome-free/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- Argon CSS -->\n");
      out.write("  <link type=\"text/css\" href=\"../assets/css/argon.css?v=1.0.0\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <!-- Sidenav -->\n");
      out.write("  <nav class=\"navbar navbar-vertical fixed-left navbar-expand-md navbar-light bg-white\" id=\"sidenav-main\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <!-- Toggler -->\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#sidenav-collapse-main\" aria-controls=\"sidenav-main\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <!-- Brand -->\n");
      out.write("      <a class=\"navbar-brand pt-0\" href=\"../index.html\">\n");
      out.write("       <img src=\"../admin/assets/img/brand/lojagraf.png\" class=\"navbar-brand-img\" alt=\"...\">\n");
      out.write("       \n");
      out.write("      </a>\n");
      out.write("      <!-- User -->\n");
      out.write("      <ul class=\"nav align-items-center d-md-none\">\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link nav-link-icon\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <i class=\"ni ni-bell-55\"></i>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\" aria-labelledby=\"navbar-default_dropdown_1\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <div class=\"media align-items-center\">\n");
      out.write("              <span class=\"avatar avatar-sm rounded-circle\">\n");
      out.write("                <img alt=\"Image placeholder\" src=\"../assets/img/theme/team-1-800x800.jpg\">\n");
      out.write("              </span>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\">\n");
      out.write("            <div class=\" dropdown-header noti-title\">\n");
      out.write("              <h6 class=\"text-overflow m-0\">Bem-Vindo!</h6>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"../examples/profile.html\" class=\"dropdown-item\">\n");
      out.write("              <i class=\"ni ni-single-02\"></i>\n");
      out.write("              <span>Meu perfil</span>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"../examples/profile.html\" class=\"dropdown-item\">\n");
      out.write("              <i class=\"ni ni-settings-gear-65\"></i>\n");
      out.write("              <span>Settings</span>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"../examples/profile.html\" class=\"dropdown-item\">\n");
      out.write("              <i class=\"ni ni-calendar-grid-58\"></i>\n");
      out.write("              <span>Activity</span>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"../examples/profile.html\" class=\"dropdown-item\">\n");
      out.write("              <i class=\"ni ni-support-16\"></i>\n");
      out.write("              <span>Support</span>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a href=\"#!\" class=\"dropdown-item\">\n");
      out.write("              <i class=\"ni ni-user-run\"></i>\n");
      out.write("              <span>Sair</span>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <!-- Collapse -->\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"sidenav-collapse-main\">\n");
      out.write("        <!-- Collapse header -->\n");
      out.write("        <div class=\"navbar-collapse-header d-md-none\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-6 collapse-brand\">\n");
      out.write("              <a href=\"../index.html\">\n");
      out.write("                <img src=\"../admin/assets/img/brand/lojagraf.png\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-6 collapse-close\">\n");
      out.write("              <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#sidenav-collapse-main\" aria-controls=\"sidenav-main\" aria-expanded=\"false\" aria-label=\"Toggle sidenav\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Form -->\n");
      out.write("        <form class=\"mt-4 mb-3 d-md-none\">\n");
      out.write("          <div class=\"input-group input-group-rounded input-group-merge\">\n");
      out.write("            <input type=\"search\" class=\"form-control form-control-rounded form-control-prepended\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("            <div class=\"input-group-prepend\">\n");
      out.write("              <div class=\"input-group-text\">\n");
      out.write("                <span class=\"fa fa-search\"></span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"../home/home.jsp\">\n");
      out.write("              <i class=\"ni ni-tv-2 text-primary\"></i> Tela Inicial\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"../funcionario/index.jsp\">\n");
      out.write("              <i class=\"ni ni-single-02 text-yellow\"></i> Funcionário\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"../produto/index.jsp\">\n");
      out.write("              <i class=\"ni ni-planet text-blue\"></i> Produto\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link active\" href=\"../visualizarvendas/index.jsp\">\n");
      out.write("              <i class=\"ni ni-bullet-list-67 text-red\"></i> Visualizar Vendas\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("        <!-- Divider -->\n");
      out.write("        <hr class=\"my-3\">\n");
      out.write("        \n");
      out.write("          \n");
      out.write("         \n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <!-- Main content -->\n");
      out.write("  <div class=\"main-content\">\n");
      out.write("    <!-- Top navbar -->\n");
      out.write("    <nav class=\"navbar navbar-top navbar-expand-md navbar-dark\" id=\"navbar-main\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <!-- Brand -->\n");
      out.write("        <a class=\"h4 mb-0 text-white text-uppercase d-none d-lg-inline-block\" href=\"../index.html\">Sistema de Controle de Vendas</a>\n");
      out.write("        <!-- Form -->\n");
      out.write("        <form class=\"navbar-search navbar-search-dark form-inline mr-3 d-none d-md-flex ml-lg-auto\">\n");
      out.write("          <div class=\"form-group mb-0\">\n");
      out.write("            <div class=\"input-group input-group-alternative\">\n");
      out.write("              <div class=\"input-group-prepend\">\n");
      out.write("                <span class=\"input-group-text\"><i class=\"fas fa-search\"></i></span>\n");
      out.write("              </div>\n");
      out.write("              <input class=\"form-control\" placeholder=\"Pesquisar\" type=\"text\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("        <!-- User -->\n");
      out.write("        <ul class=\"navbar-nav align-items-center d-none d-md-flex\">\n");
      out.write("          <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link pr-0\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("              <div class=\"media align-items-center\">\n");
      out.write("                <span class=\"avatar avatar-sm rounded-circle\">\n");
      out.write("                  <img alt=\"Image placeholder\" src=\"../assets/img/theme/team-4-800x800.jpg\">\n");
      out.write("                </span>\n");
      out.write("                <div class=\"media-body ml-2 d-none d-lg-block\">\n");
      out.write("                  <span class=\"mb-0 text-sm  font-weight-bold\">Funcionário</span>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-arrow dropdown-menu-right\">\n");
      out.write("              <div class=\" dropdown-header noti-title\">\n");
      out.write("                <h6 class=\"text-overflow m-0\">Bem-Vindo!</h6>\n");
      out.write("              </div>\n");
      out.write("              <a href=\"../examples/profile.html\" class=\"dropdown-item\">\n");
      out.write("                <i class=\"ni ni-single-02\"></i>\n");
      out.write("                <span>Meu Perfil</span>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"../examples/profile.html\" class=\"dropdown-item\">\n");
      out.write("                <i class=\"ni ni-settings-gear-65\"></i>\n");
      out.write("                <span>Settings</span>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"../examples/profile.html\" class=\"dropdown-item\">\n");
      out.write("                <i class=\"ni ni-calendar-grid-58\"></i>\n");
      out.write("                <span>Activity</span>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"../examples/profile.html\" class=\"dropdown-item\">\n");
      out.write("                <i class=\"ni ni-support-16\"></i>\n");
      out.write("                <span>Support</span>\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-divider\"></div>\n");
      out.write("              <a href=\"#!\" class=\"dropdown-item\">\n");
      out.write("                <i class=\"ni ni-user-run\"></i>\n");
      out.write("                <span>Sair</span>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- Header -->\n");
      out.write("    <div class=\"header bg-gradient-primary pb-8 pt-5 pt-md-8\">");
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
}
