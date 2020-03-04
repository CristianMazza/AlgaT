package application;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class Funzioni {
	public Button indietro_menu;
	public BorderPane border1;
	public BorderPane border2;
	public BorderPane border3;
	public BorderPane border4;
	public BorderPane border5;
	public BorderPane border6;
	public Pane pane1;
	public GridPane quiz;
	public GridPane finequiz;
	public VBox vbox1;
	public VBox vbox2;
	public VBox vbox3;
	public VBox vbox4;
	public VBox vbox5;
	public RadioButton rb1;
	public RadioButton rb2;
	public RadioButton rb3;
	public RadioButton rb4;
	public RadioButton rb5;
	public RadioButton rb6;
	public RadioButton rb7;
	public RadioButton rb8;
	public RadioButton rb9;
	public RadioButton rb10;
	public RadioButton rb11;
	public RadioButton rb12;
	public Button conferma;
	public Button conff1;
	public Button conff2;
	public Button conff3;
	public Button menu_return;
	public Button menuret;
	public Label errore;
	ToggleGroup Quiz1 = new ToggleGroup();
	ToggleGroup Quiz2 = new ToggleGroup();
	ToggleGroup Quiz3 = new ToggleGroup();
	public Label domanda1;
	public Label domanda2;
	public Label domanda3;
	public Label lab;
	public Label err1;
	public Label err2;
	public Label err3;
	public Label err4;
	public Label err5;
	public Label err6;
	public Label es1;
	public Label es2;
	public Label es3;
	public Label complimenti;
	public String corretta1;
	public String corretta2;
	public String corretta3;
	public String corretta4;
	public String corretta5;
	public TextField inser;
	public TextField text1;
	public TextField text2;
	public TextField text3;
	public TextField text4;
	public TextField text5;
	
	public TextField text6;


	public void loadtxt() { 
		File testo = new File ("src\\quiz2.txt");
		rb1.setToggleGroup(Quiz1); 
		rb2.setToggleGroup(Quiz1); 
		rb3.setToggleGroup(Quiz1);
		rb4.setToggleGroup(Quiz1); 
		rb5.setToggleGroup(Quiz2);
		rb6.setToggleGroup(Quiz2);
		rb7.setToggleGroup(Quiz2);
		rb8.setToggleGroup(Quiz2);
		rb9.setToggleGroup(Quiz3);
		rb10.setToggleGroup(Quiz3);
		rb11.setToggleGroup(Quiz3);
		rb12.setToggleGroup(Quiz3);
		try {
			Scanner myscanner=new Scanner (testo);
			int i=0;
			String data=myscanner.nextLine();
			while(myscanner.hasNext()) {
				if (data.equals(";") || data.equals("RISPOSTA:")) {
				} else {
					if(i==0) domanda1.setText(data);
					if(i==1) rb1.setText(data);
					if(i==2) rb2.setText(data);
					if(i==3) rb3.setText(data);
					if(i==4) rb4.setText(data);
					if(i==5) corretta1 = data;
					if(i==6) domanda2.setText(data);
					if(i==7) rb5.setText(data);
					if(i==8) rb6.setText(data);
					if(i==9) rb7.setText(data);
					if(i==10) rb8.setText(data);
					if(i==11) corretta2=data;
					if(i==12) domanda3.setText(data);
					if(i==13) rb9.setText(data);
					if(i==14) rb10.setText(data);
					if(i==15) rb11.setText(data);
					if(i==16) rb12.setText(data);
					if(i==17) corretta3=data;
					i++;
				}
				data=myscanner.nextLine();
			}
			myscanner.close();
		} catch(FileNotFoundException e) {
			System.out.println("Errore file testo");
			e.printStackTrace();
		}
	}
	


	public void conferma() {
		String selezione;
		if(domanda1.isVisible()) {
			RadioButton test = (RadioButton) Quiz1.getSelectedToggle(); 
			selezione = test.getText();
			if(selezione.equals(corretta1)) { 
				errore.setVisible(false);
				domanda1.setVisible(false);
				vbox1.setVisible(false);
				domanda2.setVisible(true);
				vbox2.setVisible(true);
			}else {
				errore.setVisible(true);   		
			}
		} else if(domanda2.isVisible()) {
			RadioButton test = (RadioButton) Quiz2.getSelectedToggle(); 
			selezione = test.getText();
			if(selezione.equals(corretta2)) { 
				errore.setVisible(false);
				domanda2.setVisible(false);
				vbox2.setVisible(false);
				domanda3.setVisible(true);
				vbox3.setVisible(true);
			}else {
				errore.setVisible(true);   		
			}
		} else if(domanda3.isVisible()) {
			RadioButton test = (RadioButton) Quiz3.getSelectedToggle(); 
			selezione = test.getText();
			if(selezione.equals(corretta3)) { 
				errore.setVisible(false);
				domanda3.setVisible(false);
				vbox3.setVisible(false);
				conferma.setVisible(false);
				quiz.setVisible(false);
				pane1.setVisible(true);
			}	else {
				errore.setVisible(true);   		
			}
		}
	}



	public void conf1() {
		String txt1 = text1.getText();
		String txt2 = text2.getText();
		String txt3 = text3.getText();
		String txt4 = text4.getText();
		err1.setVisible(false);
		err2.setVisible(false);
		err3.setVisible(false);
		err4.setVisible(false);
		if(!txt1.equals("000011")) {
			err1.setVisible(true);			
		}
		if(!txt2.equals("001111")) {
			err2.setVisible(true);			
		}
		if(!txt3.equals("000100")) {
			err3.setVisible(true);			
		}
		if(!txt4.equals("000101")) {
			err4.setVisible(true);			
		}
		if(txt1.equals("000011") && txt2.equals("001111") && txt3.equals("000100") && txt4.equals("000101")) {
			es2.setVisible(true);
			text5.setVisible(true);
			conff1.setVisible(false);
			conff2.setVisible(true);
		}
	}
	
	public void conf2() {		
		String txt5=text5.getText();
		if(!txt5.equals("110001")) {
			err5.setVisible(true);
		} else {
			err5.setVisible(false);
			conff2.setVisible(false);
			text6.setVisible(true);
			es3.setVisible(true);
			conff3.setVisible(true);
			lab.setVisible(true);
		}
	}
	
	public void conf3() {
		err6.setVisible(false); 
		String txt6=text6.getText();
		if(!txt6.equals("49")) {
			err6.setVisible(true);
		} else {
			err5.setVisible(false);
			conff2.setVisible(false);
			complimenti.setVisible(true);
			menuret.setVisible(true);
		}
	}
	
	public void enter1() {
		text1.setOnKeyPressed(a->{
			if(a.getCode()==KeyCode.ENTER) conf1();
		});
		text2.setOnKeyPressed(b->{
			if(b.getCode()==KeyCode.ENTER) conf1();
		});
		text3.setOnKeyPressed(c->{
			if(c.getCode()==KeyCode.ENTER) conf1();
		});
		text4.setOnKeyPressed(d->{
			if(d.getCode()==KeyCode.ENTER) conf1();
		});
	}
	
	public void enter2() {
		text5.setOnKeyPressed(e->{
			if(e.getCode()==KeyCode.ENTER) conf2();
		});
	}
	
	public void enter3() {
		text6.setOnKeyPressed(e->{
			if(e.getCode()==KeyCode.ENTER) conf3();
		});
	}
	
	public void m_return() throws IOException {
		Stage primaryStage = (Stage) menuret.getScene().getWindow();
		Parent newRoot = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		primaryStage.getScene().setRoot(newRoot);
	}
	

	public void avanti1() {
		border1.setVisible(false);
		border2.setVisible(true);
	}
	public void avanti2() {
		border2.setVisible(false);
		border3.setVisible(true);
	}    
	public void avanti3() {
		border3.setVisible(false);
		border4.setVisible(true);
	}    
	public void avanti4() {
		border4.setVisible(false);
		border5.setVisible(true);
	}
	public void startquiz() { 
			border5.setVisible(false);
			quiz.setVisible(true);
			loadtxt();
		}
	
	public void indietro1() throws IOException {
		Stage primaryStage = (Stage) indietro_menu.getScene().getWindow();
		Parent newRoot = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		primaryStage.getScene().setRoot(newRoot);
	}
	public void indietro2() {
		border1.setVisible(true);
		border2.setVisible(false);
	}
	public void indietro3() {
		border2.setVisible(true);
		border3.setVisible(false);
	}
	public void indietro4() {
		border3.setVisible(true);
		border4.setVisible(false);
	}
	public void indietro5() {
		border4.setVisible(true);
		border5.setVisible(false);
	}
	public void menureturn() throws IOException {
		Stage primaryStage = (Stage) menu_return.getScene().getWindow();
		Parent newRoot = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		primaryStage.getScene().setRoot(newRoot);
	}
}

