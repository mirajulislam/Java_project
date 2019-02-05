<%@ page import="java.sql.*" %>
<HTML>


    <BODY>

        <FORM ACTION="Delivari_Ready.jsp" METHOD="POST">
            <table border="1" width="400" align="center" bgcolor="#EE82EE">
                <tr><td colspan=2 style="font-size:25pt;color:#FF00FF;" align="center">
                        <h3>Search Blood</h3></td></tr>
                <tr>
                    <td>Blood Group</td>
                    <td>
                        <select name="Blood_Group" id="blood_group">
                            <option value="-1">Select_Blood_Group</option>
                            <option value="A+"Blood_Group>A+</option>
                            <option value="A-">A-</option>
                            <option value="B+">B+</option>
                            <option value="B-">B-</option>
                            <option value="AB+">AB+</option>
                            <option value="AB-">AB-</option>
                            <option value="O+">O+</option>
                            <option value="O-">O-</option>
                    </td>
                </tr>

                <tr>
                    <td>Customer Name</td>
                    <td>
                        <input type="text" name="Full_Name" maxlength="15" />
                    </td>
                </tr>

                <tr>
                    <tr>
                    <td>Delivary Date</td>
                    <td>
                        <input type="text" name="Delivary" maxlength="15" />
                    </td>
                </tr>
                </tr>
                <tr><td colspan=2 align="center">
                        <input  type="submit" name="submit" value="Search"></td></tr>
            </table>
        </FORM>

    </BODY>
</HTML>