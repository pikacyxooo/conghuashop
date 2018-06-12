package application;

import java.io.File;
import java.net.MalformedURLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Cart;
import model.Data;

public class CartController {
	private Cart cart;
	@FXML
	private ImageView productImg; // 商品图片
	@FXML
	private Text productTitle; // 商品名称
	@FXML
	private Text unitPrice; // 价格
	@FXML
	private Text choiceNum; // 选中的商品数量数量
	@FXML
	private Text productType; // 商品的类型
	@FXML
	private Hyperlink collectProduct;
	@FXML
	private Text totalPrice; // 选中的商品价格
	@FXML
	private Button payBtn; // 支付按钮

	public void showApparent() {
		if (cart != null) {

			System.out.println("执行了showApparent");
			String path = System.getProperty("user.dir"); // 获取项目绝对路径
			File file = new File(path + cart.getProductImg());
			System.out.println(path + cart.getProductImg());
			String imgUrl;
			try {
				imgUrl = file.toURI().toURL().toString();
				Image image = new Image(imgUrl);
				productImg.setImage(image);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			productTitle.setText(cart.getProductTitle());
			unitPrice.setText(cart.getUnitprice());
			choiceNum.setText(cart.getCount());
			productType.setText(cart.getProductType());
			totalPrice.setText(cart.getTotalprice());

		}
	}
	//购买成功弹出支付成功页面
	@FXML
	protected void showSuccessDialog(ActionEvent event){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("SuccessDialog.fxml"));
			System.out.println("加载了");
			AnchorPane DialogLayout = (AnchorPane) loader.load();
			Stage dialogStage = new Stage();
			dialogStage.setTitle("购买成功");
			dialogStage.initModality(Modality.WINDOW_MODAL);
		    dialogStage.initOwner(Main.stage);
		    Scene scene = new Scene(DialogLayout);
		    dialogStage.setScene(scene);
		    dialogStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//当运行cart页面时的初始化代码
	@FXML
	private void initialize() {
		System.out.println("执行了初始化方法");
		cart = Data.cexecute();
		showApparent();
		// productTitle.setText(Data.pro.getName());
	}
}
