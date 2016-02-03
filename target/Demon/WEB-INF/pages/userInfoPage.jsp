<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
 
<html>
<head><title>${title}</title></head>
<body>
   <h2>Message : ${message}</h2>
 
   <c:if test="${pageContext.request.userPrincipal.name != null}">
      <h3>User Info : ${pageContext.request.userPrincipal.name}
          </br>
		<a href="${pageContext.request.contextPath}/admin" >Go to admin page</a>
          </br>
          <a href="<c:url value="/logout" />" >Logout</a></h3>  
		
		
<!--           <button onClick="javascript:document.location.href=/logout">Logout</button> -->
   </c:if>  
</body>
</html>