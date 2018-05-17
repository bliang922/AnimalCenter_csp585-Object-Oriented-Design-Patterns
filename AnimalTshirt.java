package csp585homework4;

public class AnimalTshirt extends AnimalCloth{
	AnimalTshirt(Animal animal){
		super(animal);
	}
	public String toString(){
		return animal.toString()+"\nthis animal wears a T-shirt";
	}
	public String draw(){
		return animal.draw()+"\nthe animal in the picture wears a T-shirt";
	}
}
