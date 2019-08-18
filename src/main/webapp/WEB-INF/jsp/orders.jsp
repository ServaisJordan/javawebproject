<%@ include file="include/importTags.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 16-08-19
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<c:if test="${not empty orders}">
    <c:forEach items="${orders}" var="order">
        <div class="order">
            <p><spring:message code="creationDate"/> ${formatDate.format(order.getCreationDate())}</p>
            <c:if test="${not empty order.getDeliveryDate()}">
                <p><spring:message code="deliveryDate"/> ${formatDate.format(order.getDeliveryDate())}</p>
            </c:if>
            <p>
                <c:if test="${!order.getIsPay()}"><spring:message code="negate"/></c:if> <spring:message code="paid"/>
            </p>
            <button onclick="location.href = '<spring:url value="/order/${order.getId()}'"/>"><spring:message code="moreInformation"/></button>
        </div>
    </c:forEach>
</c:if>
<c:if test="${empty orders}">
    <div class="center">
        <spring:message code="youHaveNoOrder"/>
    </div>
</c:if>
</body>
</html>
