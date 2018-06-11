package model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


//��Ʒ
public class Product {
	private StringProperty pid;//商品id
	private StringProperty categoryid;//商品分类id
	private StringProperty name;//商品名称
	private StringProperty desciption;//商品描述
	private DoubleProperty normalprice;//商品原价
	private DoubleProperty discountprice;//商品折扣价
	private IntegerProperty stock;//商品库存
	private StringProperty prdimage;//商品图片
	private StringProperty detail;//商品简介
	private StringProperty detailimg;//商品描述详情
//	private IntegerProperty promotion;
//	private IntegerProperty seckill;
//	private IntegerProperty grouppurchase;
//	private IntegerProperty shelves;
	
	public String getPid() {
		return pid.get();
	}
	
	public StringProperty pidProperty() {
		return pid;
	}


	public void setPid(StringProperty pid) {
		this.pid = pid;
	}


	public StringProperty getCategoryid() {
		return categoryid;
	}

	public int getStock() {
		return stock.get();
	}
	
	public IntegerProperty stockProperty() {
		return stock;
	}


	public void setStock(IntegerProperty stock) {
		this.stock = stock;
	}


	public void setCategoryid(StringProperty categoryid) {
		this.categoryid = categoryid;
	}

	public String getName() {
		return name.get();
	}
	
	public StringProperty nameProperty() {
		return name;
	}


	public void setName(StringProperty name) {
		this.name = name;
	}


	public StringProperty detailProperty() {
		return detail;
	}

	public String getDetail() {
		return detail.get();
	}
	
	public void setDetail(StringProperty detail) {
		this.detail = detail;
	}

	public double getNormalprice() {
		return normalprice.get();
	}
	
	public DoubleProperty normalpriceProperty() {
		return normalprice;
	}


	public void setNormalprice(DoubleProperty normalprice) {
		this.normalprice = normalprice;
	}

	public double getDiscountPrice() {
		return discountprice.get();
	}
	
	public DoubleProperty discountpriceProperty() {
		return discountprice;
	}


	public void setDiscountprice(DoubleProperty discountprice) {
		this.discountprice = discountprice;
	}

	public String getPrdImage() {
		return prdimage.get();
	}
	
	public StringProperty prdimageProperty() {
		return prdimage;
	}


	public void setPrdimage(StringProperty prdimage) {
		this.prdimage = prdimage;
	}

	public String getDescription() {
		return desciption.get();
	}
	
	public StringProperty describeProperty() {
		return desciption;
	}


	public void setDescribe(StringProperty describe) {
		this.desciption = desciption;
	}


	public StringProperty getDetailimg() {
		return detailimg;
	}


	public void setDetailimg(StringProperty detailimg) {
		this.detailimg = detailimg;
	}




	public Product(String pid, String categoryid, String name, String detail, double normalprice, double discountprice,
			int stock, String prdimage, String desciption, String detailimg) {
		this.pid = new SimpleStringProperty(pid);
		this.categoryid =  new SimpleStringProperty(categoryid);
		this.name =  new SimpleStringProperty(name);
		this.detail =  new SimpleStringProperty(detail);
		this.normalprice =  new SimpleDoubleProperty(normalprice);
		this.discountprice =  new SimpleDoubleProperty(discountprice);
		this.stock =  new SimpleIntegerProperty(stock);
		this.prdimage =  new SimpleStringProperty(prdimage);
		this.desciption =  new SimpleStringProperty(desciption);
		this.detailimg =  new SimpleStringProperty(detailimg);
	}



	
}
