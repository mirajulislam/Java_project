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
    String Address = request.getParameter("Address");
    String City = request.getParameter("City");

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Calendar cal = Calendar.getInstance();
    String present = sdf.format(cal.getTime());
    cal.add(Calendar.DAY_OF_MONTH, -92);
    String newDate = sdf.format(cal.getTime());
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
                <td>Blood_id</td>
                <td>Blood_Group</td>
                <td>Last_Donation</td>
                <td>Price</td>
                <td>Donor Profile</td>
                <td>Order</td>
            </tr>
            <%
                try {
                    connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                    statement = connection.createStatement();
                    String sql = "select * from `blood_detail` where Last_Donation NOT BETWEEN '" + newDate + "' AND '" + present + "' AND (Blood_Group='" + Blood_Group + "' and  City='" + City + "')";
                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            %>
            <tr>
                <td><%=resultSet.getString("blood_id")%></td>               
                <td><%=resultSet.getString("Blood_Group")%></td>
                <td><%=resultSet.getString("Last_Donation")%></td>
                <td><%=resultSet.getString("Price")%></td>
                <td><a href="View.jsp?blood_id=<%=resultSet.getString("blood_id")%>"><button type="button" class="view">View</button></a></td>
                <td><a href="Order.jsp?blood_id=<%=resultSet.getString("blood_id")%>"><button type="button" class="view">Order</button></a></td>
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
