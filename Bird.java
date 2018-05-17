package csp585homework4;

public abstract class Bird implements Animal{
	String name;
	String type;
	Boolean readyAdopt;
	String medicalCondition;
	String animalPic;
	String notes;
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public String toString(){
		return "Animal Name: "+name+"   Animal Type: "+type+"\nReady for Adoption: "+readyAdopt+"   Medical Condition: "+medicalCondition+
				"\nPicture of the animal: "+animalPic+"\nNote: "+notes;
	}
	public String draw(){
		return "this method can only be called by concrete object";
	}
	
	public String sing(){
		return "this method can only be called by concrete object";
	}
}
