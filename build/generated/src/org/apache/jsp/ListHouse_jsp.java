package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.House;
import java.util.ArrayList;
import java.util.List;

public final class ListHouse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"adminuser_style.css\"/>\n");
      out.write("        <!-- font awesome cdn link  -->\n");
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
      out.write("        \n");
      out.write("        ");

        List<House> list = new ArrayList<House>();
        if(request.getAttribute("HouseList") != null){
            list = (List<House>) request.getAttribute("HouseList");
        }
        
      out.write("\n");
      out.write("        <div class=\"header_fixed\">\n");
      out.write("<!--       <h1>Manage House</h1>\n");
      out.write("        <form action=\"mainController\" method=\"get\">\n");
      out.write("            Name : <input type=\"text\" name=\"name\" >\n");
      out.write("            <input type=\"submit\" value=\"search\" name=\"action\">\n");
      out.write("        </form>-->\n");
      out.write("       \n");
      out.write("        \n");
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
      out.write("            <table>\n");
      out.write("                <form action=\"SearchHouseServlet\" class=\"search-bar-container\"  method=\"post\"  >\n");
      out.write("        <input style=\"height: 60px;font-size: 40px;\" type=\"text\" name=\"search\" id=\"search-bar\" placeholder=\"Search here...\"\">\n");
      out.write("        <button class=\"fas fa-search\" style=\"height: 60px; font-size: 40px; background-color: #fff\" value=\"search\" type=\"submit\"></button>\n");
      out.write("        </form>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                    <th>House_ID</th>\n");
      out.write("                    <th>House_name</th>\n");
      out.write("                    <th>Post_Date</th>\n");
      out.write("                    <th>Review</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Status</th>\n");
      out.write("                    <th>Address</th>\n");
      out.write("                    <th>Description</th>\n");
      out.write("                    <th>Location</th>\n");
      out.write("                    <th>Menu</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            ");

                for(House h : list){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"getHouseImgServlet?id=");
      out.print(h.getHouseid() );
      out.write('"');
      out.write('>');
      out.print(h.getHouseid() );
      out.write("</a></td>\n");
      out.write("                    <td>");
      out.print(h.getHousename() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(h.getPostdate() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(h.getReview() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(h.getHouseprice() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(h.getStatus() );
      out.write("</td>\n");
      out.write("                    <td >\n");
      out.write("                        <span class=\"address\">\n");
      out.write("                        ");
      out.print(h.getAddress() );
      out.write("\n");
      out.write("                        </span>\n");
      out.write("                    </td>\n");
      out.write("                    <td>");
      out.print(h.getDescription() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(h.getLocation().getId() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(h.getMenu().getId() );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                            <span class=\"action_btn\">\n");
      out.write("                                <a href=\"NextEditHouseServlet?id=");
      out.print(h.getHouseid() );
      out.write("\">Update</a>\n");
      out.write("                                <a href=\"DeleteHouseServlet?id=");
      out.print(h.getHouseid() );
      out.write("\">Delete</a>\n");
      out.write("                                <a href=\"NextAddHouseServlet\">Add</a>\n");
      out.write("                                <a href=\"ListServiceServlet?id=");
      out.print(h.getHouseid() );
      out.write("\">View Service</a>\n");
      out.write("                                <a href=\"NextAddServiceServlet?id=");
      out.print(h.getHouseid() );
      out.write("\">Add Service</a>\n");
      out.write("                            </span>\n");
      out.write("                                </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"admin_script.js\"></script>\n");
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
