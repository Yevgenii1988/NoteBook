
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title><tiles:insertAttribute name="title"/> </title>
    <link rel="stylesheet"
          href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <div class="jumbotron">
            <div class="header">
                <ul class="nav nav-pills pull-right">
                    <tiles:insertAttribute name="navigation" />
                </ul>
            </div>
            <h1>
                <tiles:insertAttribute name="heading" />
            </h1>
            <p>
                <tiles:insertAttribute name="tagline" />
            </p>
        </div>
    </div>
    <div class="row">
        <tiles:insertAttribute name="content" />
    </div>
    <div class="footer">
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>
