package csp585homework4;

public class AnimalHat extends AnimalCloth{

	
	AnimalHat(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return animal.toString()+"\nthis animal wears a hat";
	}
	public String draw(){
		
		return animal.draw()+"\nthe animal in the picture wears a hat";
	}
}
