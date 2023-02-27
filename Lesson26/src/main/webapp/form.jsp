<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Form</title>
    <link rel="stylesheet" href="<c:url value="/css/index.css"/>">
</head>
<body>
<div>
    <a id="db" class="button purple" href="<c:url value="/students"/>">
        <i class="fa fa-address-book" aria-hidden="true"></i>
        <span>Работа с Базой Данных</span>
    </a>
</div>
<div>
    <a id="exit" class="button blue" href="<c:url value="/exit"/>">
        <i class="fa fa-window-close" aria-hidden="true"></i>
        <span>Выход</span>
    </a>
</div>
</body>
</html>