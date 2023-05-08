<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Employee</h1>
       <form:form method="post" action="save">  
      	<table >  
         <tr>  
          <td>UserName : </td> 
          <td><input path="userId"  /></td>
         </tr>  
      
         <tr>  
          <td>Designation :</td>  
          <td><input path="email" /></td>
         </tr> 
         <tr>  
          <td>role :</td>  
          <td><input path="role" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td> <a href="managerList"><input type="submit"value="Save" /></a></td>  
         </tr>  
        </table>  
       </form:form>  
</body>
</html>
