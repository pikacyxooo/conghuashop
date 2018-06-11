package model;
import java.sql.SQLException;

import application.productController;
import model.Product;
public class Data {
	private static Product pro = null;
	public static void  initDate() throws ClassNotFoundException, SQLException {
		pro = ModelFactory.p();
	}
	public static Product execute() {
		try {
			initDate();
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
}
