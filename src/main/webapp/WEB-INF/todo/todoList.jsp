<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- jstl을 c라고 부르기로 함--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>todoList</title>
</head>
<body>
<h1>todoListPage</h1>

<ul>
    <%--반복문 c:forEach --%>
    <c:forEach var="dto" items="${todoList}">
        <li>${dto}</li>
    </c:forEach>
    <hr/>
    <%--변수 num을 1 ~ 10까지 반복해서 출력 --%>
    <c:forEach var="num" begin="1" end="10">
        <li>${num}</li>
    </c:forEach>
    <hr/>
    <%-- if--%>
    <c:if test="${todoList.size() % 2 == 0}">
        짝수
    </c:if>
    <%-- if의 반대 경우로 만든 else --%>
    <c:if test="${todoList.size() % 2 != 0}">
        홀수
    </c:if>
    <hr/>

    <c:choose>
        <%-- if 역할의 when--%>
        <c:when test="${todoList.size() % 2 == 0}">
            짝수
        </c:when>
        <%-- else 역할의 otherwise--%>
        <c:otherwise>
            홀수
        </c:otherwise>
    </c:choose>

    <hr/>

    <%--var로 변수명(key) 지정하고 value로 (value)지정--%>
    <c:set var="target" value="5"></c:set>
    <ul>
        <c:forEach var="num" begin="1" end="10">
            <c:if test="${num == target}">
                num is target
            </c:if>
        </c:forEach>
    </ul>


</ul>

</body>
</html>
