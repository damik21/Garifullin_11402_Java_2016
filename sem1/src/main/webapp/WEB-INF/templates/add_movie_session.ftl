<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<h3>Add movie</h3>
<hr>

<@sf.form action="/admin/movie_sessions/add" method="post" modelAttribute="moviesessionform" id="movs_reg_form">
Hall
    <@sf.select path="hallId" type="text"  id="hallId" placeholder="hallId">
        <#list halls as hall>
            <@sf.option value="${hall.getId()}">
            ${hall.getName()}
            </@sf.option>

        </#list>
    </@sf.select>
  <br/>
Movie
    <@sf.select path="movieId" type="text" id="movieId" placeholder="movieId">
        <#list movies as movie>
            <@sf.option value="${movie.getId()}">
            ${movie.getName()}
            </@sf.option>

        </#list>
    </@sf.select>
<br/>
price
    <@sf.input path="price" type="text" class="form-control" id="price" placeholder="price"/>
    <@sf.errors path="price" />

   <br/>
time
    <@sf.select path="time" type="text" id="time" placeholder="time">
        <#list times as time>
            <@sf.option value="${time}">
            ${time}
            </@sf.option>

        </#list>
    </@sf.select>
   <br/>
date
    <@sf.input path="date" type="date" class="form-control" id="date"/>
    <@sf.errors path="date" />
<br/>
<input type="submit" value="add">
</@sf.form>
</body>
</html>