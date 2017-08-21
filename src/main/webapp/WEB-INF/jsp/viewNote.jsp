
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
