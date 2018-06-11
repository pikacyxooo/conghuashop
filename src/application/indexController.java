package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class indexController {
	@FXML Pane productPane;			//商品面板标签
	@FXML ImageView productImg;		//商品图片标签
	@FXML Label productTitle;		//商品名称标签
	@FXML Label productPrice;      //商品价格标签
	@FXML Button toProductPageBtn;  //跳转到商品详情页面按钮
	
	@FXML
	protected void handleProductPageClick(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("product.fxml"));
			AnchorPane signUpLayout = (AnchorPane) loader.load();
			Main.rootLayout.setCenter(signUpLayout);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
