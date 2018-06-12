package model;

import java.sql.*;

public class Dataconnect {
	private static Statement stat;
	private static void init() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/Mysql?"+
					"user=root&password=123456";
		Connection con=DriverManager.getConnection(url);
		stat=con.createStatement();
		String sql="use conghua";
		stat.executeUpdate(sql);
		System.out.println("ok");
	}
	
	public static Statement getStatement() throws ClassNotFoundException,SQLException{
		if(stat==null)
			init();
		return stat;
	}



}
