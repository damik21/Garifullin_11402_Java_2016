<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
This is clients<br>

<a href="/admin">Back to admin page</a><hr/>
<table border="1" cellpadding="0" cellspacing="0">

    <tr>
        <td> username </td>
        <td> name </td>
        <td> surname </td>
    </tr>
<#list clients as item>

<tr>
    <td> ${item.getLogin()} </td>
    <td> ${item.getName()} </td>
    <td> ${item.getSurname()} </td>
</tr>
</#list>
</table>
</body>
</html>