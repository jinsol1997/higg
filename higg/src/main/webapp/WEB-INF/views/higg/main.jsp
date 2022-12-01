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
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>

</head>
<body>
<h1>Main Form</h1>

<form method="post">
    <input type="text" name="searchName" placeholder="검색할 소환사명을 입력해주세요.">
    <input type="submit" value="검색">
</form>

<script type="text/javascript">
    if (typeof jQuery == 'undefined') {
        var script = document.createElement('script');
        script.type = "text/javascript";
        script.src = "http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js";
        document.getElementsByTagName('head')[0].appendChild(script);
    }
</script>
<%--

세션없으면
<a>로그인페이지 이동</a>

세션 있으면 등록한 롤 닉네임 보여주며 바로가기 버튼 만들어줌
<button>나의 전적 확인하기 ${}</button>

--%>
<c:choose>
    <c:when test="${empty sessionScope.userId}">
        <!-- 로그인이 안되어 있으면 -->
        <form id="loginFrm" name="loginFrm" method="post">
            <table>
                <tr>
                    <td>아이디</td>
                    <td><input type="text" name="userId" id="userId" placeholder="10글자" maxlength="10"></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" name="passwd" id="passwd" maxlength="20"></td>
                </tr>
                <c:if test="${msg == '실패'}">
                    <tr>
                        <td colspan=2>
                            아이디 또는 패스워드가 틀렸습니다.
                        </td>
                    </tr>
                </c:if>
                <tr>
                    <td colspan=2>
                        <input type="button" id="login" value="로그인"/>
                    </td>
                </tr>
            </table>
        </form>
    </c:when>
    <c:otherwise>
        <h3>${sessionScope.userId}님 환영합니다.</h3>
        <a href="logout.do">로그아웃</a>
    </c:otherwise>
</c:choose>
</body>
<script>
    $(document).ready(function (e) {
        $('#login').click(function () {
            if ($.trim($('#userId').val()) == '') {
                alert("아이디를 입력해 주세요.");
                $('#userId').focus();
                return;
            } else if ($.trim($('#passwd').val()) == ''){
                alert("비밀번호를 입력해 주세요.");
                $('#passwd').focus();
                return;
            }
            $('#loginFrm').submit();
        });
    });

</script>


</html>
