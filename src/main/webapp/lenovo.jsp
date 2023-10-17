<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 17.10.2023
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>${lenovo.name}</h1>
        <p>Country: ${lenovo.headquartersCountry}</p>
        <img style="width: 150px" src="${lenovo.logoUrl}" alt="Logo" />
        <p>Number of Employees: ${lenovo.numberOfEmployees}</p>
        <p>Brief information: ${lenovo.briefInformation}</p>
        <div>
            <a href="menu.jsp" class="btn btn-secondary">Go to menu</a>
        </div>
    </div>
</body>
</html>
