<%--
  Created by IntelliJ IDEA.
  User: estifen
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>HOME PAGE</title>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

  <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
  <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">

  <style>
    .dataTables_filter {
      display: none;
    }
  </style>
  <script>
    var redirect;
    $(document).ready(function(){
      redirect = function(id){
        window.location.href='/view/' + id;
      }

      $(document).ready( function () {

        var dt = $('#myTable').DataTable({
          paging: false
          ,bInfo: false
        });

        $("#searchbox").keyup(function() {
          dt.search($(this).val()).draw();
        });
      } );
    });
  </script>

</head>
<body>
    <input type="text" id="searchbox" placeholder="search">
    <table id="myTable" border="1">
      <thead>
        <th>Name</th>
        <th>Age</th>
        <th>Active</th>
        <th>Blocked</th>
      </thead>
      <tbody>
        <c:forEach items="${profileList}" var="profile">
          <c:set var="name" value="${profile.name}" />
          <tr style="cursor: pointer" onclick="redirect('<c:out value="${profile.id}"/>')">
            <td><c:out value="${name.first}"/> <c:out value="${name.last}"/></td>
            <td><c:out value="${profile.age}"/></td>
            <td><input type="checkbox" <c:if test="${profile.active}">checked</c:if> /></td>
            <td><input type="checkbox" <c:if test="${profile.blocked}">checked</c:if> /></td>
          </tr>

        </c:forEach>

      </tbody>
    </table>
</body>
</html>
