package application;

import java.io.File;
import java.net.MalformedURLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.Data;
import model.Product;

public class productController {
	private Product product;
	@FXML
	private Label productTitle; // 商品名称
	@FXML
	private Label productDesc; // 商品简介
	@FXML
	private Text price; // 商品原价
	@FXML
	private Label discountPrice; // 商品折扣价
	@FXML
	private Text stock; // 商品库存
	@FXML
	private TextField numberField; // 商品数量
	@FXML
	private Text productId; // 商品id
	@FXML
	private Text productDetailDesc; // 商品详情
	@FXML 
	private ImageView prdImage;  //商品图片地址
 
	@FXML
	protected void handlePlus(ActionEvent event) {
		String productNum = numberField.getText();
		int num = Integer.valueOf(productNum);
		num++;
		productNum = Integer.toString(num);
		numberField.setText(productNum);
	}

	@FXML
	protected void handleMinus(ActionEvent event) {
		String productNum = numberField.getText();
		int num = Integer.valueOf(productNum);
		num--;
		productNum = Integer.toString(num);
		numberField.setText(productNum);
	}

	@FXML
	protected void handleCartPageClick(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Cart.fxml"));
			AnchorPane signUpLayout = (AnchorPane) loader.load();
			Main.rootLayout.setCenter(signUpLayout);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//
	public void showApparent() {
		if (product != null) {
			System.out.println("执行了showApparent");
			productTitle.setText(product.getName());
			productDesc.setText(product.getDetail());
			price.setText("￥"+Double.toString(product.getNormalprice()));
			discountPrice.setText("￥"+Double.toString(product.getDiscountPrice()));
			stock.setText(Integer.toString(product.getStock()));
			productId.setText(product.getPid());
			productDetailDesc.setText(product.getDescription());
			String path = System.getProperty("user.dir");  //获取项目绝对路径
			File file = new File(path+product.getPrdImage());
			System.out.println(path+product.getPrdImage());
			String imgUrl;	
			try {
				imgUrl = file.toURI().toURL().toString();
				Image image = new Image(imgUrl);
				prdImage.setImage(image);
		    } catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	//当运行product页面时的初始化代码
	@FXML
	private void initialize() {
		System.out.println("执行了初始化方法");
		product = Data.execute();
		showApparent();
		// productTitle.setText(Data.pro.getName());
	}
	// public void setMain(Main mainApp) {
	// this.mainApp = mainApp;
}
