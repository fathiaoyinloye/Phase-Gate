public static boolean isPalindrome(String myString){
		String palindrome = "";

		for(int counter = 0; counter < myString.length(); counter++){
			palindrome = myString.charAt(counter) + palindrome;
		}


		if(myString == palindrome)
			return true;
		else
			return false;
		
		return false;

		}