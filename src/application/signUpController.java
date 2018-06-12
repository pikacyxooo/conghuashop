package application;


import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.ModelFactory;


public class signUpController {
	@FXML private Button signUpBtn;  //ע�ᰴť
	@FXML private TextField signUpField;  //�����ֻ����ı���
	@FXML private TextField passwordField;  //���������ı���
	
	
	@FXML public void handleSignUpBtn(ActionEvent event){
		 String account = signUpField.getText();
		 String password = passwordField.getText();
		 System.out.println("�˺ţ�"+account+" ����:"+password);
		 try {
			boolean isRegist = ModelFactory.SignUp(account, password);
			
			if(isRegist){
				System.out.println("���е��@һ��");
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("index.fxml"));
				AnchorPane indexLayout = (AnchorPane)loader.load();
				Main.rootLayout.setCenter(indexLayout);
			}else{
				System.out.println("ע��ʧ��");
			}
	
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.getStackTrace();
		}
		 
		
	}
}
