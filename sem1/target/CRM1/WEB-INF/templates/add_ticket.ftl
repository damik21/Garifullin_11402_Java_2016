<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>


<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<@sf.form action="/client/tickets/add" method="post" modelAttribute="ticketform" id="tic_reg_form">

Movie session id
    <@sf.select path="movieSessionsId" type="text" id="movieSessionsId" placeholder="movieSessionsId">
        <#list moviesessions as moviesession>
            <@sf.option value="${moviesession.getId()}">
                ${moviesession.getMovieId()} : ${moviesession.getTime()}
            </@sf.option>

        </#list>
    </@sf.select>
    <@sf.errors path="movieSessionsId" class = "form-control alert alert-warning text-center"/>
<label>Count<span class="text-danger">:</span></label>
    <@sf.input path="count" type="text" class="form-control" id="count" placeholder="count"/>
    <@sf.errors path="count" class = "form-control alert alert-warning text-center"/>

    <br/>
<input type="submit" value="Add">
</@sf.form>
</body>
</html>