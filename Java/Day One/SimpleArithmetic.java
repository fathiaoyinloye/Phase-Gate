import java.util.Random;
import java.util.Scanner;

public class SimpleArithmetic{

	public static void main (String... args){
		Scanner scanner = new Scanner(System.in);

		System.out.println(showMenu());
		Long timeOne = System.currentTimeMillis();
		int passes = 0;
		int numberPlay = 10;
		while (numberPlay > 0){
			int count = 0;
			int[] game = generateAndSubtractRandomNumbers();
			while(count < 2){
				System.out.print("What is " + game[0] + " - " + game[1] + ": ");
				int choice = scanner.nextInt();
				if (choice == game[2]){
					System.out.println("Bravo! That's great");
					passes += 1;
					numberPlay -= 1;
					break;
				}
				else{
					if (count == 1){
					System.out.println("You have exhasted your last trial");
						break;
						
					}
					System.out.println("You can do it sweetheart, Try Again");
					numberPlay -= 1;
					
			
			count += 1;
			}

		}


		}
		Long timeTwo = System.currentTimeMillis();
		Long timeUsed = timeTwo - timeOne;
		Long timeInSeconds = timeUsed/1000;
		System.out.println("The time used is: " + timeInSeconds + "Seconds");
		System.out.print("Your Total score is: "+ passes +"/10");


	}

	public static int[] generateAndSubtractRandomNumbers(){
		Random random = new Random();

	int numberOne = random.nextInt(20,51);
	int numberTwo = random.nextInt(1, 20);
	int subtract = numberOne - numberTwo;
	int[] result = {numberOne, numberTwo, subtract};

	return result;


	}

	public static String showMenu(){

	String menu ="""
*********************************************************
*	Welcome Victorious Jewel!!!			*
*	Let  Solve Subtraction Arithmetic Problem	*
*	Your Writing Material With You			*
*	Get Ready For An Amazing Experince		*
*	Bring Out The Genius in You			*
*********************************************************
""";
	return menu;
	
	}






}
