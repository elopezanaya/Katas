package katas.tdd.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class LCDTest {

	final String ENTER="\n";
	final String MODE1=  " - " ;
	final String MODE2 = "| |" ;
	final String MODE3 = " - " ;
	final String MODE4 = "| |" ;
	
	final String MODE6=  "|  ";
	final String MODE7 ="  |" ;
	final String MODE8 ="   " ;
	
	
	@Test
	public void testWithNumberOne() {
		
		LCD lcd = new LCD();
		int number=1;
		
		String lcdRepresentationOfNumberOne=MODE8 + ENTER + MODE7 + ENTER + MODE8 + ENTER + MODE7 +ENTER+ MODE8;
		
		String lcdNumberRepresentation =lcd.getLCDNumberRepresentation(number);
		
		System.out.println("UNO : ");
		System.out.println(lcdRepresentationOfNumberOne);
		
		
		assertTrue(lcdNumberRepresentation.equals(lcdRepresentationOfNumberOne) );
		
	}
	
	@Test
	public void testWithNumberTwo(){
		LCD lcd = new LCD();
		int number=2;
		
		String lcdRepresentationOfNumberTwo=MODE1 + ENTER + MODE7 + ENTER + MODE3 + ENTER + MODE6 +ENTER+ MODE1;
		
		String lcdNumberRepresentation =lcd.getLCDNumberRepresentation(number);
		System.out.println("DOS : ");
		System.out.println(lcdRepresentationOfNumberTwo);
		
		assertTrue(lcdNumberRepresentation.equals(lcdRepresentationOfNumberTwo) );
		
	}
	
	@Test
	public void testWithNumberThree(){
		LCD lcd = new LCD();
		int number=3;
		
		String lcdRepresentationOfNumberThree=MODE1 + ENTER + MODE7 + ENTER + MODE1 + ENTER + MODE7 +ENTER+ MODE1;
		
		String lcdNumberRepresentation =lcd.getLCDNumberRepresentation(number);
		System.out.println("Three : ");
		System.out.println(lcdRepresentationOfNumberThree);
		
		assertTrue(lcdNumberRepresentation.equals(lcdRepresentationOfNumberThree) );
		
	}
	
	@Test
	public void testWithNumberFour(){
		LCD lcd = new LCD();
		int number=4;
		
		String lcdRepresentationOfNumberFour=MODE2 + ENTER + MODE3 + ENTER + MODE7;
		
		String lcdNumberRepresentation =lcd.getLCDNumberRepresentation(number);
		System.out.println("FOUR : ");
		System.out.println(lcdRepresentationOfNumberFour);
		
		assertTrue(lcdNumberRepresentation.equals(lcdRepresentationOfNumberFour) );
		
	}
	
	@Test
	public void testWithNumberFive(){
		LCD lcd = new LCD();
		int number=5;
		
		String lcdRepresentationOfNumberFive=MODE1 + ENTER + MODE6 + ENTER + MODE1 + ENTER + MODE7 +ENTER+ MODE1;
		
		String lcdNumberRepresentation =lcd.getLCDNumberRepresentation(number);
		System.out.println("DOS : ");
		System.out.println(lcdRepresentationOfNumberFive);
		
		assertTrue(lcdNumberRepresentation.equals(lcdRepresentationOfNumberFive) );
		
	}
	
	@Test
	public void testWithNumberSix(){
		LCD lcd = new LCD();
		int number=6;
		
		String lcdRepresentationOfNumberSix=MODE1 + ENTER + MODE6 + ENTER+ MODE1 +ENTER + MODE4 + ENTER + MODE1;
		
		String lcdNumberRepresentation =lcd.getLCDNumberRepresentation(number);
		System.out.println("DOS : ");
		System.out.println(lcdRepresentationOfNumberSix);
		
		assertTrue(lcdNumberRepresentation.equals(lcdRepresentationOfNumberSix) );
		
	}
	
	@Test
	public void testWithNumberSeven(){
		LCD lcd = new LCD();
		int number=7;
		
		String lcdRepresentationOfNumberSeven=MODE1 + ENTER + MODE7 + ENTER + MODE8 + ENTER + MODE7 +ENTER+ MODE8;
		
		String lcdNumberRepresentation =lcd.getLCDNumberRepresentation(number);
		System.out.println("Seven : ");
		System.out.println(lcdRepresentationOfNumberSeven);
		
		assertTrue(lcdNumberRepresentation.equals(lcdRepresentationOfNumberSeven) );
		
	}
	
	@Test
	public void testWithNumberEigth(){
		LCD lcd = new LCD();
		int number=8;
		
		String lcdRepresentationOfNumberEigth=MODE1 + ENTER + MODE2 + ENTER + MODE1 + ENTER + MODE2 +ENTER+ MODE1;
		
		String lcdNumberRepresentation =lcd.getLCDNumberRepresentation(number);
		System.out.println("8 : ");
		System.out.println(lcdRepresentationOfNumberEigth);
		
		assertTrue(lcdNumberRepresentation.equals(lcdRepresentationOfNumberEigth) );
		
	}
	
	@Test
	public void testWithNumberNine(){
		LCD lcd = new LCD();
		int number=9;
		
		String lcdRepresentationOfNumberNine=MODE1 + ENTER + MODE2 + ENTER + MODE1 + ENTER + MODE7 +ENTER+ MODE1;
		
		String lcdNumberRepresentation =lcd.getLCDNumberRepresentation(number);
		System.out.println("9 : ");
		System.out.println(lcdRepresentationOfNumberNine);
		
		assertTrue(lcdNumberRepresentation.equals(lcdRepresentationOfNumberNine) );
		
	}
	
	@Test
	public void testWithNumberZero(){
		LCD lcd = new LCD();
		int number=0;
		
		String lcdRepresentationOfNumberZero=MODE1 + ENTER + MODE2 + ENTER + MODE8 + ENTER + MODE2 +ENTER+ MODE1;
		
		String lcdNumberRepresentation =lcd.getLCDNumberRepresentation(number);
		System.out.println("0 : ");
		System.out.println(lcdRepresentationOfNumberZero);
		
		assertTrue(lcdNumberRepresentation.equals(lcdRepresentationOfNumberZero) );
		
	}

}
