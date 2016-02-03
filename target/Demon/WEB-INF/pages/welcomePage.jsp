<%@page session="false"%>
<html>
	<head>
	<title>${title}</title>
		<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
	</head>
	<body>
		<h1>Message : ${message}</h1>
			<a href="${pageContext.request.contextPath}/login" >Login</a>
			</br>	
			<button id="bt1" onclick="onLoad()" style="width: 105px; ">Click me</button>
			</br>
			<a href="${pageContext.request.contextPath}/threadStatus" >Thread status</a>
	</body>
</html>