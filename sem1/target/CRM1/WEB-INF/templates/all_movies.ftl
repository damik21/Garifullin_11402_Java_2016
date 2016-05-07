<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>

This is movies<br>


<a href="/admin">Back to admin page</a><hr/>
<a href="/admin/movies/add">Add movie</a>

<table border="1" cellpadding="0" cellspacing="0">

    <tr>
        <td> id </td>
        <td> name </td>
        <td> country </td>
        <td> year </td>
    </tr>

<#if movies ??>
    <#list movies as movie>

        <tr>
            <td> ${movie.getId()} </td>
            <td> ${movie.getName()} </td>
            <td> ${movie.getCountry()} </td>
            <td> ${movie.getYear()} </td>
        </tr>
    </#list>
<#else >
    WTF MAN?!
</#if>
</table>

</body>
</html>