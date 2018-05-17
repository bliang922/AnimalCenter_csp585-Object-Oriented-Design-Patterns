package csp585homework4;

public class Chicken extends Bird{

	public Chicken(String name, Boolean readyAdopt, String medicalCondition, String animalPic, String notes){
		
		this.type="Chicken";
		this.name=name;
		this.readyAdopt=readyAdopt;
		this.medicalCondition=medicalCondition;
		this.animalPic=animalPic;
		this.notes=notes;

	}
	public String draw(){
		return "This is a picture of chicken";
		
	}
	
	public String sing(){
		return "I sing like: ehr ehr ehr";
	}


}
