import java.sql.*;
public class transection {

public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","");
con.setAutoCommit(false);//bydefaultit is true
Statement stmt=con.createStatement();
int i=stmt.executeUpdate("insert into employee_details values('viru',9624574585,999,'shrinagar')");
System.out.println("no. of rows inserted="+i);
con.commit();//commit transaction
con.close();
}catch(Exception e){ System.out.println(e);}
}}    

