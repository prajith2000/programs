import java.sql.*;
class Jdbc {
	public static void main(String[] args)
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "630@prajith";
		try{
			// step1-Register the Driver
			// step2-get the connection
			Connection con = DriverManager.getConnection(url,username,password);
			// step3-create the statement object
			Statement stmt=con.createStatement();
			// step4-execute the query
			stmt.executeUpdate(("insert into student values(372,'prajith')"));
			// step5-close the connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		