package csp585homework4;

public class Poodle extends Dog{
	static int object_count;

public Poodle(String name, Boolean readyAdopt, String medicalCondition, String animalPic, String notes){
	
	this.type="Poodle";
	this.name=name;
	this.readyAdopt=readyAdopt;
	this.medicalCondition=medicalCondition;
	this.animalPic=animalPic;
	this.notes=notes;

}

public String draw(){
	return "This is a picture of poodle";
	
}

public String walk(){
	return "I walk in a Poodle manner";
	
}

}
