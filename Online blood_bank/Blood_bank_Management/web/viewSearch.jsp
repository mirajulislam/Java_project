<%@ page import="java.util.*" %> 
<html>
    <head>
    </head>
    <body>

        <br><br><br><br><br><br>
        <table width="700px" align="center" 
               style="border:1px solid #000000;">
            <tr>
                <td colspan=8 align="center" 
                    style="background-color:ffeeff">
                    <b>Donor Record</b></td>
            </tr>
            <tr style="background-color:efefef;">
                <td><b>Blood_id</b></td>
                <td><b>Full_Name</b></td>
                <td><b>Blood_group</b></td>
                <td><b>Last_Donation No</b></td>
                <td><b>Mobile</b></td>
                <td><b>Email</b></td>
                <td><b>Address</b></td>
                <td><b>City</b></td>

            </tr>
            <%
                int count = 0;
                String color = "#F9EBB3";

                if (request.getAttribute("blood_list") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("blood_list");
                    Iterator itr = al.iterator();

                    while (itr.hasNext()) {

                        if ((count % 2) == 0) {
                            color = "#eeffee";
                        } else {
                            color = "#F9EBB3";
                        }
                        count++;
                        ArrayList blood_list = (ArrayList) itr.next();
            %>
            <tr style="background-color:<%=color%>;">
                <td><%=blood_list.get(0)%></td>
                <td><%=blood_list.get(1)%></td>
                <td><%=blood_list.get(3)%></td>
                <td><%=blood_list.get(4)%></td>
                <td><%=blood_list.get(5)%></td>
                <td><%=blood_list.get(6)%></td>
                <td><%=blood_list.get(7)%></td>
                <td><%=blood_list.get(8)%></td>
            </tr>
            <%
                    }
                }
            %> 
            <%
                if (count == 0) {
            %>
            <tr>
                <td colspan=8 align="center" 
                    style="background-color:eeffee"><b>No Record</b></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>