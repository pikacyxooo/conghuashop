package model;
//���ﳵ

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Dataconnect;

public class Cart {
	private String cid;//���ﳵid
	private String uid;//�û�id
	private String pid;//��Ʒid
	private String unitprice;//��Ʒ����
	private String count;//��Ʒ����
	private String totalprice;//��Ʒ�ܼ�
	public Cart(String cid, String uid, String pid) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.pid = pid;
	}
	
	//��������������������������  ɾ����ûд����������������
	public void delectcart(String count) throws ClassNotFoundException, SQLException {
		String sql = "update cart set where count ='"+count+"'";
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
}
	public void updatecart(String count) throws ClassNotFoundException, SQLException {
		String sql = "update cart set where count ='"+count+"'";
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
}
}
