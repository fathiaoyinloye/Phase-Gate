import java.util.ArrayList;
public class ParkingSystemFuction{
	
	public static ArrayList <String> availableParkingSpace(){
		ArrayList <String> myParkingSpace = new ArrayList <String>();
	myParkingSpace.add("1");
	myParkingSpace.add("2");
	myParkingSpace.add("3");
	myParkingSpace.add("4");
	myParkingSpace.add("5");
	myParkingSpace.add("6");
	myParkingSpace.add("7");
	myParkingSpace.add("8");
	myParkingSpace.add("9");
	myParkingSpace.add("10");
	myParkingSpace.add("11");
	myParkingSpace.add("12");
	myParkingSpace.add("13");
	myParkingSpace.add("14");
	myParkingSpace.add("15");
	myParkingSpace.add("16");
	myParkingSpace.add("17");
	myParkingSpace.add("18");
	myParkingSpace.add("19");
	myParkingSpace.add("20");


	return myParkingSpace;





	}


	public static ArrayList <String> occupiedParkingSpace(){
		ArrayList <String> myParkingSpaceTaken = new ArrayList <String>();



		return myParkingSpaceTaken;
	}


		
	public static int getParkingSlot(){
	

		int randomNumber = (int)(Math.random() * availableParkingSpace().size());
							
			



	return randomNumber;

	}




}