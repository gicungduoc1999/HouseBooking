<%-- 
    Document   : Listhousemain
    Created on : Oct 28, 2022, 7:13:48 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

                <div class="listResult">
                    <div class="searchItem">
                        <img src="images/GrandsuitDN.jpg" alt="" class="siImg" />
                        <div class="siDesc">
                            <h1 class="siTitle"></h1>
                            <span class="siDistance"></span>
                            <span class="siTaxi0p"></span>
                            <span class="siSubtitle"> With Air Conditioning </span>
                            <span class="siFeatures">

                            </span>
                            <span class="siCancel0p">Free cancellation</span>
                            <span class="siCancel0pSubtitle">
                                You can cancel later, so lock in this great house
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
                </div>
                </body>
                </html>