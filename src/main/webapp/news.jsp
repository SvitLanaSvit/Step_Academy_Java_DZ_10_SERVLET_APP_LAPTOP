<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 17.10.2023
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
  <div class="container">
      <c:forEach items="${news}" var="n">
        <form action="news" method="post">
        <input type="hidden" name="newsId" value="${n.id}" />
        <p>ID: ${n.id}</p>
        <h1>${n.title}</h1>
        <img style="width: 150px" src="${n.imageUrl}" alt="photo-${title}" />
        <p>${n.shortDescription}</p>
        <input type="submit" class="btn btn-outline-primary" value="Read More" />
        </form>
      </c:forEach>

    <div>
      <a href="menu.jsp" class="btn btn-secondary">Go to menu</a>
    </div>
  </div>
</body>
</html>
