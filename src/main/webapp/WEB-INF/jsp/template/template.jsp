<%@include file="../include/importTags.jsp"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="content-type" content="type=text/html; charset=utf-8" charset="UTF-8">
        <link rel="stylesheet" href="<spring:url value="css/main.css"/>" type="text/css" />
        <title>${title}</title>
    </head>
    <body>
    <div class="topnav">
        <spring:url value="" var="localeFr">
            <spring:param name="locale" value="fr"/>
        </spring:url>
        <a href="${localeFr}">fr</a>

        <spring:url value="" var="localeEn">
            <spring:param name="locale" value="en"/>
        </spring:url>
        <a href="${localeEn}">en</a>

        <sec:authorize access="!isAuthenticated()">
            <spring:url value='/login' var="signinLink"/>
            <a href="${signinLink}"><spring:message code="signin"/></a>

            <spring:url value='/register' var="registerLink"/>
            <a href="${registerLink}"><spring:message code="signup"/></a>
        </sec:authorize>

        <sec:authorize access="isAuthenticated()">
            welcome ${pageContext.request.userPrincipal.name}

            <spring:url value="/authenticated/page" var="authenticatedPageUrl"/>
            <a href="${authenticatedPageUrl}"><spring:message code="authenticatedPageTitle"/></a>

            <sec:authorize access="hasRole('ADMIN')">
                <spring:url value="/admin/page" var="adminPageUrl"/>
                <a href="${adminPageUrl}"><spring:message code="adminPageTitle"/></a>
            </sec:authorize>

        </sec:authorize>
    </div>

    <div class="sidenav">
        <a href="#"><spring:message code="home"/></a>
        <a href="<spring:url value="/catalog"/>"><spring:message code="catalog"/></a>
        <a href="<spring:url value="/basket"/>"><spring:message code="basket"/></a>
        <a href="<spring:url value="/presentation"/>"><spring:message code="presentation"/></a>
    </div>

    <!-- Page content -->
    <div class="main">
        <tiles:insertAttribute name = "main-content"/>
    </div>

    </body>
</html>
