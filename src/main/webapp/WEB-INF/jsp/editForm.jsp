<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<section class="container">
    <form:form method="post" modelAttribute="noteToBeUpdated" class="form-horizontal">
        <fieldset>
            <legend>Edit Note with id ${noteToBeUpdated.noteId}</legend>

            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2"
                       for="title">Title</label>
                <div class="col-lg-10">
                    <form:input id="title" path="title" value="${noteToBeUpdated.title}"
                                type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2"
                       for="category">Category</label>
                <div class="col-lg-10">
                    <form:input id="category" path="category" value="${noteToBeUpdated.category}"
                                type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2"
                       for="body">Contents</label>
                <div class="col-lg-10">
                    <form:textarea id="body" path="body" value="${noteToBeUpdated.body}" rows = "5"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-10">
                    <input type="submit" id="btnSave" class="btn btn-primary" value ="Save" />
                </div>
            </div>
        </fieldset>
    </form:form>
</section>