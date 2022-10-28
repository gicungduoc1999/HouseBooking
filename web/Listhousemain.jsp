<%-- 
    Document   : Listhousemain
    Created on : Oct 28, 2022, 7:13:48 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!-- font awesome cdn link  -->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />

        <!-- custom css file link  -->
        <link href="css/list_house_main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="listContainer">
            <div class="listWrapper">
                <div class="listSearch">
                    <form action="search-house-main" method="get">


                        <h1 class="lsTitle">Search</h1>
                        <div class="lsItem">
                            <label for="">Destination</label>
                            <input name="whereTo" type="text" />
                        </div>
                        <div class="lsItem">
                            <label for="">Check-in Date</label>
                            <input name="arrivals" type="date" />
                        </div>
                        <div>
                            <button>Search</button>
                        </div>
                    </form>
                </div>

                <div class="listResult">
                    <c:if test="${list.size() > 0 }" >
                        <c:forEach items="${list}" var="house" >
                            <div class="searchItem">
                                <img src="images/GrandsuitDN.jpg" alt="" class="siImg" />
                                <div class="siDesc">
                                    <h1 class="siTitle">${house.housename}</h1>
                                    <span class="siDistance"> </span>
                                    <span class="siTaxi0p"></span>
                                    <span class="siSubtitle"> ${house.houseprice} </span>
                                    <span class="siFeatures">

                                    </span>
                                    <span class="siCancel0p"> ${house.description}</span>
                                    <span class="siCancel0p"> ${house.address}</span>
                                    <span class="siCancel0pSubtitle">
                                        ${house.description}
                                    </span>
                                </div>
                                <div class="siDetails">
                                    <div class="siRating">
                                        <span></span>
                                        <button>8.9</button>
                                    </div>
                                    <div class="siDetailTexts">
                                        <span class="siPrice"></span>
                                        <span class="siTax0p">Includes taxes and fees</span>
                                        <button class="siCheckButton">See availability</button>
                                    </div>
                                </div>
                            </div>


                        </c:forEach>
                    </c:if>
                    
                    <c:if test="${list.size() == 0 }" >
                        No data
                    </c:if>




                </div>
                </body>
                </html>