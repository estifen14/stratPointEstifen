<%--
  Created by IntelliJ IDEA.
  User: estifen

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>PROFILE VIEW</title>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<style>
    #container{
        border: 1px solid black;
        margin-top: 50px;
        margin-left: 50px;
        margin-right: 50px;
    }
</style>
</head>
<body>
    <div id="container">
        <div style="margin-top: 20px;">
            <img style="float: left; padding-left: 20px" src="${profile.picture}" />
            <h3 style="float: left; margin-left: 10px;">${profile.name.first}
                ${profile.name.last}</h3>
        </div>
        <div style="clear: both">
            <div style="margin-left: 20px;">
                ID: ${profile.id}
                <br><br> Profile: ${profile.profile}
                <br><br> Email: ${profile.email}
                <br><br> Phone: ${profile.phone}
                <br><br> Address: ${profile.address}
                <br><br> Age: ${profile.age}
                <br><br> Balance: ${profile.balance}
            </div>
        </div>
    </div>

</body>
</html>
