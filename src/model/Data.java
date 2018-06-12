package model;
import java.sql.SQLException;

import application.productController;
import model.Product;
public class Data {
	private static Product pro = null;
	private static Cart cart = null;
	public static void  initProductDate() throws ClassNotFoundException, SQLException {
		pro = ModelFactory.p();
	}
	public static void  initCartDate() throws ClassNotFoundException, SQLException {
		cart = ModelFactory.c();
	}
	public static Product execute() {
		try {
			initProductDate();
			return pro;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static Cart cexecute() {
		try {
			initCartDate();
			return cart;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
