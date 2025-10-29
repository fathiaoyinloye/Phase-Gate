import java.util.ArrayList;
public class Test{
	public static void main(String... args){
	
		String letters = "abcdefd";
		char firsCharacter = letters.charAt(0);
		 String new_word = "a";
		int indexNewWord = 0;
	
		String removeSuffix = letters.substring(1, letters.length());

		

		int[] numbers = {1,2,3,2,7};
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

	//int[][] arrays  = new int[2][2];
	int[][] arrays = {{1,2,3}, {4,3,5} ,{1,7,4}};
	int [] array = new int[2];
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

	int[] array2 = MainDish.getindexOfLargest(arrays);
	for(int count = 0; count < array2.length; count++){
		System.out.println(array2[count]);
	}
String[][] myArray = {
{"What is the capital of Nigeria","(a) Lagos (b) Abuja (c) Ikeja" ,"b"},
{"What is the capital of Nigeria","(a) Lagos (b) Abuja (c) Ikeja" ,"b"},
{"What is the capital of Nigeria","(a) Lagos (b) Abuja (c) Ikeja" ,"b"}

};

		System.out.println(myArray[0][1]);

}	

}