<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 17.10.2023
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lenovo Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>${lenovo.name}</h1>
        <p>Development history: ${lenovo.developmentHistory}</p>
        <h3>Images</h3>
        <div style="display: flex; flex-wrap: wrap; justify-content: space-around">
            <c:forEach items="${lenovo.imageUrls}" var="imageUrl">
                <img style="width: 300px" src="${imageUrl}" alt="LenovoDevelopment" />
            </c:forEach>
        </div>
        <h5>External Resource</h5>
        <a href="${lenovo.externalResourceLink}" class="btn btn-outline-primary">Learn more about ${lenovo.name}</a>
        <div style="margin-top: 20px">
            <a href="menu.jsp" class="btn btn-secondary">Go to menu</a>
        </div>
    </div>
</body>
</html>
