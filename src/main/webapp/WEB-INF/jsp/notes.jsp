
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


    <section class="container">
        <div class="row">
            <c:forEach items="${notes}" var="note">
                <div class="col-sm-6 col-md-3">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>${note.title}</h3>
                            <p><a href="<c:url value="/notes/${note.category}"/>">${note.category}</a></p>
                            <p>${note.body}</p>
                            <p>
                                <a href="<c:url value="/viewNote?id=${note.noteId}"/> " class="btn btn-primary">
                                    <span class="glyphicon-info-sign glyphicon"></span> Details
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </section>
