<%@include file="../include/importTags.jsp"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="content-type" content="type=text/html; charset=utf-8">
        <title>${title}</title>
    </head>
    <body>
        <header>
            <spring:url value="" var="localeFr">
                <spring:param name="locale" value="fr"/>
            </spring:url>
            <a href="${localeFr}">fr</a>

            <spring:url value="" var="localeEn">
                <spring:param name="locale" value="en"/>
            </spring:url>
            <a href="${localeEn}">en</a>

            <sec:authorize access="!authenticatedController()">
                <spring:url value="/leGrandRoiFromage/login/form" var="signinLink"/>
                <a href="${signinLink}">${signin}</a>

                <spring:url value="/leGrandRoiFromage/register/form" var="registerLink"/>
                <a href="${registerLink}">${signup}</a>
            </sec:authorize>

            <sec:authorize access="authenticatedController()">
                welcome ${pageContext.request.userPrincipal.name}

                <spring:url value="/leGrandRoiFromage/authenticated/page" var="authenticatedPageUrl"/>
                <a href="${authenticatedPageUrl}">${authenticatedPageTitle}</a>

                <sec:authorize access="hasRole('ADMIN')">
                    <spring:url value="/leGrandRoiFromage/admin/page" var="adminPageUrl"/>
                    <a href="${adminPageUrl}">${adminPageTitle}</a>
                </sec:authorize>

            </sec:authorize>
        </header>

        <div>
            <tiles:insertAttribute name = "main-content"/>
        </div>

    </body>
</html>
