<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- If you get error here that simply means u havent configured targeted runtime yet
    to resolve this issue just go to project ->right click -> build path-> project facets
    -> targeted runtime->New select your runtime (I used Apache server)-> Apply  Done!
    -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A Simple MVC Java EE App</title>
</head>
<body>

This is just basic JAVAEE MVC app. 
Kept it simple only 2 components controller+View
Please check code for more understanding, Code itself contains comments which are self explainatory.
(Now create Servlet)
<br/>
<a href="<%= request.getContextPath() %>/BasicServlet?PageNo=Page1">Page1</a>
<a href="<%= request.getContextPath() %>/BasicServlet?PageNo=Page2">Page2</a>
<a href="<%= request.getContextPath() %>/BasicServlet?PageNo=ErrorPage">ErrorPage</a>
<!-- 
Why i created request.getContextPath()? it will return
		//ex. http://localhost:8080/index.jsp is given by getServletContext()
Keep eye on URL when application is launched how it is changing You will get the idea about PageNo
parameter also

 -->


</body>
</html>