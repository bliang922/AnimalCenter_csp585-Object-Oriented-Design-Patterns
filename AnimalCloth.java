package csp585homework4;

public abstract class AnimalCloth implements Animal{
	Animal animal;
	public abstract String toString();
	public abstract String draw();	
	public String getName(){
		return animal.getName();
	}
	public String getType(){
		return animal.getType();
	}
	AnimalCloth(Animal animal){
		this.animal=animal;
	}
}
