package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Dataconnect;

//�û�
public class User {
	private String id;//�û���
	private String password;//�û�����
	private String name;//�û�����
	private String sex;//�Ա�
	private int phone;//�ֻ�
	private String email;//��������
	private String address;//��ַ
	private String collection;//�ղ���Ʒ
	private String pay;//֧��
	public User(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	//����
	public Order purchase(String oid) throws ClassNotFoundException, SQLException {//����
			Order re = null;
			//���޸�-------������������������������������������������ȡ��������
			String sql = "update order set where stasus='�Ѹ���' where orderId='"+oid+"'";
			ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
			return re;

	}

	public void checkcart(){//�鿴���ﳵ
		
	}
	public Cart joincart(String pid) throws ClassNotFoundException, SQLException {//���빺�ﳵ
		Cart re = null;
		//���޸�-------������������������������������������������ȡ��������
		String sql = "insert into(productId)values('"+pid+"')";
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
		return re;

	}
	public Review comment(String reviewId) throws ClassNotFoundException, SQLException {//
			Review re = null;
			
			//���޸�-------������������������������������������������ȡ��������
			String sql = "insert into review value('����ID','�û�ID','��ƷID','����','����','ʱ��')";
			ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
			return re;

	}
	public void collect(String userId) throws ClassNotFoundException, SQLException {
			String sql = "update user set where collection ='�ղ�' where userId='�û�ID'";
			ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
	}
}
