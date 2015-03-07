<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<%--<h1>${message}</h1>--%>
<table>
    <thead>
        <tr>
            <th>id</th>
            <th>hdd</th>
            <th>ram</th>
            <th>gpu</th>
            <th>monitor</th>
            <th>model</th>
            <th>cpu</th>
        </tr>
    </thead>

    <tbody>

<c:forEach items="${notebooks}" var="item">
    <tr>
        <td><c:out value="${item.id}"/></td>
        <td><c:out value="${item.hdd}"/></td>
        <th><c:out value="${item.ram}"/></th>
        <th><c:out value="${item.gpu}"/></th>
        <th><c:out value="${item.monitor}"/></th>
        <th><c:out value="${item.model}"/></th>
        <th><c:out value="${item.cpu}"/></th>
    </tr>
</c:forEach>
    </tbody>

</table>
</body>
</html>