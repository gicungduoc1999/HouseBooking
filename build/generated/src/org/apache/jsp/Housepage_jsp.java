package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.House;
import java.util.ArrayList;
import java.util.List;

public final class Housepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <!-- custom css file link  -->\n");
      out.write("        <link href=\"css/housepage.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("            <a href=\"Index.jsp\" class=\"logo\"><span>H</span>ouse<span>B</span>ooking</a>\n");
      out.write("\n");
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <a href=\"Index.jsp\">home</a>\n");
      out.write("                <a href=\"Index.jsp\">book</a>\n");
      out.write("                <a href=\"Index.jsp\">room</a>\n");
      out.write("                <a href=\"Index.jsp\">services</a>\n");
      out.write("                <a href=\"Index.jsp\">gallery</a>\n");
      out.write("                <a href=\"Index.jsp\">review</a>\n");
      out.write("                <a href=\"Index.jsp\">contact</a>\n");
      out.write("            </nav>\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <i class=\"fas fa-search\" id=\"search-btn\"></i>\n");
      out.write("                <a href=\"login.jsp\">\n");
      out.write("                    <i class=\"fas fa-user\" id=\"\"></i>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form action=\"\" class=\"search-bar-container\">\n");
      out.write("                <input type=\"search\" id=\"search-bar\" placeholder=\"search here...\">\n");
      out.write("                <label for=\"search-bar\" class=\"fas fa-search\"></label>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"hotelContainer\">\n");
      out.write("            <div class=\"hotelWrapper\">\n");
      out.write("                <button class=\"bookNow\">Reserve or Book</button>\n");
      out.write("                <div class=\"hotelTitle\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${house.housename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                <div class=\"hotelAddress\">\n");
      out.write("                    <i class=\"fas fa-map-marker-alt\"></i>\n");
      out.write("                    <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${house.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <span class=\"hotelDistance\">Check-in Date : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${house.postdate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                <span class=\"hotelPriceHighlight\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${house.houseprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$</span>\n");
      out.write("                <div class=\"hotelImage\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"hotelDetails\">\n");
      out.write("                    <div class=\"hotelDetailTexts\">\n");
      out.write("                        <h1 class=\"hotelTitle\">Description</h1>\n");
      out.write("                        <p class=\"hotelDesc\">\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${house.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"hotelDetailsPrice\">\n");
      out.write("                        <h1>Rent For</h1>\n");
      out.write("                        <h2>\n");
      out.write("                            <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${house.houseprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b>\n");
      out.write("                        </h2>\n");
      out.write("                        \n");
      out.write("                        <button type=\"\" id=\"open-bill\">Reserve or Book Now</button>\n");
      out.write("                            <div class=\"login-form-container\">\n");
      out.write("\n");
      out.write("        <i class=\"fas fa-times\" id=\"form-close\"></i>\n");
      out.write("\n");
      out.write("        <form action=\"housepage\" method=\"p\">\n");
      out.write("            <h3>Bill</h3>\n");
      out.write("            <<p class=\"box\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${house.houseprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <input type=\"password\" class=\"box\" placeholder=\"enter your password\">\n");
      out.write("              startdate:  <input class=\"box\" required=\"\" type=\"date\" name=\"startdate\" >\n");
      out.write("              enddate:  <input class=\"box\" required=\"\" type=\"date\" name=\"enddate\" >\n");
      out.write("              note: <input type=\"text\" name=\"note\" >\n");
      out.write("              <button type=\"submit\" class=\"btn\">Reserve or Book Now</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("<!--                        <form action=\"housepage\" method=\"post\">\n");
      out.write("                            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${house.houseid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" hidden=\"\" name=\"houseid\" >\n");
      out.write("                            startdate:  <input required=\"\" type=\"date\" name=\"startdate\" >\n");
      out.write("                            enddate:  <input required=\"\" type=\"date\" name=\"enddate\" >\n");
      out.write("                            note: <input type=\"text\" name=\"note\" >\n");
      out.write("                            <button type=\"submit\" >Reserve or Book Now</button>\n");
      out.write("                        </form>-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"comments-container\">\n");
      out.write("            <h1 class=\"heading\" style=\"font-size: 40px\">Leave us your comment</h1>\n");
      out.write("            ");

        String username = (String)session.getAttribute("username");
        if(username == null){
            
      out.write("\n");
      out.write("            <p class=\"comment-title\">Your comments on the posts</p>\n");
      out.write("            <div class=\"user-comments-container\">\n");
      out.write("                <div class=\"show-comments\">\n");
      out.write("                    <div class=\"post-title\">\n");
      out.write("                        <span>Please Login to Comment</span>\n");
      out.write("                        <a href=\"Login.jsp\" class=\"inline-btn\">Login</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                    }else{
            
      out.write("\n");
      out.write("\n");
      out.write("            <p class=\"comment-title\">Your comments on the posts</p>\n");
      out.write("            <div class=\"user-comments-container\">\n");
      out.write("                <div class=\"show-comments\">\n");
      out.write("                    <div class=\"post-title\">\n");
      out.write("                        from : <span></span>\n");
      out.write("                        <a href=\"\">view post</a>\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"AddCommentServlet\" method=\"post\">\n");
      out.write("                        <div class=\"post-title\">Name: </div>\n");
      out.write("                        <input\n");
      out.write("                            class=\"comment-box\"\n");
      out.write("                            value=\"\"\n");
      out.write("                            type=\"text\"\n");
      out.write("                            name=\"userid\"\n");
      out.write("                            hidden=\"true\"\n");
      out.write("                            />\n");
      out.write("                        <div class=\"post-title\">House:</div>\n");
      out.write("                        <input\n");
      out.write("                            class=\"comment-box\"\n");
      out.write("                            type=\"number\"\n");
      out.write("                            name=\"houseid\"\n");
      out.write("                            value=\"\"\n");
      out.write("                            />\n");
      out.write("                        <div class=\"post-title\">Date:</div>\n");
      out.write("                        <input\n");
      out.write("                            class=\"comment-box\"\n");
      out.write("                            type=\"date\"\n");
      out.write("                            name=\"date\"\n");
      out.write("                            />\n");
      out.write("                        <div class=\"post-title\">Comment:</div>\n");
      out.write("                        <input\n");
      out.write("                            class=\"comment-box\"\n");
      out.write("                            type=\"text\"\n");
      out.write("                            name=\"comment\"\n");
      out.write("                            />\n");
      out.write("                        <!--            <button\n");
      out.write("                                      type=\"submit\"\n");
      out.write("                                      class=\"inline-delete-btn\"\n");
      out.write("                                      name=\"open_edit_box\"\n");
      out.write("                                    >\n");
      out.write("                                      edit \n");
      out.write("                                    </button>-->\n");
      out.write("                        <button\n");
      out.write("                            type=\"submit\"\n");
      out.write("                            class=\"inline-option-btn\"\n");
      out.write("                            name=\"Add\"\n");
      out.write("                            value=\"addComment\"\n");
      out.write("                            >Add \n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>     \n");
      out.write("        </section>\n");
      out.write("        ");

}
        
      out.write("\n");
      out.write("        <section class=\"footer\">\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>about us</h3>\n");
      out.write("                    <p>We are team ... This is my our project for SWP391</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>locations</h3>\n");
      out.write("                    <a href=\"#\">Ha Long</a>\n");
      out.write("                    <a href=\"#\">Da Nang</a>\n");
      out.write("                    <a href=\"#\">Con Dao</a>\n");
      out.write("                    <a href=\"#\">Da Lat</a>\n");
      out.write("                    <a href=\"#\">Nha Trang</a>\n");
      out.write("                    <a href=\"#\">SaPa</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>quick links</h3>\n");
      out.write("                    <a href=\"#home\">home</a>\n");
      out.write("                    <a href=\"#book\">book</a>\n");
      out.write("                    <a href=\"#packages\">packages</a>\n");
      out.write("                    <a href=\"#services\">services</a>\n");
      out.write("                    <a href=\"#gallery\">gallery</a>\n");
      out.write("                    <a href=\"#review\">review</a>\n");
      out.write("                    <a href=\"#contact\">contact</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>follow us</h3>\n");
      out.write("                    <a href=\"https://www.facebook.com/huuduc.devil\">facebook</a>\n");
      out.write("                    <a href=\"#\">instagram</a>\n");
      out.write("                    <a href=\"#\">twitter</a>\n");
      out.write("                    <a href=\"#\">linkedin</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <h1 class=\"credit\"> created by <span> Trung, Đức, Hy, Nam, Kiệt </span> | SWP391 </h1>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        var mess = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("        if (mess != '') {\n");
      out.write("            alert(mess);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</html>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listImage}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("image");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${image.imglink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" class=\"hotelImg\" />\n");
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
