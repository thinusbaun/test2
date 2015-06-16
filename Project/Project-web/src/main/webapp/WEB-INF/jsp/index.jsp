

<%@page import="com.outbootle.model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
<%@page import="com.outbootle.*"%>
<jsp:useBean id="customerFacade" type="com.outbootle.dao.CustomerFacadeRemote" scope="request" />
 
<!DOCTYPE html>
<html>
    <head>
        <title>JPA Guestbook Web Application Tutorial</title>
    </head>
 
    <body>
        <form method="POST" action="guest.html">
            Name: <input type="text" name="name" />
            <input type="submit" value="Add" />
        </form>
 
        <hr><ol> 
        <% for (Customer customer : customerFacade.findAll()) { %>
            <li> <%= customer %> </li>
        <% } %>
        </ol><hr>
 
        <iframe src="http://www.objectdb.com/pw.html?spring-netbeans"
            frameborder="0" scrolling="no" width="100%" height="30"> </iframe>
     </body>
</html>