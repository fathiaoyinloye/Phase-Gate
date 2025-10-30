public class MyFunctions{


	public static boolean[] isElementPalindrome(String[] myArray){
		boolean[] newArray = new boolean[myArray.length];
			for(int count = 0; count < myArray.length; count++){
				String palindrome = "";

				for(int counter = 0; counter < myArray[count].length(); counter++){
					palindrome = myArray[count].charAt(counter) + palindrome;
				}

				if (myArray[count].equals (palindrome))
					newArray[count] = true;
				else
					newArray[count] = false;
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