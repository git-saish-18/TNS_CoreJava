package org.tnsif.myjdbc;

import java.sql.*;  
class JDBC{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/mysql","root","Saish@1425");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
//Inserting data into student table
int n=stmt.executeUpdate("INSERT INTO student VALUES(3,'Ashu',12)");
if (n==1)
	System.out.println("Record inserted Successfully....");
else
	System.out.println("Unable to insert record");

//delele students whose name starts with p
//n=stmt.executeUpdate("DELETE FROM student WHERE Name LIKE 'p%'");
//if (n>=1)
//	System.out.println(n+" Record(s) Deleted Successfully....");
//else
//	System.out.println("No such record found");

//update student percentage increased by 5
//n=stmt.executeUpdate("UPDATE student SET percentage=percentage+5 WHERE percentage<96");
//if (n>=1)
//	System.out.println(n+" Record(s) Updated Successfully....");
//else
//	System.out.println("No such record found");

ResultSet rs=stmt.executeQuery("select * from student");  
while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)); 

con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
