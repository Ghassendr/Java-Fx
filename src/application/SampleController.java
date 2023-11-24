package application;

 
import java.net.URL;
import java.util.ResourceBundle;
import application.Client;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SampleController implements Initializable{
	@FXML
	TableView<Client> tv;
	@FXML
	ListView  <Integer> l2;
	@FXML
	TextField nom;
	@FXML
	TextField prenom;
	@FXML
	TextField model;
	@FXML
    RadioButton gamer;
	@FXML
    RadioButton normal;
	@FXML
    RadioButton pro;
	@FXML 
	CheckBox sac;
	@FXML 
	CheckBox clavier;
	@FXML 
	CheckBox sourie;
	@FXML
	ComboBox<String> hz;
ObservableList<String> e=FXCollections.observableArrayList("120 hz","140 hz","170 hz");
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
hz.setItems(e);
		
	}
	
	public void add() {
		int prix =0;
		if (gamer.isSelected()) {prix+=3000;gamer.setSelected(false);}
		if (pro.isSelected()) {prix+=2500;pro.setSelected(false);}
		if (normal.isSelected()) {prix+=1000;normal.setSelected(false);}
		if(hz.getSelectionModel().getSelectedItem()=="120 hz")	{prix+=120;
		}	
		if(hz.getSelectionModel().getSelectedItem()=="140 hz")	{prix+=140;}	
		if(hz.getSelectionModel().getSelectedItem()=="170 hz")	{prix+=170;}	
		Client c=new Client(nom.getText(), prenom.getText());
		tv.getItems().add(c);
		System.out.println(prix);
		model.clear();
		sac.setSelected(true);
		l2.getItems().add(prix);
	}
	public void drop() {
tv.getItems().remove(tv.getSelectionModel().getSelectedIndex());
l2.getItems().remove(l2.getSelectionModel().getSelectedIndex());
	}
	
}
