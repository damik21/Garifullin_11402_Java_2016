<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
This is tickets<br>

<a href="/personal">Back to personal page</a>
<hr/>
<a href="/personal/tickets/all">All tickets</a>

<#if message??>
<p>${message}</p>
</#if>

<table border="1" cellpadding="0" cellspacing="0">
    <tr>
        <td> id</td>
        <td> movie session id</td>
        <td> paid</td>
        <td> count</td>
    </tr>
<#if tickets??>
    <#list tickets as item>

        <tr>
            <td><a href="/personal/tickets/${item.getId()}"> ${item.getId()} </a></td>
            <td> ${item.getMovieSessionsId()}</td>
            <td> ${item.getPaid()?c}</td>
            <td> ${item.getCount()}</td>
        </tr>

    </#list>
</#if>
</table>
</body>
</html>