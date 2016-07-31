<!DOCTYPE html>
<html>
<body>

<p>Hi welcome to Java</p>

<button onclick="myFunction()">Click me</button>

<p id="demo"></p>

<script>
function myFunction() {
	document.getElementById("testform").action="./angular.do";
	document.getElementById("testform").submit();  
}

var mohan = "${Key}"
alert(mohan);
	
</script>
<form id = "testform" method="post">
<input type="text" name="UserName" id="UserName">
 <input type="submit" id="testBtn" value = "test" onClick = "myFunction()"/>
</form>
</body>
</html>