<%@ page import="java.sql.*" %>
<HTML>


    <BODY>

        <FORM ACTION="Search_Blood.jsp" METHOD="POST">
            <table border="1" width="400" align="center" bgcolor="#EE82EE">
                <tr><td colspan=2 style="font-size:25pt;color:#FF00FF;" align="center">
                        <h3>Search Blood</h3></td></tr>
                <tr>
                    <td>Blood Group</td>
                    <td>
                        <select name="Blood_Group" id="blood_group">
                            <option value="-1">Select_Blood_Group</option>
                            <option value="A+">A+</option>
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
                    <td>Location</td>
                    <td>
                        <input type="text" name="Address" maxlength="15" />
                    </td>
                </tr>

                <tr>
                    <td>City</td>
                    <td>
                        <select name="City" id="city">
                            <option value="Selected">.....selected.....</option>
                            <option value="Dhaka">Dhaka</option>
                            <option value="A-">Barishal</option>
                            <option value="Khulna">	Chattogram</option>
                            <option value="Borishal">Khulna</option>
                            <option value="Chttagong">Mymensingh</option>
                            <option value="Mymansng">Rajshahi</option>
                            <option value="Shylet">Rangpur</option>
                            <option value="Shylet">Sylhet</option>
                    </td>
                </tr>
                <tr><td colspan=2 align="center">
                        <input  type="submit" name="submit" value="Search"></td></tr>
            </table>
        </FORM>

    </BODY>
</HTML>