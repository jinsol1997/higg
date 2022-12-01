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

    <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="/css/bootstrap/offcanvas.css" rel="stylesheet">

    <style>
        img{
            width: 40px;
            height: 40px;
        }
    </style>

</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark">
    <a class="navbar-brand mr-auto mr-lg-0" href="/higg/main">HIGG</a>
    <button class="navbar-toggler p-0 border-0" type="button" data-toggle="offcanvas">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
        </ul>
        <form class="form-inline my-2 my-lg-0" method="post" action="/higg/main">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search" name="searchName">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>


<main role="main" class="container">

    <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-primary rounded box-shadow">
        <img class="mr-3"
             src="http://ddragon.leagueoflegends.com/cdn/12.22.1/img/profileicon/${summonerDTO.profileIconId}.png"
             alt="" width="48" height="48">
        <div class="lh-100">
            <h6 class="mb-0 text-white lh-100">${summonerDTO.name}</h6>
            <small>${summonerDTO.summonerLevel}</small>
        </div>
    </div>

    <c:forEach var="matchDTO" items="${matchDTO}">
        <table class="table table-sm table-secondary table-bordered text-center table-striped">
            <thead>
            <th>승패</th>
            <th>닉네임</th>
            <th>챔피언</th>
            <th>스펠</th>
            <th>k/d/a</th>
            <th>아이템</th>
            <th>총 딜량</th>
            <th>획득한 골드</th>
            </thead>
            <c:forEach var="participants" items="${matchDTO.info.participants}" varStatus="loop">

                <c:if test="${loop.count > 5}">
                    <tr style="background-color: #fff1f3">
                </c:if>
                <c:if test="${loop.count <= 5}">
                    <tr style="background-color: #ecf2ff">
                </c:if>
                <td>
                    <c:if test="${participants.win}">
                        <span class="badge bg-primary">승리</span>
                    </c:if>
                    <c:if test="${!participants.win}">
                        <span class="badge bg-danger">패배</span>
                    </c:if>
                </td>
                <td>${participants.summonerName}</td>
                <td><img
                        src="https://ddragon.leagueoflegends.com/cdn/12.22.1/img/champion/${participants.championName}.png">
                    <span class="badge badge-light">lv${participants.champLevel}</span></td>
                <td>

                </td>
                <td>
                        ${participants.kills} / ${participants.deaths} / ${participants.assists}
                    <span class="badge badge-primary">${(participants.kills + participants.assists) / participants.deaths}</span>
                </td>
                <td>
                    <c:if test="${participants.item0 != 0}">
                        <img src="https://ddragon.leagueoflegends.com/cdn/12.22.1/img/item/${participants.item0}.png">
                    </c:if>
                    <c:if test="${participants.item1 != 0}">
                        <img src="https://ddragon.leagueoflegends.com/cdn/12.22.1/img/item/${participants.item1}.png">
                    </c:if>
                    <c:if test="${participants.item2 != 0}">
                        <img src="https://ddragon.leagueoflegends.com/cdn/12.22.1/img/item/${participants.item2}.png">
                    </c:if>
                    <c:if test="${participants.item3 != 0}">
                        <img src="https://ddragon.leagueoflegends.com/cdn/12.22.1/img/item/${participants.item3}.png">
                    </c:if>
                    <c:if test="${participants.item4 != 0}">
                        <img src="https://ddragon.leagueoflegends.com/cdn/12.22.1/img/item/${participants.item4}.png">
                    </c:if>
                    <c:if test="${participants.item5 != 0}">
                        <img src="https://ddragon.leagueoflegends.com/cdn/12.22.1/img/item/${participants.item5}.png">
                    </c:if>
                    <c:if test="${participants.item6 != 0}">
                        <img src="https://ddragon.leagueoflegends.com/cdn/12.22.1/img/item/${participants.item6}.png">
                    </c:if>
                </td>

                <td><progress max="100000" value="${participants.totalDamageDealtToChampions}"></progress>${participants.totalDamageDealtToChampions}</td>
                <td>${participants.goldEarned + 500}</td>

                </tr>


            </c:forEach>
        </table>
        <br><br><br>
    </c:forEach>


    </div>

</main>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="js/assets/vendor/jquery-slim.min.js"><\/script>')</script>
<script src="js/assets/vendor/popper.min.js"></script>
<script src="js/bootstrap/bootstrap.min.js"></script>
<script src="js/assets/js/vendor/holder.min.js"></script>
<script src="js/bootstrap/offcanvas.js"></script>

</body>
</html>
