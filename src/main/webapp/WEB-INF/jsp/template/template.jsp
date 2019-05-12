<%@include file="../include/importTags.jsp"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="content-type" content="type=text/html; charset=utf-8">
        <title>${title}</title>
    </head>
    <body>
        <spring:url value="" var="localeFr">
            <spring:param name="locale" value="fr"/>
        </spring:url>
        <spring:url value="" var="localeEn">
            <spring:param name="locale" value="en"/>
        </spring:url>
        <a href="${localeFr}">fr</a>
        <a href="${localeEn}">en</a>
    
        <spring:url value="/leGrandRoiFromage/login/form" var="signinLink"/>
        <spring:url value="/leGrandRoiFromage/register/form" var="registerLink"/>
        <a href="${signinLink}">${signin}</a> <a href="${registerLink}">${signup}</a>
        <div>
            <tiles:insertAttribute name = "main-content"/>
        </div>
        <footer>Servais Jordan</footer>
    </body>
</html>
