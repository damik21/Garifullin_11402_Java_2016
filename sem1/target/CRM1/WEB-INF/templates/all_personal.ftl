<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
This is personal<br>

<a href="/admin">Back to admin page</a><hr/>
<a href="/admin/register">Add new personal</a>

<table border="1" cellpadding="0" cellspacing="0">
    <tr>
        <td> id </td>
        <td> username </td>
        <td> name </td>
        <td> surname </td>
        <td> birthday </td>
        <td> email </td>
        <td> profession </td>
        <td> phone </td>
        <td> salary </td>
    </tr>
<#list personal as item>

    <tr>
        <td> ${item.getId()} </td>
        <td> ${item.getLogin()} </td>
        <td> ${item.getName()} </td>
        <td> ${item.getSurname()} </td>
        <td> ${item.getBirthDay()}</td>
        <td> ${item.getEmail()} </td>
        <td> ${item.getProfession()} </td>
        <td> ${item.getPhone()} </td>
        <td> ${item.getSalary()} </td>
    </tr>
</#list>
</table>
</body>
</html>