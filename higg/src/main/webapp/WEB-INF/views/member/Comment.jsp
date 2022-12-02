<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-12-02
  Time: 오후 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Comment</title>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
</head>
<body>
<style>


</style>
<script>

    function send_click() {

        var searchNum = document.querySelector('#searchNum').value;
        var message = document.querySelector('#message').value;

        const axios = req

    }


</script>
<div id="text">
    <%--<input type="hidden"name="searchNum" id="searchNum" value="${sessionScope.searchNum}">--%>
    <input type="hidden" id="searchNum" name="searchNum" value="김주환">
    내용: <input type="text" id="message" name="message" value="">
    <input type="button" onclick="send_click()" id="send" value="send">

    <form method="post" action="/in">
        <input type="submit" value="폼 전송">
    </form>
    <br><%--
        <table id="messageList">
            <c:forEach items="${chatList}" var="">
                <tr>
                    <td>${chat.userid}</td>
                    <td>${chat.message}</td>
                    <td>${chat.indate}</td>
                </tr>
            </c:forEach>
        </table>--%>
</div>
</body>
</html>
