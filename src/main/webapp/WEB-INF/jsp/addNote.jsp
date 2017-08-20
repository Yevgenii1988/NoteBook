
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link rel="stylesheet"
          href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Notes</title>
</head>
<body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <p>Add new note</p>
            </div>
        </div>
    </section>
    <section class="container">
        <form:form method="post" modelAttribute="newNote" class="form-horizontal">
            <fieldset>
                <legend>Add new note</legend>

                <div class="form-group">
                    <label class="control-label col-lg-2 col-lg-2"
                           for="title">Title</label>
                    <div class="col-lg-10">
                        <form:input id="title" path="title"
                                    type="text" class="form:input-large"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-lg-2 col-lg-2"
                           for="category">Category</label>
                    <div class="col-lg-10">
                        <form:input id="category" path="category"
                                    type="text" class="form:input-large"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-lg-2"
                           for="body">Contents</label>
                    <div class="col-lg-10">
                        <form:textarea id="body"
                                       path="body" rows = "5"/>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-10">
                        <input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
                    </div>
                </div>
            </fieldset>
        </form:form>
    </section>
</body>
</html>
