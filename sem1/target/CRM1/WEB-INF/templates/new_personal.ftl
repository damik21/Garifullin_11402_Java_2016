<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>


<h3>Registration personal</h3>
<p>Your new personal <a href="/login">Log in</a>.
</p>
<hr>

<@sf.form action="/admin/register" method="post" modelAttribute="personalform" id="per_reg_form">

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
Profession
    <@sf.input path="profession" type="text"  id="profession" placeholder="profession"/>
    <@sf.errors path="profession" /><br/>
Salary
    <@sf.input path="salary" type="text" id="salary" placeholder="salary"/>
    <@sf.errors path="salary" /><br/>
Phone number
    <@sf.input path="phone" type="text" id="phone" placeholder="phone"/>
    <@sf.errors path="phone"/><br/>

<br/>
<input type="submit" value="Register">
</@sf.form>


</body>
</html>