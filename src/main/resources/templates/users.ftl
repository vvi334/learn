<html>
<head></head>
<body>
<table>
<#list users as users>
<tr>
<td>${users.username}</td><td>${users.password}</td>
</tr>
</#list>
</table>
</body>
</html>