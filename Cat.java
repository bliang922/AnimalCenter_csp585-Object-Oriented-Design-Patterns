package csp585homework4;

public class Cat extends Mammal{
	public Cat(String name, Boolean readyAdopt, String medicalCondition, String animalPic, String notes){
		
		this.type="Cat";
		this.name=name;
		this.readyAdopt=readyAdopt;
		this.medicalCondition=medicalCondition;
		this.animalPic=animalPic;
		this.notes=notes;		

	}

	public String draw(){
		return "This is a picture of cat";
		
	}

	public String walk(){
		return "I walk in a cat manner";
		
	}

}
