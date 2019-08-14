<%@ include file="include/importTags.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 06-08-19
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <div class="cheese">
        <spring:url value="/images/${cheese.getURLImage()}" var="imageURL"/>
        <p>${cheese.getName()}</p>
        <img src=${imageURL}/>
        <p>${cheese.getTranslationsList().get(0).getDescription()}</p>
        <p><spring:message code="pricePerKilo"/> : ${cheese.getPricePerKilo()}</p>
        <sec:authorize access="isAuthenticated()">
            <%--@elvariable id="quantity" type="int"--%>
            <form:form id = "basketForm" method="POST" action="/leGrandRoiFromage/Basket/addToBasket" modelAttribute="quantity">
                <form:label path=""><spring:message code="quantity"/></form:label>
                <form:input type="number" min="0" path=""/>
                <form:button><spring:message code="submit"/></form:button>
            </form:form>
        </sec:authorize>
    </div>
</body>
</html>
