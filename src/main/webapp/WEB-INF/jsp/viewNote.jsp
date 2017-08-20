
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                <h1>Notes</h1>
            </div>
        </div>
    </section>
    <section class="container">
        <div class="row">
            <div class="col-md-5">
                <h3>${note.title}</h3>
                <p>Note ID: ${note.noteId}</p>
                <p>Category: <a href="<c:url value="/notes/${note.category}"/> ">${note.category}</a></p><br/>
                ${note.body}<br/>
                <br/>
                <p>
                    <a href="<c:url value="/notes"/> " class="btn btn-default">
                        <span class="glyphicon-hand-left glyphicon"></span> Back
                    </a>
                </p>
            </div>
        </div>
    </section>
</body>
</html>
