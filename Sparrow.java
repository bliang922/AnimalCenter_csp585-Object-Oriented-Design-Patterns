package csp585homework4;

public class Sparrow extends Bird{

	public Sparrow(String name, Boolean readyAdopt, String medicalCondition, String animalPic, String notes){
		
		this.type="Sparrow";
		this.name=name;
		this.readyAdopt=readyAdopt;
		this.medicalCondition=medicalCondition;
		this.animalPic=animalPic;
		this.notes=notes;	

	}
	public String draw(){
		return "This is a picture of sparrow";
		
	}
	
	public String sing(){
		return "I sing like: chou chou chou";
	}

}
