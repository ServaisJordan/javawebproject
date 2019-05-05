<%@include file="../include/importTags.jsp"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="content-type" content="type=text/html; charset=utf-8">
        <title>${title}</title>
        <link type="text/css" href="<c:url value='/CSS/main.css'/>" rel="stylesheet"/>
    </head>
    <body>
        <div>
            <tiles:insertAttribute name = "main-content"/>
        </div>
        <footer>Servais Jordan</footer>
    </body>
</html>
