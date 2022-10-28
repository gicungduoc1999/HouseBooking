package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Menu;
import java.util.ArrayList;
import Model.Location;
import java.util.List;
import Model.House;

public final class UpdateHouse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("         <!-- font awesome cdn link  -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\">\n");
      out.write("\n");
      out.write("   <!-- custom admin css file link  -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"admin_style.css\">\n");
      out.write("   <!-- Boostrap 5 -->\n");
      out.write("   <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\" crossorigin=\"anonymous\">\n");
      out.write("   <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8\" crossorigin=\"anonymous\"></script>  \n");
      out.write("\n");
      out.write("   <!-- jquery -->\n");
      out.write("   <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        List<Location> llist = new ArrayList<Location>();
            if (request.getAttribute("llist") != null) {
                llist = (List<Location>) request.getAttribute("llist");
            }
            List<Menu> mlist = new ArrayList<Menu>();
            if (request.getAttribute("mlist") != null) {
                mlist = (List<Menu>) request.getAttribute("mlist");
            }
        House h = new House();
            if (request.getAttribute("house") != null) {
                h = (House) request.getAttribute("house");
            }
        
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("\n");
      out.write("      <div class=\"flex\">\n");
      out.write("   \n");
      out.write("          <a href=\"AdminIndex.jsp\" class=\"logo\">Admin<span>Panel</span></a>\n");
      out.write("   \n");
      out.write("         <nav class=\"navbar\">\n");
      out.write("            <a href=\"AdminIndex.jsp\"><span>Home</span></a>\n");
      out.write("            <a href=\"ListHouseServlet\">Room</a>\n");
      out.write("            <a href=\"ListBillServlet\">Orders</a>\n");
      out.write("            <a href=\"ListAccountServlet\">Users</a>\n");
      out.write("            <a href=\"ListAdditionalServiceServlet\">Service</a>\n");
      out.write("            <a href=\"ListCommentServlet\">Messages</a>\n");
      out.write("         </nav>\n");
      out.write("   \n");
      out.write("         <div class=\"icons\">\n");
      out.write("            <div id=\"menu-btn\" class=\"fas fa-bars\"></div>\n");
      out.write("            <div id=\"user-btn\" class=\"fas fa-user\"></div>\n");
      out.write("         </div>\n");
      out.write("   \n");
      out.write("         <div class=\"account-box\">\n");
      out.write("                <p>username : <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></p>\n");
      out.write("                <a href=\"LogoutServlet\" class=\"delete-btn\">logout</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("   \n");
      out.write("      </div>\n");
      out.write("   </header>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <section class=\"add-products\">\n");
      out.write("      <h1 class=\"title\">Update</h1>\n");
      out.write("\n");
      out.write("      <form action=\"EditHouseServlet\" method=\"post\" >\n");
      out.write("        <input\n");
      out.write("          type=\"text\"\n");
      out.write("          name=\"houseid\"\n");
      out.write("          value=\"");
      out.print(h.getHouseid() );
      out.write("\"\n");
      out.write("          class=\"box\"\n");
      out.write("          placeholder=\"Enter Account ID\"\n");
      out.write("          hidden=\"true\"\n");
      out.write("        />\n");
      out.write("        <h2>Post Date</h2>\n");
      out.write("        <input\n");
      out.write("          type=\"date\"\n");
      out.write("          name=\"postdate\"\n");
      out.write("          value=\"");
      out.print(h.getPostdate() );
      out.write("\"\n");
      out.write("          class=\"box\"\n");
      out.write("          required=\"\"\n");
      out.write("        />\n");
      out.write("        <h2>House Name</h2>\n");
      out.write("        <input\n");
      out.write("          type=\"text\"\n");
      out.write("          name=\"housename\"\n");
      out.write("          value=\"");
      out.print(h.getHousename() );
      out.write("\"\n");
      out.write("          class=\"box\"\n");
      out.write("          placeholder=\"Enter Full Name\"\n");
      out.write("          required=\"\"\n");
      out.write("        />\n");
      out.write("        <input\n");
      out.write("          type=\"text\"\n");
      out.write("          name=\"review\"\n");
      out.write("          value=\"");
      out.print(h.getReview() );
      out.write("\"\n");
      out.write("          class=\"box\"\n");
      out.write("          placeholder=\"Enter Username\"\n");
      out.write("          hidden=\"true\"\n");
      out.write("        />\n");
      out.write("        <h2>House Price</h2>\n");
      out.write("        <input\n");
      out.write("          type=\"number\"\n");
      out.write("          name=\"houseprice\"\n");
      out.write("          value=\"");
      out.print(h.getHouseprice() );
      out.write("\"\n");
      out.write("          class=\"box\"\n");
      out.write("          placeholder=\"Enter House Price\"\n");
      out.write("          required=\"\"\n");
      out.write("        />\n");
      out.write("        <h2>Address</h2>\n");
      out.write("        <input\n");
      out.write("          type=\"text\"\n");
      out.write("          name=\"address\"\n");
      out.write("          value=\"");
      out.print(h.getAddress() );
      out.write("\"\n");
      out.write("          class=\"box\"\n");
      out.write("          placeholder=\"Enter phone number\"\n");
      out.write("          required=\"\"\n");
      out.write("        />\n");
      out.write("        <input\n");
      out.write("          type=\"number\"\n");
      out.write("          name=\"status\"\n");
      out.write("          value=\"");
      out.print(h.getStatus() );
      out.write("\"\n");
      out.write("          class=\"box\"\n");
      out.write("          placeholder=\"Enter status\"\n");
      out.write("          hidden=\"true\"\n");
      out.write("        />\n");
      out.write("        <h2>Description</h2>\n");
      out.write("        <input\n");
      out.write("          type=\"text\"\n");
      out.write("          name=\"description\"\n");
      out.write("          value=\"");
      out.print(h.getDescription() );
      out.write("\"\n");
      out.write("          class=\"box\"\n");
      out.write("          placeholder=\"Enter role\"\n");
      out.write("        />\n");
      out.write("        <h2>Location</h2>\n");
      out.write("        <select class=\"box\"  name=\"location\">\n");
      out.write("             ");

                for(Location l : llist){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(l.getId() );
      out.write("\" >");
      out.print(l.getName() );
      out.write("</option>\n");
      out.write("                    ");

                }
                
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <h2>Menu</h2>\n");
      out.write("        <select class=\"box\" name=\"menu\">\n");
      out.write("            ");

                for(Menu m : mlist){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(m.getId() );
      out.write("\" >");
      out.print(m.getName() );
      out.write("</option>\n");
      out.write("                    ");

                }
                
      out.write("\n");
      out.write("        </select>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <input class=\"Update-btn\" type=\"submit\" value=\"Update\" name=\"Update\" />\n");
      out.write("      </form>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("       <!-- custom admin js file link  -->\n");
      out.write("    <script src=\"admin_script.js\"></script>\n");
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
