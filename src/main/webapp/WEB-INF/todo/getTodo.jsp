<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- jstl을 c라고 부르기로 함--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>getTodo</title>
</head>
<body>
<h1>getTodo</h1>

<p>${todoDTO.tno}</p>
<p>${todoDTO.title}</p>
<p>${todoDTO.dueDate}</p>
<p>${todoDTO.finished}</p>

</body>
</html>
