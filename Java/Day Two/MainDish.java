import java.util.ArrayList;
public class MainDish{
	public static int getPositionOfTheChar(String letters, char ch ){
		int firstIndexNewWord = 0;
		for(int count = 0; count < letters.length(); count++){
			if(letters.charAt(count) == ch){
				firstIndexNewWord = count;
					break;
			}
		}
		return firstIndexNewWord;
		

	}
	public static String getanotherString(String letters, char ch ){
		int firstIndexNewWord = getPositionOfTheChar(letters,ch);
		String newWord = letters.substring(firstIndexNewWord + 1, letters.length());
		String result  = "";
			for (int count = firstIndexNewWord; count >= 0; count--){

				result += letters.charAt(count);
			}	
		
		return result + newWord;
		

	}


	 public static ArrayList <Integer> getNumbersThatOccursOnce(int[] numbers){
		ArrayList <Integer> myArrayList = new ArrayList <Integer>();

		for(int count = 0; count < numbers.length; count++){
			int check = 0;
			for (int counter = count + 1; counter < numbers.length; counter++){
				if(numbers[count] == numbers[counter]){
					numbers[count] = 0;
					numbers[counter] =0;
				}
				
			}
			if(check == 0 & numbers[count] != 0) 
			myArrayList.add(numbers[count]);

		}

	return myArrayList;	

	}

 	public static int sumNumbersThatOccursOnce(int[] numbers){
		ArrayList <Integer> myArrayList = new ArrayList <Integer>();

		for(int count = 0; count < numbers.length; count++){
			int check = 0;
			for (int counter = count + 1; counter < numbers.length; counter++){
				if(numbers[count] == numbers[counter]){
					numbers[count] = 0;
					numbers[counter] =0;
				}
				
			}
			if(check == 0 & numbers[count] != 0) 
			myArrayList.add(numbers[count]);

		}
			int sum = 0;
		for(int count = 0; count < myArrayList.size();count++){
			
			sum+=myArrayList.get(count);
		}
		return sum;

	}



	public static int getOccurrenceOfTheChar(String letters, char ch ){
		int occurrence = 0;
		for(int count = 0; count < letters.length(); count++){
			if(letters.charAt(count) == ch)
				occurrence += 1;
				
			}
		return occurrence;
	}
	public static int[] getindexOfLargest(int[][] arrays){
		int[] array = new int[2];
		int largest = arrays[0][0];
		for(int indexArrays = 0; indexArrays < arrays.length; indexArrays++){
			for(int innerElement = 0;  innerElement < arrays.length; innerElement++){
				if(arrays[indexArrays][innerElement] > largest){
					largest = arrays[indexArrays][innerElement];
					array[0] = indexArrays;
					array[1] = innerElement;
				}
			}
		

		}
		return array;
	}



	


}