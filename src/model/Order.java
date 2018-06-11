package model;
//订单
public class Order {
	private String oid;//订单id
	private String uid;//用户id
	private String time;//下单时间
	private String status;//订单状态
	private String pid;//商品id
	private String count;//商品数量
	private double unitprice;//商品单价
	private double totalprice;//订单总价
	private String name;//收货人姓名
	private String phone;//收货人手机
	private String address;//收货人地址
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
