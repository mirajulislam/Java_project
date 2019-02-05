<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
    String Full_Name = request.getParameter("Full_Name");
    String Blood_Group = request.getParameter("Blood_Group");
    String Last_Donation = request.getParameter("Last_Donation");
    String Mobile_Number = request.getParameter("Mobile_Number");
    String Email = request.getParameter("Email");
    String Address = request.getParameter("Address");
    String City = request.getParameter("City");
    String user_id = request.getParameter("user_id");
    String Price = request.getParameter("Price");

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Calendar cal = Calendar.getInstance();
    String present = sdf.format(cal.getTime());
    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "");
        Statement st = conn.createStatement();
        int i = st.executeUpdate("insert into blood_detail(Full_Name,Blood_Group,Last_Donation,Mobile_Number,Email,Address,City,user_id,Price,time)values('" + Full_Name + "','" + Blood_Group + "','" + Last_Donation + "','" + Mobile_Number + "','" + Email + "','" + Address + "','" + City + "','" + user_id + "','" + Price + "','" + present + "')");
        out.println("Data is successfully inserted!");
    } catch (Exception e) {
        System.out.print(e);
        e.printStackTrace();
    }
%>