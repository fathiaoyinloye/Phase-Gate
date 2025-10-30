public class practiceJava{

	public static void main (String... args){
		String myString = "fola";
		String palindrome = "";
		for (int count = 0; count < myString.length(); count++){
			palindrome = myString.charAt(count) + palindrome;
		}
		//System.out.print(palindrome);



String[] myArray = {"fathia", "madam", "tope"};
boolean[] newArray = new boolean[myArray.length];
	for(int count = 0; count < myArray.length; count++){
		String palindrome2 = "";

		for(int counter = 0; counter < myArray[count].length(); counter++){
			palindrome2 = myArray[count].charAt(counter) + palindrome2;
		}
		if (myArray[count].equals (palindrome2))
			newArray[count] = true;
		else
			newArray[count] = false;
		
		
	}


boolean[] fghj = isElementPalindrome(myArray);
	System.out.print(fghj[0]);


}








public static boolean isPalindrome(String myString){
	String palindrome = "";
		for (int count = 0; count < myString.length(); count++){
			palindrome = myString.charAt(count) + palindrome;
		}

	if (myString.equalsIgnoreCase(palindrome))
		return true;
	else
		return false;
}


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




}