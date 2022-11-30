<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-30
  Time: 오후 1:06
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>HIGG</title>
</head>
<body>
<h1>Main Form</h1>

<form method="post">
    <input type="text" name="searchName" placeholder="검색할 소환사명을 입력해주세요.">
    <input type="submit" value="검색">
</form>
<%--

세션없으면
<a>로그인페이지 이동</a>

세션 있으면 등록한 롤 닉네임 보여주며 바로가기 버튼 만들어줌
<button>나의 전적 확인하기 ${}</button>

--%>
</body>
</html>
