package application;


import java.sql.SQLException;

import Bean.UserBean;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.ModelFactory;


public class signInController {
	@FXML private Button signInBtn;  //登陆按钮
	@FXML private TextField signInField;  //输入手机号文本域
	@FXML private PasswordField passwordField;  //输入密码文本域
	
	@FXML public void handleSignInBtn(ActionEvent event){
		 String account = signInField.getText();
		 String password = passwordField.getText();
		 
		 try {
			UserBean userBean = ModelFactory.Login(account, password);
			
			if(userBean != null){
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("index.fxml"));
				AnchorPane indexLayout = (AnchorPane)loader.load();
				Main.rootLayout.setCenter(indexLayout);
			}else{
				System.out.println("登录失败");
			}
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(Exception e) {
			e.getStackTrace();
		}
		 
		 
	}
	

	
}
