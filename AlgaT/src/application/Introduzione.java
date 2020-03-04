package application;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class Introduzione {
	public Button indietro_menu;
	public BorderPane border1;
	public BorderPane border2;
	public BorderPane border3;
	public BorderPane border4;
	public BorderPane border5;
	public BorderPane border6;
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
	public RadioButton rb13;
	public RadioButton rb14;
	public RadioButton rb15;
	public RadioButton rb16;
	public RadioButton rb17;
	public RadioButton rb18;
	public RadioButton rb19;
	public RadioButton rb20;
	public Button conferma;
	public Button aggiungi;
	public Button menu_return;
	public Label errore;
	ToggleGroup Quiz1 = new ToggleGroup();
	ToggleGroup Quiz2 = new ToggleGroup();
	ToggleGroup Quiz3 = new ToggleGroup();
	ToggleGroup Quiz4 = new ToggleGroup();
	ToggleGroup Quiz5 = new ToggleGroup();
	public Label domanda1;
	public Label domanda2;
	public Label domanda3;
	public Label domanda4;
	public Label domanda5;
	public String corretta1;
	public String corretta2;
	public String corretta3;
	public String corretta4;
	public String corretta5;
	@FXML
	TextField inser;
	public Label l1;
	public Label l2;
	public Label l3;
	public Label l0;
	public Label errtab;


	public void loadtxt() { 
		File testo = new File ("src\\quiz1.txt");
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
		rb13.setToggleGroup(Quiz4);
		rb14.setToggleGroup(Quiz4);
		rb15.setToggleGroup(Quiz4);
		rb16.setToggleGroup(Quiz4);
		rb17.setToggleGroup(Quiz5);
		rb18.setToggleGroup(Quiz5);
		rb19.setToggleGroup(Quiz5);
		rb20.setToggleGroup(Quiz5);

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
					if(i==17) corretta3 = data;
					if(i==18) domanda4.setText(data);
					if(i==19) rb13.setText(data);
					if(i==20) rb14.setText(data);
					if(i==21) rb15.setText(data);
					if(i==22) rb16.setText(data);
					if(i==23) corretta4 = data;
					if(i==24) domanda5.setText(data);
					if(i==25) rb17.setText(data);
					if(i==26) rb18.setText(data);
					if(i==27) rb19.setText(data);
					if(i==28) rb20.setText(data);
					if(i==29) corretta5 = data;
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
	

	public void spaziovuoto(String text,int m) {
		String riga0=l0.getText();
		String riga1=l1.getText();
		String riga2=l2.getText();
		String riga3=l3.getText();
		if(text.equals(riga1) || text.equals(riga2) || text.equals(riga3) || text.equals(riga0) ) {
			errtab.setText("Il numero è gia presente nella tabella");
			errtab.setVisible(true);
		} else {
			if(m==0) {
				if (l0.isVisible()==false) {
					l0.setText(text);
					l0.setVisible(true);
					inser.setText("");
				}else m=m+1;
			} 	if(m==1) {
				if (l1.isVisible()==false) {
					l1.setText(text);
					l1.setVisible(true);
					inser.setText("");
				}else m=m+1;
			} if(m==2) {
				if (l2.isVisible()==false) {
					l2.setText(text);
					l2.setVisible(true);
					inser.setText("");
				}else m=m+1;
			} if(m==3) {
				if (l3.isVisible()==false) {
					l3.setText(text);
					l3.setVisible(true);
					inser.setText("");
				} else {
					m=0;
					if (l0.isVisible()==false) {
						l0.setText(text);
						l0.setVisible(true);
						inser.setText("");
					}else if(l1.isVisible()==false) {
						l1.setText(text);
						l1.setVisible(true);
						inser.setText("");
					}else {	
						l2.setText(text);
						l2.setVisible(true);
						inser.setText("");
					}
				}
			}
		}
	}

	
	public void inserisci() {
		String text = inser.getText();
		try {
			errtab.setVisible(false);
			int n = Integer.parseInt(text);
			int m=n%4;
			if(l0.isVisible()==false || l1.isVisible()==false || l2.isVisible()==false || l3.isVisible()==false) {
				spaziovuoto(text,m);
			}	else { errtab.setText("La tabella è piena. Puoi iniziare il quiz!");
			errtab.setVisible(true);
			}
		}
		catch (NumberFormatException e) {
			errtab.setText("Errore, inserisci un intero!");
			errtab.setVisible(true);
		}
	}
	

	public void enter() {
		inser.setOnKeyPressed(e->{
			if(e.getCode()==KeyCode.ENTER) inserisci();
		});
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
				domanda4.setVisible(true);
				vbox4.setVisible(true);
			}	else {
				errore.setVisible(true);   		
			}
		}	else if(domanda4.isVisible()) {
			RadioButton test = (RadioButton) Quiz4.getSelectedToggle(); 
			selezione = test.getText();
			if(selezione.equals(corretta4)) { 
				errore.setVisible(false);
				domanda4.setVisible(false);
				vbox4.setVisible(false);
				domanda5.setVisible(true);
				vbox5.setVisible(true);
			}	else {
				errore.setVisible(true);   		
			}
		} else if(domanda5.isVisible()) {
			RadioButton test = (RadioButton) Quiz5.getSelectedToggle(); 
			selezione = test.getText();
			if(selezione.equals(corretta5)) { 
				errore.setVisible(false);
				quiz.setVisible(false);
				finequiz.setVisible(true);
			}	else {
				errore.setVisible(true);   		
			}
		}
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
		if (l1.isVisible() && l2.isVisible() && l3.isVisible() && l0.isVisible()) {
			border5.setVisible(false);
			errtab.setVisible(false);
			quiz.setVisible(true);
			loadtxt();
		} else {
			errtab.setText("Inserisci altri interi per completare la tabella!");
			errtab.setVisible(true);
		}
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

