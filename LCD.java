package katas.tdd.test;

public class LCD {

	public String getLCDNumberRepresentation(int number) {

		String representationOfTheNumberOnLCDWay="";
		
		final String ENTER="\n";
		final String MODE1=  " - " ;
		final String MODE2 = "| |" ;
		final String MODE3 = " - " ;
		final String MODE4 = "| |" ;
		
		final String MODE6=  "|  ";
		final String MODE7 ="  |" ;
		final String MODE8 ="   " ;
		
		switch (number){
		
		case 0 :{ representationOfTheNumberOnLCDWay = MODE1 + ENTER + MODE2 + ENTER + MODE8 + ENTER + MODE2 +ENTER+ MODE1;}
		break;
		case 1 :{ representationOfTheNumberOnLCDWay = MODE8 + ENTER + MODE7 + ENTER + MODE8 + ENTER + MODE7 +ENTER+ MODE8;}
		break;
		case 2 :{ representationOfTheNumberOnLCDWay = MODE1 + ENTER + MODE7 + ENTER + MODE3 + ENTER + MODE6 +ENTER+ MODE1;}
				break;
		case 3 :{ representationOfTheNumberOnLCDWay = MODE1 + ENTER + MODE7 + ENTER + MODE1 + ENTER + MODE7 +ENTER+ MODE1;}
		break;
		case 4 :{ representationOfTheNumberOnLCDWay = MODE2 + ENTER + MODE3 + ENTER + MODE7 ;}
		break;
		case 5 :{ representationOfTheNumberOnLCDWay = MODE1 + ENTER + MODE6 + ENTER + MODE1 + ENTER + MODE7 +ENTER+ MODE1;}
		break;
		case 6 :{ representationOfTheNumberOnLCDWay = MODE1 + ENTER + MODE6 + ENTER+ MODE1 +ENTER + MODE4 + ENTER + MODE1 ;}
		break;
		case 7 :{ representationOfTheNumberOnLCDWay = MODE1 + ENTER + MODE7 + ENTER + MODE8 + ENTER + MODE7 +ENTER+ MODE8;}
		break;
		case 8 :{ representationOfTheNumberOnLCDWay = MODE1 + ENTER + MODE2 + ENTER + MODE1 + ENTER + MODE2 +ENTER+ MODE1;}
		break;
		case 9 :{ representationOfTheNumberOnLCDWay = MODE1 + ENTER + MODE2 + ENTER + MODE1 + ENTER + MODE7 +ENTER+ MODE1;}
		break;
		}

		System.out.println("REPRESENTADO :");
		System.out.println(representationOfTheNumberOnLCDWay);
		
		return representationOfTheNumberOnLCDWay;
		
		
		
	}



}
