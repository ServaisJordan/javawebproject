<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 11-08-19
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@include file="include/importTags.jsp"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="content-type" content="type=text/html; charset=utf-8"/>
    <script>
        onload = function () {
            birthDateInput = document.getElementById("birthDate");
        }

        function disableOrEnable() {
            if (birthDateInput.disabled == true) birthDateInput.disabled = false;
            else birthDateInput.disabled = true;
        }
    </script>
</head>
<body>
    <%--@elvariable id="user" type="User"--%>
    <form:form id = "login" method="POST" action="/leGrandRoiFromage/register" modelAttribute="user">
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
            <form:label path="name"><spring:message code="name"/></form:label>
            <form:input id="name" path="name" required="true"/>
            <form:errors cssClass="error" path="name"/>
        </p>
        <p>
            <form:label path="firstName"><spring:message code="firstName"/></form:label>
            <form:input id="firstName" path="firstName" required="true"/>
            <form:errors cssClass="error" path="firstName"/>
        </p>
        <p>
            <form:label type="email" path="email"><spring:message code="email"/></form:label>
            <form:input id="email" path="email" required="true"/>
            <form:errors cssClass="error" path="email"/>
        </p>
        <p>
            <form:label path="phoneNumber"><spring:message code="phoneNumber"/></form:label>
            <form:input id="phoneNumber" path="phoneNumber" required="true"/>
            <form:errors cssClass="error" path="phoneNumber"/>
        </p>
        <p>
            <form:label path="postalCode"><spring:message code="postalCode"/></form:label>
            <form:input id="postalCode" path="postalCode" required="true"/>
            <form:errors cssClass="error" path="postalCode"/>
        </p>
        <p>
            <form:label path="country"><spring:message code="country"/></form:label>
            <form:input id="country" path="country" required="true"/>
            <form:errors cssClass="error" path="country"/>
        </p>
        <p>
            <form:label path="address"><spring:message code="address"/></form:label>
            <form:input id="address" path="address" required="true"/>
            <form:errors cssClass="error" path="address"/>
        </p>
        <p>
            <p>
                <form:label path="gender"><spring:message code="gender"/> :</form:label>
            </p>
            <form:label path="gender"><spring:message code="man"/></form:label>
            <form:radiobutton path="gender" value="m"/>
            <form:label path="gender"><spring:message code="woman"/></form:label>
            <form:radiobutton path="gender" value="f"/>
        </p>
        <p>
            <form:label type="date" onclick="disableOrEnable()" path="birthDate"><spring:message code="birthDate"/> (<spring:message code="clickToEnable"/>)</form:label>
            <form:input type="date" id="birthDate" path="birthDate" disabled="true"/>
            <form:errors cssClass="error" path="birthDate"/>
        </p>
        <p>
            <form:button><spring:message code="submit"/></form:button>
        </p>
    </form:form>
</body>
</html>
