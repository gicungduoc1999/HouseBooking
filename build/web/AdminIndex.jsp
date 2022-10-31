<%-- 
    Document   : AdminIndex
    Created on : Oct 1, 2022, 1:25:47 AM
    Author     : Admin
--%>

<%@page import="Model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- font awesome cdn link  -->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

   <!-- custom admin css file link  -->
   <link rel="stylesheet" href="admin_style.css">
   <!-- Boostrap 5 -->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>  

   <!-- jquery -->
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    </head>
    <body>
                    <header class="header">

      <div class="flex">
   
          <a href="Index.jsp" class="logo">Admin<span>Panel</span></a>
   
         <nav class="navbar">
            <a href="AdminIndex.jsp"><span>Home</span></a>
            <a href="ListHouseServlet">Room</a>
            <a href="ListBillServlet">Orders</a>
            <a href="ListAccountServlet">Users</a>
            <a href="ListAdditionalServiceServlet">Service</a>
            <a href="ListCommentServlet">Messages</a>
         </nav>
   
         <div class="icons">
            <div id="menu-btn" class="fas fa-bars"></div>
            <div id="user-btn" class="fas fa-user"></div>
         </div>
   
         <div class="account-box">
                <p>username : <span>${fullname}</span></p>
                <a href="LogoutServlet" class="delete-btn">logout</a>

            </div>
   
      </div>
   </header>
        
        
          <!-- admin dashboard section starts  -->

      <section class="dashboard">

         <h1 class="title">dashboard</h1>

         <div class="box-container">

            <div class="box">
                <p style="color: black" >total pendings </p>
                   <c:forEach items="${listHouse}" var="house">
                       <p> <span style="color: black" >${house.housename}</span>  : ${house.numberBill} selected  </p>
                   </c:forEach>
               
            </div>

            <div class="box">
               <h3></h3>
               <p>Number of normal users : ${countUser}</p>
            </div>

            <div class="box">
               <h3></h3>
               <p>Number of admin users : ${countAdmin}</p>
            </div>

            <div class="box">
               <h3></h3>
               <p>total accounts : ${countAll}</p>
            </div>

         </div>

      </section>

        
    </body>
    <script src="admin_script.js"></script>
</html>