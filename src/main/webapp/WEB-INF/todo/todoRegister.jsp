
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>todoList</title>
</head>
<body>
    <h1>todoRegisterPage</h1>
    <form method="post" action="/todo/register"> <%--action 주소 잘못 적지 않도록 주의 --%>
        날짜: <p><input type="date" name="date"/></p>
        할 일:<p><input type="text" name="todo"/></p>
        <br/>
        <button type="submit">등록</button>
    </form>
</body>
</html>
