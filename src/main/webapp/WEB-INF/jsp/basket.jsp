<%@include file="include/importTags.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 07-08-19
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <c:if test="${not empty BASKET}" >
        <c:forEach items="${BASKET.entrySet()}" var="basketEntry">
            <img src=../../images/${basketEntry.getUrlImage}>
            <p>${basketEntry.getKey().getName()}</p>
            <p>${basketEntry.getValue()}</p>
        </c:forEach>
        <spring:url value="leGrandRoiFromage/Command/makeCommand" var="makeCommandUrl"/>
        <button onclick="location.href='${makerCommandUrl}'"><spring:message code="makeCommand"/></button>
    </c:if>
</body>
</html>
