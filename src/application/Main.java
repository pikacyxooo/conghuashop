package application;
	
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.stage.Stage;
import model.Data;
import model.Product;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static Stage stage;
	public static BorderPane rootLayout;
	private ObservableList<Product> productData = FXCollections.observableArrayList();
	
	@Override
	public void start(Stage stage) throws IOException {
		Main.stage = stage;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("RootLayout.fxml"));
		rootLayout = (BorderPane)loader.load();
		initRootLayout();
		showProductLayout();
//		showSignInLayout();
//		showIndexLayout();
	}
	
	public void initRootLayout() {
		try {		
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public void showIndexLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Index.fxml"));
			AnchorPane indexLayout = (AnchorPane)loader.load();
			rootLayout.setCenter(indexLayout);;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showSignInLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("SignIn.fxml"));
			AnchorPane indexLayout = (AnchorPane)loader.load();
			rootLayout.setCenter(indexLayout);;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showProductLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("product.fxml"));
			AnchorPane signInLayout = (AnchorPane)loader.load();
			productController pController = loader.<productController>getController();
			loader.setController(this);
			rootLayout.setCenter(signInLayout);
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	public ObservableList<Product> getProductData(){
		return productData;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public static Stage getStage() {
		return stage;
	}
	public static BorderPane getRootLayout() {
		return rootLayout;
	}
	
}
