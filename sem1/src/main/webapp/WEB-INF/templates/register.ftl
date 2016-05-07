<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

<!DOCTYPE html>
<html lang="en">
<head>

    <title>Sign up </title>


</head>
<body>
<h3>Registration</h3>
<p>I you already have an account,please <a href="/login">Log in</a>.
</p>
<hr>
<@sf.form action="/register/client" method="post" modelAttribute="clientform" id="reg_form">

Name
    <@sf.input path="name" type="text"  id="name" placeholder="name"/>
    <@sf.errors path="name" />
<br/>
Surame
    <@sf.input path="surname" type="text"  id="surname" placeholder="surname"/>
    <@sf.errors path="surname"/>

<br/>
Login
    <@sf.input path="login" type="text"  id="login" placeholder="login"/>
    <@sf.errors path="login" />

<br/>
Email Address
    <@sf.input path="email" type="text"  id="email" placeholder="email"/>
    <@sf.errors path="email" />

<br/>
Your birth day
    <@sf.input path="birthDay" type="date"  id="birthDay" />
    <@sf.errors path="birthDay" />

<br/>
Password
    <@sf.input path="password" type="password"  id="password" placeholder="password"/>
    <@sf.errors path="password" />

<br/>
Confirm Password
    <@sf.input path="repassword" type="password"  id="repassword" placeholder="password"/>
    <@sf.errors path="repassword" />

<br/>
<input type="submit" value="Register">
</@sf.form>

</body>
</html>
