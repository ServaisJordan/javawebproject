<%@include file="include/importTags.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 06-08-19
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <c:if test="${not empty cheeses}">
        <c:forEach items="${cheeses}" var="cheese">
            <div class="cheese">
                <p>${cheese.getName()}</p>
                <spring:url value="/images/${cheese.getURLImage()}.jpg" var="imageURL"/>
                <img src=${imageURL}>
                <p><spring:message code="pricePerKilo"/> : ${cheese.getPricePerKilo()}</p>
                <spring:url value="/catalog/${cheese.getId()}" var="getCheese"/>
                <button onclick="location.href = '${getCheese}'"><spring:message code="moreInformation"/></button>
            </div>
        </c:forEach>
    </c:if>

</body>
</html>
