package csp585homework4;
import java.awt.*;

import javax.swing.*;

public class View {
	JFrame mainFrame=new JFrame();		
    TextField[] fields=new TextField[6];
	Button buttonAdd= new Button(" + ");
	Button buttonRemove= new Button(" - ");
	Button buttonToString= new Button(" toString ");
	Button buttonDraw= new Button(" Draw ");
	Button buttonFeed= new Button(" Feed ");

	Button buttonStatic= new Button(" Static ");

	TextArea displayTextArea = new TextArea(20,40);
	List animalList=new List(10);
	public View(){
		Panel inputPanel=new Panel();
		inputPanel.setSize(100, 400);
		Panel listPanel=new Panel();
		listPanel.setSize(100, 500);

		Panel displayPanel=new Panel();
		displayPanel.setSize(300, 500);
		Panel addPanel=new Panel();
		addPanel.setSize(100, 500);

	    Label label0=new Label("type");
	    Label label1=new Label("name");
	    Label label2=new Label("readyAdopt");
	    Label label3=new Label("medicalCondition");
	    Label label4=new Label("animalPic");
	    Label label5=new Label("notes");
	    fields[0] = new TextField(10);
	    fields[1] = new TextField(10);
	    fields[2] = new TextField(10);
	    fields[3] = new TextField(10);
	    fields[4] = new TextField(10);
	    fields[5] = new TextField(10);
	    inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
	    inputPanel.add(label0);
	    inputPanel.add(fields[0]);
	    inputPanel.add(label1);
	    inputPanel.add(fields[1]);
	    inputPanel.add(label2);
	    inputPanel.add(fields[2]);
	    inputPanel.add(label3);
	    inputPanel.add(fields[3]);
	    inputPanel.add(label4);
	    inputPanel.add(fields[4]);
	    inputPanel.add(label5);
	    inputPanel.add(fields[5]);
	    
		addPanel.setLayout(new BoxLayout(addPanel, BoxLayout.Y_AXIS));
		addPanel.add(buttonAdd);
		addPanel.add(buttonRemove);
		addPanel.add(buttonDraw);
		addPanel.add(buttonToString);
		addPanel.add(buttonStatic);
		addPanel.add(buttonFeed);

		listPanel.setLayout(new FlowLayout());
		listPanel.add(animalList);
		displayPanel.add(displayTextArea);
		mainFrame.setLayout(new FlowLayout());
		mainFrame.add(inputPanel);
		mainFrame.add(addPanel);
		mainFrame.add(listPanel);
		mainFrame.add(displayPanel);
	    mainFrame.setSize(600, 600);

	}
	
}