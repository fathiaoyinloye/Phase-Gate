public class MyFunctions{
	public static boolean isPalindrome(String myString){

		String reverse = "";

		for(int counter = 0; counter < myString.length(); counter++){
			reverse = myString.charAt(counter) + reverse;
		}

			if (myString.equals (reverse))
				return true;
			
		return false;


		}






	public static boolean[] isElementPalindrome(String[] myArray){
		boolean[] newArray = new boolean[myArray.length];
			for(int count = 0; count < myArray.length; count++){
				
				newArray[count] = isPalindrome(myArray[count]);
		
		}
					return newArray;


	}


		




	



	public static boolean[] isElementIsAPerfectNumber(int[] myNumber){


		boolean[] isAPerFectSquare = new boolean[myNumber.length];

		for (int index = 0; index < myNumber.length; index++){
			int divisor = 2;
			while(myNumber[index] % divisor != 0){
				divisor++;

			}
			int numberInHalf = myNumber[index]/divisor;
			if(myNumber[index] == 1)
					isAPerFectSquare[index] = true;

			else if(myNumber[index] == numberInHalf * numberInHalf)
				isAPerFectSquare[index] = true;
			else

			isAPerFectSquare[index] = false;


		}
		
		return isAPerFectSquare;



	}










}