<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
This is halls<br>


<a href="/admin">Back to admin page</a><hr/>

<table border="1" cellpadding="0" cellspacing="0">

    <tr>
        <td> id </td>
        <td> name </td>
        <td> places </td>
    </tr>

<#if all_halls ??>
    <#list all_halls as hall>

        <tr>
            <td> ${hall.getId()} </td>
            <td> ${hall.getName()} </td>
            <td> ${hall.getPlaces()} </td>
        </tr>
    </#list>
<#else >
    WTF MAN?!
</#if>
</table>
</body>
</html>