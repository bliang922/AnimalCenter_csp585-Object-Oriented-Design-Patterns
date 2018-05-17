package csp585homework4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class Controler{
	Data data;
	View view;
	AddButtonListener addButtonListener=new AddButtonListener();
	RemoveButtonListener removeButtonListener=new RemoveButtonListener();
    StaticButtonListener staticButtonListener=new StaticButtonListener();
    DrawButtonListener drawButtonListener=new DrawButtonListener();
    FeedButtonListener feedButtonListener=new FeedButtonListener();

    ToStringButtonListener toStringButtonListener=new ToStringButtonListener();
	public Controler(Data data, View view){
		this.data=data;
		this.view=view;
	}
	class StaticButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			int countPD=0,countDM=0,countCat=0,countCK=0,countSP=0;

			
			for(Animal temp:data.animalList){
				switch(temp.getType()){
				case "Poodle":
					countPD++;
					break;
				case "Dalmation":
					countDM++;
					break;
				case "Cat":
					countCat++;
					break;
				case "Chicken":
					countCK++;
					break;
				case "Sparrow":
					countSP++;
					break;
					
				}
				


			}
			if(countPD!=0) view.displayTextArea.append("\nPoodle:  "+countPD);
			if(countDM!=0) view.displayTextArea.append("\nDalmatian:  "+countDM);
			if(countCat!=0) view.displayTextArea.append("\nCat:  "+countCat);
			if(countCK!=0) view.displayTextArea.append("\nChicken:  "+countCK);
			if(countSP!=0) view.displayTextArea.append("\nSparrow:  "+countSP);

		}
	}
	private Animal getSelectedItem(){
		Iterator iterator=data.animalList.iterator();
		String name=view.animalList.getSelectedItem();
		while(iterator.hasNext()){
			Animal ret=(Animal) iterator.next();
			if(ret.getName().equals(name))
				return ret;
		}
		return null;
	}
	class ToStringButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			Animal temp=getSelectedItem();

			if(temp!=null){
				view.displayTextArea.append(temp.toString());
				view.displayTextArea.append("\n");
				}	
			}

	}
	class FeedButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			Animal temp=getSelectedItem();
			Context context;
			if(temp!=null){
				if(temp.getType()=="Poodle"|temp.getType()=="Dalmatian")
					{
					context=new Context(new FeedDog());
					}
				else if(temp.getType()=="Cat"){
					context=new Context(new FeedCat());
				}
				else {
					context=new Context(new FeedBird()); 
				}
				view.displayTextArea.append(context.execute()+"\n" );

			}
		}
	}
	class DrawButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			Animal temp=getSelectedItem();
			view.displayTextArea.append(temp.draw());
			view.displayTextArea.append("\n");
	
		}
	}
	class AddButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String[] inputs=new String[6];		
			
			inputs[0]=view.fields[0].getText();
			inputs[1]=view.fields[1].getText();
			inputs[2]=view.fields[2].getText();
			inputs[3]=view.fields[3].getText();
			inputs[4]=view.fields[4].getText();
			inputs[5]=view.fields[5].getText();
			AnimalFactory animalFactory;
			if(inputs[0].equalsIgnoreCase("Poodle")|inputs[0].equalsIgnoreCase("Dalmatian")|inputs[0].equalsIgnoreCase("Cat")){
				 animalFactory= new MammalFactory();
			}
			else if(inputs[0].equalsIgnoreCase("Chicken")|inputs[0].equalsIgnoreCase("Sparrow")){
				 animalFactory=new BirdFactory();
			}
			else {
				view.displayTextArea.append("illigel type input\n");
				return;
			}
			Animal ani=animalFactory.createAnimal(inputs);
				data.animalList.add(ani);
				view.animalList.add(inputs[1]);
			
		}
	}
	
	class RemoveButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Animal temp=getSelectedItem();
			data.animalList.remove(temp);			
			view.animalList.remove(temp.getName());
		}
	}


}
