package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.House;
import java.util.ArrayList;
import java.util.List;

public final class Listhousemain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("^\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("            <!-- font awesome cdn link  -->\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <!-- custom css file link  -->\n");
      out.write("    <link href=\"list.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("                ");

        List<House> list = new ArrayList<House>();
        if(request.getAttribute("HouseList") != null){
            list = (List<House>) request.getAttribute("HouseList");
        }
        
      out.write("\n");
      out.write("            <div class=\"listContainer\">\n");
      out.write("      <div class=\"listWrapper\">\n");
      out.write("        <div class=\"listSearch\">\n");
      out.write("          <h1 class=\"lsTitle\">Search</h1>\n");
      out.write("          <div class=\"lsItem\">\n");
      out.write("            <label for=\"\">Destination</label>\n");
      out.write("            <input type=\"text\" />\n");
      out.write("          </div>\n");
      out.write("          <div class=\"lsItem\">\n");
      out.write("            <label for=\"\">Check-in Date</label>\n");
      out.write("            <input type=\"\" />\n");
      out.write("          </div>\n");
      out.write("          <div>\n");
      out.write("            <button>Search</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("                      ");

                for(House h : list){
                
      out.write("\n");
      out.write("          \n");
      out.write("        <div class=\"listResult\">\n");
      out.write("          <div class=\"searchItem\">\n");
      out.write("            <img src=\"images/GrandsuitDN.jpg\" alt=\"\" class=\"siImg\" />\n");
      out.write("            <div class=\"siDesc\">\n");
      out.write("              <h1 class=\"siTitle\">");
      out.print(h.getHousename() );
      out.write("</h1>\n");
      out.write("              <span class=\"siDistance\">");
      out.print(h.getAddress() );
      out.write("</span>\n");
      out.write("              <span class=\"siTaxi0p\">");
      out.print(h.getReview() );
      out.write("</span>\n");
      out.write("              <span class=\"siSubtitle\"> With Air Conditioning </span>\n");
      out.write("              <span class=\"siFeatures\">\n");
      out.write("                ");
      out.print(h.getDescription() );
      out.write("\n");
      out.write("              </span>\n");
      out.write("              <span class=\"siCancel0p\">Free cancellation</span>\n");
      out.write("              <span class=\"siCancel0pSubtitle\">\n");
      out.write("                You can cancel later, so lock in this great house\n");
      out.write("              </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"siDetails\">\n");
      out.write("              <div class=\"siRating\">\n");
      out.write("                <span>");
      out.print(h.getStatus() );
      out.write("</span>\n");
      out.write("                <button>8.9</button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"siDetailTexts\">\n");
      out.write("                <span class=\"siPrice\">");
      out.print(h.getHouseprice() );
      out.write("/span>\n");
      out.write("                <span class=\"siTax0p\">Includes taxes and fees</span>\n");
      out.write("                <button class=\"siCheckButton\">See availability</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>>\n");
      out.write("                        ");

                }
                
      out.write("\n");
      out.write("    </body>\n");
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
}
