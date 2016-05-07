<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
PROFILE HERE<br>

<form action="/logout">
    <input type="submit" value="Logout">
</form>
<br>
<#if user.getPosition() == "POSITION_ADMIN" >

<a href="/admin">Admin pannel</a>
</#if>
<#if user.getPosition()== "POSITION_PERSONAL">

<a href="/personal">Personal pannel</a>
</#if>
<#if user.getPosition() == "POSITION_CLIENT">
<a href="client/tickets/add">Buy ticket</a><br>
</#if>
<br>
<hr/>
First name: ${user.getName()}<br>
Last name: ${user.getSurname()}<br>
Login : ${user.getLogin()}<br>
</body>
</html>