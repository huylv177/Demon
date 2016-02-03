<%@page session="false"%>
<html>
<head>
<title>${title}</title>
</head>
<body>
   <h2>${message}</h2>
   </br>
   <a href="${pageContext.request.contextPath}/logout" >Logout</a>
</body>
</html>