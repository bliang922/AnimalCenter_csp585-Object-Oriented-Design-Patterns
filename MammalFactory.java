package csp585homework4;

public class MammalFactory implements AnimalFactory{
	public Animal createAnimal(String[] inputs){
		String type,name, medicalCondition, animalPic,notes;
		Boolean readyAdopt;
		type=inputs[0];
		name=inputs[1];
		readyAdopt=Boolean.parseBoolean(inputs[2]);
		medicalCondition=inputs[3];
		animalPic=inputs[4];
		notes=inputs[5];
        Animal ret;
	    switch(type){
	    case "Poodle":
				ret= new Poodle(name, readyAdopt, medicalCondition, animalPic,  notes);
				break;
	    case "Dalmatian":
	    	ret= new Dalmatian(name, readyAdopt, medicalCondition, animalPic,  notes);
	    	break;
		case "Cat":
			ret= new Cat(name, readyAdopt, medicalCondition, animalPic,  notes);
			break;
		default:
		    ret= null;		
	    }   
	    if(notes.equals("wear hat")) return new AnimalHat(ret);
	    else if(notes.equals("wear Tshirt")) return new AnimalTshirt(ret);
	    return ret;
	}
}
