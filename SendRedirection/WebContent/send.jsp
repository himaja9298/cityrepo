<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String str=request.getParameter("ss");
  response.sendRedirect("https://google.com/search?q="+str);
  %>
  