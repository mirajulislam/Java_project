<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
    String user_id = request.getParameter("user_id");
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

<%
    try {
        connection = DriverManager.getConnection(connectionUrl + database, userid, password);
        statement = connection.createStatement();
        String sql = "select * from donor_registration where user_id=" + user_id;
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
%>
<!DOCTYPE html>
<html>
    <body>
        <h1>New Bag Ready</h1>
        <form method="post" action="Blood_add.jsp">

            <input type="hidden" name="user_id" value="<%=resultSet.getString("user_id")%>">
            <br>
            Id:
            <td><input type='text' name="user_id" value="<%=resultSet.getString("user_id")%>" readonly>
                <br>
                <br>
                Full_name:
                <input type="text" name="Full_Name" value="<%=resultSet.getString("Full_Name")%>" readonly>
                <br>
                <br>
                Blood_Group:
                <input type="text" name="Blood_Group" value="<%=resultSet.getString("Blood_Group")%>" readonly>
                <br>
                <br>
                Last_Donation:
                <input type="text" name="Last_Donation" value="<%=resultSet.getString("Last_Donation")%>" readonly>
                <br>
                <br>
                Mobile_Number:
                <input type="text" name="Mobile_Number" value="<%=resultSet.getString("Mobile_Number")%>" readonly>
                <br>
                <br>
                Email:
                <input type="text" name="Email" value="  <%=resultSet.getString("Email")%>" readonly>
                <br>
                <br>
                Address:
                <input type="text" name="Address" value="<%=resultSet.getString("Address")%>" readonly>
                <br>
                <br>
                City:
                <input type="text" name="City" value="<%=resultSet.getString("City")%>" readonly>
                <br>
                <br>
                Price:
                <select name="Price" id="price">
                    <option value="399">399</option>
                    <option value="499">499</option>
                    <option value="599">599</option>
                    <option value="699">699</option>
                </select>
                <br>
                <br>

                <input type="submit" value="submit">
        </form>
        <%
                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </body>
</html>