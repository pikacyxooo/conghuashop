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
	private ImageView productImg; // ��ƷͼƬ
	@FXML
	private Text productTitle; // ��Ʒ����
	@FXML
	private Text unitPrice; // �۸�
	@FXML
	private Text choiceNum; // ѡ�е���Ʒ��������
	@FXML
	private Text productType; // ��Ʒ������
	@FXML
	private Hyperlink collectProduct;
	@FXML
	private Text totalPrice; // ѡ�е���Ʒ�۸�
	@FXML
	private Button payBtn; // ֧����ť

	public void showApparent() {
		if (cart != null) {

			System.out.println("ִ����showApparent");
			String path = System.getProperty("user.dir"); // ��ȡ��Ŀ����·��
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
	//����ɹ�����֧���ɹ�ҳ��
	@FXML
	protected void showSuccessDialog(ActionEvent event){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("SuccessDialog.fxml"));
			System.out.println("������");
			AnchorPane DialogLayout = (AnchorPane) loader.load();
			Stage dialogStage = new Stage();
			dialogStage.setTitle("����ɹ�");
			dialogStage.initModality(Modality.WINDOW_MODAL);
		    dialogStage.initOwner(Main.stage);
		    Scene scene = new Scene(DialogLayout);
		    dialogStage.setScene(scene);
		    dialogStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//������cartҳ��ʱ�ĳ�ʼ������
	@FXML
	private void initialize() {
		System.out.println("ִ���˳�ʼ������");
		cart = Data.cexecute();
		showApparent();
		// productTitle.setText(Data.pro.getName());
	}
}
