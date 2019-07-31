<%@page languageEntity="java" contentType="text-html; charset=utf-8" pageEncoding="utf-8" %>
<%@include file="include/importTags.jsp"%>
<html>
    <head>
        <meta http-equiv="content-type" content="type=text/html; charset=utf-8"/>
    </head>
    <body>
        <%--@elvariable id="loginForm" type="LoginForm"--%>
        <form:form id = "login" method="POST" action="/leGrandRoiFromage/login/formResponse" modelAttribute="loginForm">
            <p>
                <form:label path="userName">${username}</form:label>
                <form:input id="userNameInput" path="userName"/>
            </p>
            <p>
                <form:label path="password">${password}</form:label>
                <form:input id="passwordInput" path="password"/>
            </p>
            <p>
                <form:button>${submit}</form:button>
            </p>
        </form:form>
    </body>
</html>