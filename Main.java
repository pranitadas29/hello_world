package com.pranita.practice;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions=new Dimensions(20,20,5);
		Case theCase =new Case("223B","Dell",240,dimensions);
		Resolution resolution=new Resolution(10,20);
		Monitor theMonitor=new Monitor("27 inch Beast","Acer",27,resolution);
		Motherboard theMotherboard=new Motherboard("BJ-200","Asus",4,6,"v24.4");
		PC thePC =new PC(theCase,theMonitor,theMotherboard);
		
		thePC.getMonitor().drawPixcelAt(1500, 1200, "red");
		thePC.getMotherboard().loadProgram("windows 1.0");
		thePC.getTheCase().PressPowerButton();

	}

}
