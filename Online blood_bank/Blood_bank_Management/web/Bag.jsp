<%@page import="java.time.LocalDateTime"%>
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
                    <h4>Blood Donor Detail</h4></td></tr>

            <tr>
                <td>Blood_id</td>
                <td>Full_Name</td>
                <td>Blood_Group</td>
                <td>Last_Donation</td>
                <td>Mobile_Number</td>
                <td>Email</td>
                <td>Address</td>
                <td>City</td>
                <td>User_id</td>
                <td>Price</td>
                <td>Delete</td>
            </tr>
            <%
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Calendar cal = Calendar.getInstance();
                    String present = sdf.format(cal.getTime());
                    connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                    statement = connection.createStatement();
                    String sql = "select * from blood_detail where time='" + present + "'";
                    resultSet = statement.executeQuery(sql);
                    int i = 0;
                    while (resultSet.next()) {
            %>
            <tr>
                <td><%=resultSet.getString("blood_id")%></td>
                <td><%=resultSet.getString("Full_Name")%></td>
                <td><%=resultSet.getString("Blood_Group")%></td>
                <td><%=resultSet.getString("Last_Donation")%></td>
                <td><%=resultSet.getString("Mobile_Number")%></td>
                <td><%=resultSet.getString("Email")%></td>
                <td><%=resultSet.getString("Address")%></td>
                <td><%=resultSet.getString("City")%></td>
                <td><%=resultSet.getString("user_id")%></td>
                <td><%=resultSet.getString("Price")%></td>
                <td><a href="Delete.jsp?blood_id=<%=resultSet.getString("blood_id")%>"><button type="button" class="delete">Delete</button></a></td>
            </tr>
            <%
                        i++;
                    }
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
        </table>
    </body>
</html>