<html>
<head>
<title>thread status</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</head>

<body>
	Thread is
	<%
	String threadRunning;
	String buttonStartStop;
	Boolean isRunning = (Boolean) request.getAttribute("isRunning");
	if (isRunning) {
		threadRunning = "running";
	} else {
		threadRunning = "stopped";
	}
	%>
	<%=threadRunning%>
	</br>
	<button id="btStartThread">Start</button>
	<button id="btStopThread">Stop</button>
	</br>
	<a href="${pageContext.request.contextPath}/welcomePage">Return to
		welcome page</a>
</body>
</html>