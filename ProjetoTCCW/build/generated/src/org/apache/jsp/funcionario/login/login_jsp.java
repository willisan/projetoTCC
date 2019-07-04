package org.apache.jsp.funcionario.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
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
      out.write("<body class=\"bg-default\">\n");
      out.write("  <div class=\"main-content\">\n");
      out.write("    <!-- Navbar -->\n");
      out.write("    <nav class=\"navbar navbar-top navbar-horizontal navbar-expand-md navbar-dark\">\n");
      out.write("      <div class=\"container px-4\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"../index.html\">\n");
      out.write("         <!-- <img src=\"../assets/img/brand/white.png\" />-->\n");
      out.write("        </a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-collapse-main\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbar-collapse-main\">\n");
      out.write("          <!-- Collapse header -->\n");
      out.write("          <div class=\"navbar-collapse-header d-md-none\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-6 collapse-brand\">\n");
      out.write("               \n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-6 collapse-close\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbar-collapse-main\" aria-controls=\"sidenav-main\" aria-expanded=\"false\" aria-label=\"Toggle sidenav\">\n");
      out.write("                  <span></span>\n");
      out.write("                  <span></span>\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- Navbar items -->\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- Header -->\n");
      out.write("    <div class=\"header bg-gradient-primary py-7 py-lg-8\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"header-body text-center mb-7\">\n");
      out.write("          <div class=\"row justify-content-center\">\n");
      out.write("            <div class=\"col-lg-5 col-md-6\">\n");
      out.write("              <h1 class=\"text-white\">Bem-Vindo!</h1>\n");
      out.write("              <p class=\"text-lead text-light\">Sistema de Controle de Vendas</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"separator separator-bottom separator-skew zindex-100\">\n");
      out.write("        <svg x=\"0\" y=\"0\" viewBox=\"0 0 2560 100\" preserveAspectRatio=\"none\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("          <polygon class=\"fill-default\" points=\"2560 0 2560 100 0 100\"></polygon>\n");
      out.write("        </svg>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Page content -->\n");
      out.write("    <div class=\"container mt--8 pb-5\">\n");
      out.write("      <div class=\"row justify-content-center\">\n");
      out.write("        <div class=\"col-lg-5 col-md-7\">\n");
      out.write("          <div class=\"card bg-secondary shadow border-0\">\n");
      out.write("            <div class=\"card-header bg-transparent pb-5\">\n");
      out.write("            <div class=\"text-muted text-center mt-2 mb-3\"><label>Login</label></div>\n");
      out.write("             \n");
      out.write("              <div class=\"btn-wrapper text-center\">\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body px-lg-5 py-lg-5\">\n");
      out.write("             \n");
      out.write("              <form role=\"form\">\n");
      out.write("                <div class=\"form-group mb-3\">\n");
      out.write("                  <div class=\"input-group input-group-alternative\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"ni ni-email-83\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input class=\"form-control\" placeholder=\"Email\" type=\"email\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <div class=\"input-group input-group-alternative\">\n");
      out.write("                    <div class=\"input-group-prepend\">\n");
      out.write("                      <span class=\"input-group-text\"><i class=\"ni ni-lock-circle-open\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                    <input class=\"form-control\" placeholder=\"Password\" type=\"password\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"custom-control custom-control-alternative custom-checkbox\">\n");
      out.write("                  <input class=\"custom-control-input\" id=\" customCheckLogin\" type=\"checkbox\">\n");
      out.write("                  <label class=\"custom-control-label\" for=\" customCheckLogin\">\n");
      out.write("                   \n");
      out.write("                  </label>\n");
      out.write("                </div>\n");
      out.write("                <!--<div class=\"text-center\">\n");
      out.write("                  <button type=\"button\" class=\"btn btn-primary my-4\" >Entrar</button>\n");
      out.write("                </div>-->\n");
      out.write("                \n");
      out.write("              </form>\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <a class=\"btn btn-primary btn-round \" href=\"../home/home.jsp\">\n");
      out.write("                <i class=\"tim-icons icon-bullet-list-67\"></i> Entrar\n");
      out.write("            </a>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("          <div class=\"row mt-3\">\n");
      out.write("            <div class=\"col-6\">\n");
      out.write("              <a href=\"#\" class=\"text-light\"><small>Forgot password?</small></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-6 text-right\">\n");
      out.write("              <a href=\"#\" class=\"text-light\"><small>Create new account</small></a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- Footer -->\n");
      out.write("  <footer class=\"py-5\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row align-items-center justify-content-xl-between\">\n");
      out.write("        <div class=\"col-xl-6\">\n");
      out.write("          <div class=\"copyright text-center text-xl-left text-muted\">\n");
      out.write("            &copy; 2018 <a href=\"https://www.creative-tim.com\" class=\"font-weight-bold ml-1\" target=\"_blank\">Creative Tim</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xl-6\">\n");
      out.write("          <ul class=\"nav nav-footer justify-content-center justify-content-xl-end\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a href=\"https://www.creative-tim.com\" class=\"nav-link\" target=\"_blank\">Creative Tim</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a href=\"https://www.creative-tim.com/presentation\" class=\"nav-link\" target=\"_blank\">About Us</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a href=\"http://blog.creative-tim.com\" class=\"nav-link\" target=\"_blank\">Blog</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a href=\"https://github.com/creativetimofficial/argon-dashboard/blob/master/LICENSE.md\" class=\"nav-link\" target=\"_blank\">MIT License</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
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
}
