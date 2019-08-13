<%@include file="include/importTags.jsp"%>
<html>
    <head>
        <meta http-equiv="content-type" content="type=text/html; charset=utf-8"/>
    </head>
    <body>
        <%--@elvariable id="loginForm" type="LoginForm"--%>
        <form:form id = "login" method="POST" action="/leGrandRoiFromage/login" modelAttribute="loginForm">
            <p>
                <form:label path="username"><spring:message code="username"/></form:label>
                <form:input id="usernameInput" path="username" required="true"/>
                <form:errors cssClass="error" path="username"/>
            </p>
            <p>
                <form:label path="password"><spring:message code="password"/></form:label>
                <form:password id="passwordInput" path="password" required="true"/>
                <form:errors cssClass="error" path="password"/>
            </p>
            <p>
                <form:button><spring:message code="submit"/></form:button>
            </p>
            <c:if test="${not empty message}">${message}</c:if>
        </form:form>
    </body>
</html>