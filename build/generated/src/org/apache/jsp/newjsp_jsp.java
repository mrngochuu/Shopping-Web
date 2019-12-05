package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_var_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_var_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_var_test.release();
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Wedding dress | Home</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\n");
      out.write("        <script src=\"javascript/details.js\" type=\"text/javascript\" charset=\"utf-8\" async defer></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- Header -->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"img/logo.png\" width=\"50px\" height=\"50px\"></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                Dropdown\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                <div class=\"dropdown-divider\"></div>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link disabled\" href=\"#\">Disabled</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse flex-grow-0\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!-- end header -->\n");
      out.write("\n");
      out.write("            <!-- body-content -->\n");
      out.write("            <main class=\"mb-3\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 banner\">\n");
      out.write("                        <div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                            <!-- Indicators -->\n");
      out.write("                            <ul class=\"carousel-indicators\">\n");
      out.write("                                <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("                                <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <!-- The slideshow -->\n");
      out.write("                            <div class=\"carousel-inner\">\n");
      out.write("                                <div class=\"carousel-item active\">\n");
      out.write("                                    <img src=\"img/index/wedding-banner.jpg\" width=\"100%\" height=\"600\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img src=\"img/index/wedding-banner02.jpg\" width=\"100%\" height=\"600\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img src=\"img/index/wedding-banner03.jpg\" width=\"100%\" height=\"600\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Left and right controls -->\n");
      out.write("                            <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("                                <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("                                <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- end banner -->\n");
      out.write("\n");
      out.write("                <!-- Search-->\n");
      out.write("                <p class=\"title\">Search advance product</p>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <form class=\"form col-lg-4 bg-light\">\n");
      out.write("                        <input class=\"form-control mr-sm-2 mb-3 mt-3\" type=\"text\" name=\"txtSearch\" placeholder=\"Title\"/>\n");
      out.write("                        <!-- Type -->\n");
      out.write("                        <select class=\"form-control mr-sm-2 mb-3\" name=\"txtType\">\n");
      out.write("                            <option selected >-- Choose type of real estate -- </option>\n");
      out.write("                            <!-- 1 vòng for -->\n");
      out.write("                            <option></option>\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                        <!-- City -->\n");
      out.write("                        <select selected class=\"form-control mr-sm-2 mb-3\" name=\"txtCity\">\n");
      out.write("\n");
      out.write("                            <option>-- Choose the city -- </option>\n");
      out.write("                            <option></option>\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                        <!-- District -->\n");
      out.write("                        <select selected class=\"form-control mr-sm-2 mb-3\" name=\"txtDistrict\">\n");
      out.write("                            <option>-- Choose the district -- </option>\n");
      out.write("                            <!-- 1 vòng for -->\n");
      out.write("                            <option></option>\n");
      out.write("                        </select>\n");
      out.write("                        <button class=\"form-control btn btn-outline-success mb-3\" type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- List product -->\n");
      out.write("                <p class=\"title\">Wedding dresses</p>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <section class=\"col-lg-3\">\n");
      out.write("                        <div class=\"card brand\">\n");
      out.write("                            <img src=\"img/index/Dress_1.jpeg\" alt=\"KARAH\" width=\"100%\" height=\"auto\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title font-italic font-weight-bold\">Karah</h4>\n");
      out.write("                                <p class=\"card-text\">Discover St. Patrick Studio, a collection that follows the latest design trends and executes them with innovative craftsmanship and superioR fabrics by the Pronovias Fashion Group in exclusive partnership with Luv Bridal Australia.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"Karah.html\" class=\"btn btn-secondary pl-5 pr-5 mb-3\">See details</a>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                    <section class=\"col-lg-3\">\n");
      out.write("                        <div class=\"card brand\">\n");
      out.write("                            <img src=\"img/index/Dress_2.jpeg\" alt=\"KASSIDY\" width=\"100%\" height=\"auto\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title font-italic font-weight-bold\">Kassidy</h4>\n");
      out.write("                                <p class=\"card-text\">Discover St. Patrick Studio, a collection that follows the latest design trends and executes them with innovative craftsmanship and superior fabrics by the Pronovias Fashion Group in exclusive partnership with Luv Bridal Australia.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"Kassidy.html\" class=\"btn btn-secondary pl-5 pr-5 mb-3\">See details</a>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                    <section class=\"col-lg-3\">\n");
      out.write("                        <div class=\"card brand\">\n");
      out.write("                            <img src=\"img/index/Dress_3.jpeg\" alt=\"EASTON\" width=\"100%\" height=\"auto\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title font-italic font-weight-bold\">Easton</h4>\n");
      out.write("                                <p class=\"card-text\">Subtle in skirt and undeniable in appeal, EASTON is a sheer delight in a bold yet delicate floral lace. Embracing the twin concepts of seduction and innocence, she is classic in her silhouette and intelligent in her low back. Her fettuccine straps draw the eye to the base of her spine, showcasing skin and lengthening the figure.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"Easton.html\" class=\"btn btn-secondary pl-5 pr-5 mb-3\">See details</a>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                    <section class=\"col-lg-3\">\n");
      out.write("                        <div class=\"card brand\">\n");
      out.write("                            <img src=\"img/index/Dress_4.jpg\" alt=\"EDEN\" width=\"100%\" height=\"auto\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title font-italic font-weight-bold\">Eden</h4>\n");
      out.write("                                <p class=\"card-text\">EDEN, a design that resides in an elite group of gowns, is one of this season?s most fashion forward bridal styles, yet timeless in her appeal. In a combination of French Chantilly lace and eyelash scalloping EDEN intelligently incorporates subtle geometrics to flatter the figure.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"eden.html\" class=\"btn btn-secondary pl-5 pr-5 mb-3\">See details</a>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("            <!-- footer -->\n");
      out.write("            <footer class=\"p-3\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-5\">\n");
      out.write("                        <ul>\n");
      out.write("                            <h5>In Ho Chi Minh city</h5>\n");
      out.write("                            <li>Address: 1 Le Loi, Ward Ben Nghe, District 1</li>\n");
      out.write("                            <li>Phone: 0999999999</li>\n");
      out.write("                            <li>Fax: (84 24) 3974 3036</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-5\">\n");
      out.write("                        <ul>\n");
      out.write("                            <h5>In Ha Noi city</h5>\n");
      out.write("                            <li>Address: 1 Ly Nam De, Ward Hoang Ma, District Hoang Kiem</li>\n");
      out.write("                            <li>Phone: 0888888888</li>\n");
      out.write("                            <li>Fax: (84 24) 3974 3036</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2\">\n");
      out.write("                        <h5>Contact me</h5>\n");
      out.write("                        <a href=\"#\"><img src=\"img/index/fb.png\" alt=\"Facebook\" width=\"32\" height=\"32\"></a>\n");
      out.write("                        <a href=\"#\"><img src=\"img/index/instagram.png\" alt=\"Instagram\" width=\"32\" height=\"32\"></a>\n");
      out.write("                        <a href=\"#\"><img src=\"img/index/skype.png\" alt=\"Skype\" width=\"32\" height=\"32\"></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <center style=\"font-size: 15px; opacity: 0.5;\">Copyright &copy; G.A.U Co.op\n");
      out.write("                </center>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>                    ");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ROLE eq 'customer'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_0.setVar("cusBoolean");
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">Cart</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USERNAME}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">Log out</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ROLE eq 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_1.setVar("adminBoolean");
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">Manage</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USERNAME}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">Log out</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!cusBoolean}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!adminBoolean}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
        out.write("                                </li>\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"nav-link\" href=\"register.jsp\">Register</a>\n");
        out.write("                                </li>       \n");
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
