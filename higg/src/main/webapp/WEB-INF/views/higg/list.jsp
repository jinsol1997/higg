<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-30
  Time: 오후 3:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>HIGG</title>
</head>
<body>

<h1>검색 결과</h1>
<c:forEach var="matchDTO" items="${matchDTO}">
    ${matchDTO}
</c:forEach>

</body>
</html>
