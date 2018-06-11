package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Dataconnect;

//用户
public class User {
	private String id;//用户名
	private String password;//用户密码
	private String name;//用户姓名
	private String sex;//性别
	private int phone;//手机
	private String email;//电子邮箱
	private String address;//地址
	private String collection;//收藏商品
	private String pay;//支付
	public User(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	//功能
	public Order purchase(String oid) throws ClassNotFoundException, SQLException {//购买
			Order re = null;
			//待修改-------！！！！！！！！！！！！！！！！！！！！获取插入数据
			String sql = "update order set where stasus='已付款' where orderId='"+oid+"'";
			ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
			return re;

	}

	public void checkcart(){//查看购物车
		
	}
	public Cart joincart(String pid) throws ClassNotFoundException, SQLException {//加入购物车
		Cart re = null;
		//待修改-------！！！！！！！！！！！！！！！！！！！！获取插入数据
		String sql = "insert into(productId)values('"+pid+"')";
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
		return re;

	}
	public Review comment(String reviewId) throws ClassNotFoundException, SQLException {//
			Review re = null;
			
			//待修改-------！！！！！！！！！！！！！！！！！！！！获取插入数据
			String sql = "insert into review value('评论ID','用户ID','产品ID','标题','内容','时间')";
			ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
			return re;

	}
	public void collect(String userId) throws ClassNotFoundException, SQLException {
			String sql = "update user set where collection ='收藏' where userId='用户ID'";
			ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
	}
}
