<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
This is tickets<br>

<a href="/personal">Back to personal page</a><hr/>
<a href="/personal/tickets">show all unpaid tickets</a>.<br/>
<a href="/personal/tickets/all">All tickets</a>


<#if ticket??>


        <p> ${ticket.getId()} </p>
        <p> ${ticket.getMovieSessionsId()} </p>
        <p> ${ticket.getCount()} </p>
<form action="/personal/tickets/${ticket.getId()}" method="POST">
    <input type="submit" value="PAID">
</form>

</#if>
</body>
</html>