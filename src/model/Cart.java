package model;
//购物车

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Dataconnect;

public class Cart {
	private String cid;//购物车id
	private String uid;//用户id
	private String pid;//商品id
	private String unitprice;//商品单价
	private String count;//商品数量
	private String totalprice;//商品总价
	public Cart(String cid, String uid, String pid) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.pid = pid;
	}
	
	//！！！！！！！！！！！！！  删除还没写！！！！！！！！
	public void delectcart(String count) throws ClassNotFoundException, SQLException {
		String sql = "update cart set where count ='"+count+"'";
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
}
	public void updatecart(String count) throws ClassNotFoundException, SQLException {
		String sql = "update cart set where count ='"+count+"'";
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
}
}
