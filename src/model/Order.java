package model;
//����
public class Order {
	private String oid;//����id
	private String uid;//�û�id
	private String time;//�µ�ʱ��
	private String status;//����״̬
	private String pid;//��Ʒid
	private String count;//��Ʒ����
	private double unitprice;//��Ʒ����
	private double totalprice;//�����ܼ�
	private String name;//�ջ�������
	private String phone;//�ջ����ֻ�
	private String address;//�ջ��˵�ַ
	public Order(String oid, String uid, String pid) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.pid = pid;
	}
	public void addorder(){
		
	}
	public void deleteorder(){
		
	}
}
