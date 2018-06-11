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
	@FXML Pane productPane;			//��Ʒ����ǩ
	@FXML ImageView productImg;		//��ƷͼƬ��ǩ
	@FXML Label productTitle;		//��Ʒ���Ʊ�ǩ
	@FXML Label productPrice;      //��Ʒ�۸��ǩ
	@FXML Button toProductPageBtn;  //��ת����Ʒ����ҳ�水ť
	
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
