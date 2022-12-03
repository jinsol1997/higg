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
    <script src="/js/reply.js"></script>
    <script layout:fragment="script  th:inline=javascript">


    </script>
</head>
<body>
<style>


</style>
<script>

    function send_click() {





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
    <br>

    <table>
        <thead>
        <tr>
            <th>아이디</th>
            <th>글</th>
            <th>게시글번호</th>
        </tr>
        </thead>

    </table>
    <div layout:fragment="content"></div>


    <div class="row mt-3">
        <div class="col-md-12">
            <div class="my-4">
                <button class="btn btn-info addReplyBtn">ADD Reply</button>
            </div>
            <ul class="list-group replyList">
            </ul>

        </div>

    </div>

</div>
</body>
</html>
