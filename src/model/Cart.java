package model;
//购物车

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Dataconnect;

public class Cart {
	private String cid;// 购物车id
	private String uid;// 用户id
	private String pid;// 商品id
	private String unitprice;// 商品单价
	private String count;// 商品数量
	private String totalprice;// 商品总价
	private String productImg;// 商品图片
	private String productTitle;// 商品名称
	private String productType;//商品類型


	public Cart(String cid, String uid, String pid, String unitprice, String count, String totalprice,
			String productImg, String productTitle, String productType) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.pid = pid;
		this.unitprice = unitprice;
		this.count = count;
		this.totalprice = totalprice;
		this.productImg = productImg;
		this.productTitle = productTitle;
		this.productType = productType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	// ！！！！！！！！！！！！！ 删除还没写！！！！！！！！
	public void delectcart(String count) throws ClassNotFoundException, SQLException {
		String sql = "update cart set where count ='" + count + "'";
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
	}

	public void updatecart(String count) throws ClassNotFoundException, SQLException {
		String sql = "update cart set where count ='" + count + "'";
		ResultSet rs = Dataconnect.getStatement().executeQuery(sql);
	}
}
