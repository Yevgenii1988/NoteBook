<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<section class="container">
    <form:form method="post" modelAttribute="searchEngine" class="form-horizontal">
        <fieldset>
            <legend>Enter the keyword to search in the notes by</legend>

            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2"
                       for="keyword">Keyword</label>
                <div class="col-lg-10">
                    <form:input id="keyword" path="keyword"
                                type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-10">
                    <input type="submit" id="btnSearch" class="btn btn-primary" value ="Search" />
                </div>
            </div>
        </fieldset>
    </form:form>
</section>