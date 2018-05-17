package csp585homework4;

public class AnimalCenter {
	public static void main(String[] agrs){
		
		View view=new View();
		Data data=new Data();
		Controler controler=new Controler(data,view);
	    view.buttonAdd.addActionListener(controler.addButtonListener);
	    view.buttonRemove.addActionListener(controler.removeButtonListener);
	    view.buttonStatic.addActionListener(controler.staticButtonListener);
	    view.buttonDraw.addActionListener(controler.drawButtonListener);
	    view.buttonToString.addActionListener(controler.toStringButtonListener);
	    view.buttonFeed.addActionListener(controler.feedButtonListener);

		view.mainFrame.setVisible(true);

	}
	


}
