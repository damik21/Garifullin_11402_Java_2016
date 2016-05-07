<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>

This is movie sessions!<br>


<a href="/admin">Back to admin page</a><hr/>
<a href="/admin/movie_sessions/add">Add movie session</a>
<table border="1" cellpadding="0" cellspacing="0">

    <tr>
        <td> id </td>
        <td> hall id </td>
        <td> movie id </td>
        <td> price </td>
        <td> date </td>
        <td> time </td>
    </tr>

<#if moviesessions ??>
    <#list moviesessions as moviesession>

        <tr>
            <td> ${moviesession.getId()} </td>
            <td> ${moviesession.getHallId()} </td>
            <td> ${moviesession.getMovieId()} </td>
            <td> ${moviesession.getPrice()} </td>
            <td> ${moviesession.getDate()} </td>
            <td> ${moviesession.getTime()} </td>
        </tr>
    </#list>
<#else >
    WTF MAN?!
</#if>
</table>
</body>
</html>