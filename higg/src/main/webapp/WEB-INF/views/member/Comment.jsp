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
    <%--<script src="http://code.jquery.com/jquery-latest.js"></script>--%>
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"
            integrity="sha256-C6CB9UYIS9UJeqinPHWTHVqh/E1uhG5Twh+Y5qFQmYg=" crossorigin="anonymous"></script>
</head>
<body>
<style>


</style>
<script>

    function send_click() {
        var httpRequest;
        /*input에 작성된 name데이터 가져옴*/
        var searchNum = document.querySelector('#searchNum').value;
        var message = document.querySelector('#message').value;

        axios.post('/in',
            {
                "searchNum": searchNum,
                "message": "message",
            })
            .than(res => console.log(res))
            .catch(err => console.log(err))
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
