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
</head>
<body>
<style>
    #text {
        position: fixed;
        left: 1550px;
        top: 150px;
    }

    #tr_mar {
        margin: 10px;
    }
</style>
<script>
    $(document).ready(function () {

        console.log(11)

        $("#send").click(function () {
            console.log("send 입장")
            // insertChat();
        });
    })

    function insertChat() {
        $.ajax({
            url: "insertChat",
            data: {
                searchNum: $("#searchNum").val(),
                message: $("#message").val()
            },
            type: "post",
            success: function (serverdata) {
                if (serverdata == "ok")
                    $("#message").val("");
                $("#message").focus();
            }
        })
    }
</script>
<div id="text">
    <input type="hidden" id="searchNum" value="${sessionScope.searchNum}">
    내용: <input type="text" id="message">
    <input type="submit" id="send" value="send">
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
