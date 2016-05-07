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

<@sf.form action="/admin/movies/add" method="post" modelAttribute="movieform" id="mov_reg_form">

Name
    <@sf.input path="name" type="text" id="name" placeholder="name"/>
    <@sf.errors path="name" />
Country
    <@sf.input path="country" type="text" id="country" placeholder="country"/>
    <@sf.errors path="country" />
Year
    <@sf.input path="year" type="text"  id="year" placeholder="year"/>
    <@sf.errors path="year" />

<input type="submit" value="Register">
</@sf.form>


</body>
</html>