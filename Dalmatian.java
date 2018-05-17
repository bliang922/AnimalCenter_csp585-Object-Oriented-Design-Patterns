package csp585homework4;

public class Dalmatian extends Dog{
	static int object_count=0;

public Dalmatian(String name, Boolean readyAdopt, String medicalCondition, String animalPic, String notes){
	
	this.type="Dalmation";
	this.name=name;
	this.readyAdopt=readyAdopt;
	this.medicalCondition=medicalCondition;
	this.animalPic=animalPic;
	this.notes=notes;	
	
}

public String draw(){
	return "This is a picture of dalmatian";
	
}

public String walk(){
	return "I walk in a Dalmatian manner";
	
}

}
