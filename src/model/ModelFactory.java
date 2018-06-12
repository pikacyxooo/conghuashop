package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Bean.UserBean;
import javafx.beans.property.StringProperty;

public class ModelFactory {
	public static Product p() throws SQLException, ClassNotFoundException {
		Product re = null;
		String sql = "select * from product where ProductId='20001'";
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
		if (rs.next()) {
			re = new Product(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5),
					rs.getDouble(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10));
		}
		return re;
	}
	
	public static Cart c() throws SQLException, ClassNotFoundException {
		Cart re = null;
		String sql = "select * from cart where userId='10001'";
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
		if (rs.next()) {
			re = new Cart(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
		}
		return re;
	}

	public static UserBean Login(String account, String password) throws SQLException, ClassNotFoundException {
		UserBean stu = null;
		String sql = "select * from user where userId =" + account + " and password =" + password + ";";
		ResultSet re = Dataconnect.getStatement().executeQuery(sql);
		if (re.next()) {
			stu = new UserBean(0, "", "", "", "", "", "", "", "", "");
		}
		return stu;

	}

	public static boolean SignUp(String account, String password) throws SQLException, ClassNotFoundException {

		String sql = "insert into user(userId,password) values(" + account + "," + password + ");";

		int re = Dataconnect.getStatement().executeUpdate(sql);
		System.out.println("sign up re = " + re);
		if (re > 0) {
			return true;
		}
		return false;

	}
}