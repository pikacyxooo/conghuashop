package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Dataconnect;

//����Ա
public class Admin {
	private String aid;//����Աid
	private String apw;//����Ա����
	private String journal;//��־
	public Admin(String aid, String apw) {
		super();
		this.aid = aid;
		this.apw = apw;
	}
	
	//�ϼ�
	public Product addproduct(String produceId) throws ClassNotFoundException, SQLException {
			Product re = null;
			String sql = "update product set where shelves=1 where productId="+produceId;
			ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
			return re;	
	}
	//�¼�
	public Product delectproduce(String produceId) throws ClassNotFoundException, SQLException {
		Product re = null;
		String sql = "update product set where shelves=0 where productId="+produceId;
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
		return re;	
	}
}
