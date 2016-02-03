$(document).ready(function() {
	$("#btStartThread").click(function() {
		startThread();
	});
	
	$("#btStopThread").click(function() {
		stopThread();
	});

	function startThread() {
		$.ajax({
			url : "/Demon/startThread",
			context : document.body,
			success : function(data) {
				alert("start successfully");
			}
		});
	}

	
	function stopThread(){
		$.ajax({
			url : "/Demon/stopThread",
			context : document.body,
			success : function(data) {
				alert("stop successfully");
			}
		});
	}
	
	
});