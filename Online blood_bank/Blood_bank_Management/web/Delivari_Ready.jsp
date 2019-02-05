<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
    String driver = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String database = "bloodbank";
    String userid = "root";
    String password = "";
    String Blood_Group = request.getParameter("Blood_Group");
    String Full_Name = request.getParameter("Full_Name");
    String Delivary = request.getParameter("Delivary");

    try {
        Class.forName(driver);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>

<!DOCTYPE html>
<html>
    <body>
        <table border="1" width="400" align="center" bgcolor="#FA8072">
            <tr><td colspan=2 style="font-size:25pt;color:#FFFFF0;" align="center">
                    <h4>Detail</h4></td></tr>
            <tr>
                <td>Blood_Group</td>
                <td>Price</td>
                <td>Delivary Date</td>                
                <td>Full Name</td>
                <td>Mobile</td>
                <td>Address</td>
                <td>City</td>
                <td>Delivary</td>
                
            </tr>
            <%
                try {
                    connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                    statement = connection.createStatement();
                    String sql = "select * from `order_blood` where  Blood_Group ='" + Blood_Group + "' AND Full_Name='" + Full_Name + "' and  Delivary='" + Delivary + "'";
                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            %>
            <tr>
                <input type="hidden" name="blood_id" value="<%=resultSet.getString("blood_id")%>">
                <td><%=resultSet.getString("Blood_Group")%></td>
                <td><%=resultSet.getString("Price")%></td>
                <td><%=resultSet.getString("Delivary")%></td>
                <td><%=resultSet.getString("Full_Name")%></td>
                <td><%=resultSet.getString("Mobile_Number")%></td>
                <td><%=resultSet.getString("Address")%></td>
                <td><%=resultSet.getString("City")%></td>
                <td><a href="SuccessFully_Delivary.jsp?blood_id=<%=resultSet.getString("blood_id")%>"><button type="button" class="view">Delivary</button></a></td>               
            </tr>
            <%
                    }
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </table>
    </body>
</html>
