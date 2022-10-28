<%-- 
    Document   : Listhousemain
    Created on : Oct 28, 2022, 7:13:48 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.House"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>^
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
            <!-- font awesome cdn link  -->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
    />

    <!-- custom css file link  -->
    <link href="list.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
                <%
        List<House> list = new ArrayList<House>();
        if(request.getAttribute("HouseList") != null){
            list = (List<House>) request.getAttribute("HouseList");
        }
        %>
            <div class="listContainer">
      <div class="listWrapper">
        <div class="listSearch">
          <h1 class="lsTitle">Search</h1>
          <div class="lsItem">
            <label for="">Destination</label>
            <input type="text" />
          </div>
          <div class="lsItem">
            <label for="">Check-in Date</label>
            <input type="" />
          </div>
          <div>
            <button>Search</button>
          </div>
        </div>
                      <%
                for(House h : list){
                %>
          
        <div class="listResult">
          <div class="searchItem">
            <img src="images/GrandsuitDN.jpg" alt="" class="siImg" />
            <div class="siDesc">
              <h1 class="siTitle"><%=h.getHousename() %></h1>
              <span class="siDistance"><%=h.getAddress() %></span>
              <span class="siTaxi0p"><%=h.getReview() %></span>
              <span class="siSubtitle"> With Air Conditioning </span>
              <span class="siFeatures">
                <%=h.getDescription() %>
              </span>
              <span class="siCancel0p">Free cancellation</span>
              <span class="siCancel0pSubtitle">
                You can cancel later, so lock in this great house
              </span>
            </div>
            <div class="siDetails">
              <div class="siRating">
                <span><%=h.getStatus() %></span>
                <button>8.9</button>
              </div>
              <div class="siDetailTexts">
                <span class="siPrice"><%=h.getHouseprice() %>/span>
                <span class="siTax0p">Includes taxes and fees</span>
                <button class="siCheckButton">See availability</button>
              </div>
            </div>
          </div>
        </div>>
                        <%
                }
                %>
    </body>
</html>
