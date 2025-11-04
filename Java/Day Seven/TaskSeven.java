public class TaskSeven{
	public static void main(String... args){
		int sumOfMulitplesOfFour = 0;
		int sumOfMulitplesOfEight = 0;

		for(int count = 4; count <= 1024; count*= 4){

			sumOfMulitplesOfFour += count; 

		}
		for(int count = 8; count <= 32789; count*= 8){

			sumOfMulitplesOfEight += count;

		}



		System.out.print(sumOfMulitplesOfFour + "  " + 	sumOfMulitplesOfEight );

	}

}