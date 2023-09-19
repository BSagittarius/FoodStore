<%-- 
    Document   : feedbackLogic
    Created on : 15 Sep, 2023, 4:55:17 PM
    Author     : HP
--%>

<%@page import="java.sql.Connection,java.sql.PreparedStatement,java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%
    String name=request.getParameter("name");
    String id=request.getParameter("email");
    String rat=request.getParameter("rating");
    String com=request.getParameter("comments");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","root");
    PreparedStatement ps=con.prepareStatement("insert into foodstore values(?,?,?,?)");
    ps.setString(1,name);
    ps.setString(2,id);
    ps.setString(3,rat);
    ps.setString(4,com);
    ps.executeUpdate();
    response.sendRedirect("Welcome.jsp");
   
    %>

