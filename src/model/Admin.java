package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Dataconnect;

//管理员
public class Admin {
	private String aid;//管理员id
	private String apw;//管理员密码
	private String journal;//日志
	public Admin(String aid, String apw) {
		super();
		this.aid = aid;
		this.apw = apw;
	}
	
	//上架
	public Product addproduct(String produceId) throws ClassNotFoundException, SQLException {
			Product re = null;
			String sql = "update product set where shelves=1 where productId="+produceId;
			ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
			return re;	
	}
	//下架
	public Product delectproduce(String produceId) throws ClassNotFoundException, SQLException {
		Product re = null;
		String sql = "update product set where shelves=0 where productId="+produceId;
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
		return re;	
	}
}
