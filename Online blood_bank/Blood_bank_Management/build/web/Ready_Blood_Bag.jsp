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
                <td>Full_Name</td>
                <td>Blood_Group</td>
                <td>Donation Date</td>
                <td>Mobile</td>
                <td>Email</td>
                <td>Gender</td>
                
            </tr>
            <%
                try {
                    connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                    statement = connection.createStatement();
                    String sql = "select * from `blood_bag_registration`";
                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            %>
            <tr>
                <td><%=resultSet.getString("Full_Name")%></td>               
                <td><%=resultSet.getString("Blood_Group")%></td>
                <td><%=resultSet.getString("Donation_Date")%></td>
                <td><%=resultSet.getString("Mobile_Number")%></td>
                <td><%=resultSet.getString("Email")%></td>
                <td><%=resultSet.getString("Gender")%></td>
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
