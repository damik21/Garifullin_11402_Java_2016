<!DOCTYPE html>
<html lang="en">
<head>
    <title>Sign in</title>

</head>

<body>

<h3 >Sign in to your account</h3>
<p >If you haven't account, <a href="/register/client">Register</a> </p>
<hr>

<form action="/login/process" method="post" id="reg_form">
    Login
    <input type="text" id="login"  placeholder="Login" name="login" required autofocus><br/>
    Password
    <input type="password" id="password"  placeholder="Password" name="password" required>
    <br>

<#if error??>
    <p>Invalid login or password! </p>
</#if>

    <input type="submit" value="Sign in">


</form>

</body>
</html>