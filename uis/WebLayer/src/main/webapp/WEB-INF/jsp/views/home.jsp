<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Seznam predmetu</h1>
        <div>
            <table>
                <thead>
                <tr>
                    <th>Predmet</th>
                    <th>Kredity</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="predmet" items="${predmets}">
                    <tr>
                        <td><c:out value="${predmet.kodPredmetu}"/></td>
                        <td><c:out value="${predmet.pocetKreditu}"/></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
