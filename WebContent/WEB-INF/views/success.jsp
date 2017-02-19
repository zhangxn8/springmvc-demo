<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/JavaScript" src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<h4>Success Page</h4>
  <div>
      <input id="aj" type="button" onclick="check()" value="ajax">
  </div>
    
 <script>
    check=function(){
     alert("-----18进入------");
	 var url = "http://localhost:8080/springmvc-demo/helloworld/hello";
	 $.ajax({
	     type: "post",
	     url: url,
	     data: {"para":1},
	     cache: false,
	     async : false,
	     dataType: "json",
	     success: function (data)
	     {
	            if(data.flag){
	            	alert("正确传回 " );
	            }
	            alert("合法！");
	            
	     },
	     error:function (XMLHttpRequest) {      
	         alert("请求失败！");
	     }
	  });
 }

 </script>
</body>
</html>
