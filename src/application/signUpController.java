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
	@FXML private Button signUpBtn;  //注册按钮
	@FXML private TextField signUpField;  //输入手机号文本域
	@FXML private TextField passwordField;  //输入密码文本域
	
	
	@FXML public void handleSignUpBtn(ActionEvent event){
		 String account = signUpField.getText();
		 String password = passwordField.getText();
		 System.out.println("账号："+account+" 密码:"+password);
		 try {
			boolean isRegist = ModelFactory.SignUp(account, password);
			
			if(isRegist){
				System.out.println("執行到這一步");
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("index.fxml"));
				AnchorPane indexLayout = (AnchorPane)loader.load();
				Main.rootLayout.setCenter(indexLayout);
			}else{
				System.out.println("注册失败");
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
