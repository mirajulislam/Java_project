<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
    String blood_id = request.getParameter("blood_id");
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
        String sql = "select * from blood_detail where blood_id=" + blood_id;
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
%>
<!DOCTYPE html>
<html>
    <body>
        <h1>New Bag Ready</h1>
        <form method="post" action="Order">

            <input type="hidden" name="blood_id" value="<%=resultSet.getString("blood_id")%>">
            <br>
              Blood_Id:
               <td><input type='text' name="blood_id" value="<%=resultSet.getString("blood_id")%>" readonly>
                <br>
                <br>
                
                Blood_Group:
                <input type="text" name="Blood_Group" value="<%=resultSet.getString("Blood_Group")%>" readonly>
                <br>
                <br>
                
                 Price:
                <input type="text" name="Price" value="<%=resultSet.getString("Price")%>" readonly>
                <br>
                <br>
                
                Delivary Date:
                <input type="text" name="Delivary" > (yyyy-mm-dd)
                <br>
                <br>
                Your_Name:
                <input type="text" name="Full_Name"/>
                <br>
                <br>
                Your_Mobile:
                <input type="text" name="Mobile"/>
                <br>
                <br>
                 Your_Email:
                <input type="text" name="Email"/>
                <br>
                <br>
                Your_Address:
                <input type="text" name="Address" />
                <br>
                <br>
                Your_City:
                <input type="text" name="City" />
                <br>
                <br>
                <input type="submit" value="Order">
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