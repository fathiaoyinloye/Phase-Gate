import java.util.Scanner;
import java.util.Random;
public class QuizGame{
	public static void main (String... args){
		Scanner scanner = new Scanner(System.in);

		int score = 0;
		int trial = 0;
		System.out.println(showMenu());
		boolean keepGoing = true;

		while(keepGoing){
			System.out.println(showOptions());
			System.out.print("choose from the option above: ");
			String option = scanner.nextLine();
			switch(option){
				case "1"-> {
					String[] questions = questionsAndAnswers();
					String answer = questions[2];
					System.out.println(questions[0]);
					System.out.println(questions[1]);

					System.out.print("Choose your answer from the above option lettered (a - b): ");
					String choice = scanner.nextLine();
					if (choice.equals(answer)){
						score += 1;
						trial += 1;
						System.out.println("Correct!!! You Are Genius Indeed");
					}
					else{
						trial += 1;
					System.out.println("You Can Always Do Better Sweetheart");
					}
				}

		case  "2" ->{
				if (trial == 0)
					System.out.println("You are a coward, you didnt even get to enjoy the Merry-Go Round");
				else
				System.out.println("You scored " + score + " out of " + trial);
				keepGoing = false;
			}
		default -> System.out.println("Invalid Input, Please Choose From The Above Menu");	
	
	
			}

		}


	}








	public static String[] questionsAndAnswers(){
		Random random = new Random();
		String[][]  questions = {
			{"What is the capital of Nigeria","(a) Lagos (b) Abuja (c) Ikeja" ,"b"},

			{"____ is the recording of transactions on a daily basis in the appropriate book", "(a) book-keeping (b)transaction log (c) keeping", "a"},

			{"_____ is process of recording, classifying, and interpreting the financial data of an organization to enable users make decisions","(a) user guide (b)transaction log (c) Accounting ", "c"},
			{"How many Geo-political zone do we have in Nigeria","(a) 2 (b)4 (c) 3", "b"},
			{"Like two peas in a pod means that","(a) very similar (b)little similarities (c) No similarities", "a"},
			{"The brother of your father is your _____","(a) maga (b)uncle (c)brother ", "c"},
			{"The sister of your mother is your _____","(a) aunty (b)shima (c) sister", "a"},
			{"___ can be seen as a crochet maaterial","(a) pen (b)cotton (c) yarn", "c"},
			{"I can eat millions of this is what figure of speech","(a) hyperbole (b)irony (c) metaphor", "a"},
			{"___ can be seen as a crochet tool","(a) knife (b)cotton (c) Stich maker", "c"},
			{"He is as dirty as a pig is what figure of speech","(a) hyperbole (b)simile (c) metaphor", "b"},
			{"He a pig is what figure of speech","(a) hyperbole (b)simile (c) metaphor", "c"}


		};
		int generateRandomIndex = random.nextInt(0,13);
		String[] question = questions[generateRandomIndex];
	return question;
		
	


	}



	public static String showMenu(){

		String menu ="""
*********************************************************
*		OMOTEMMY QUIZ GAME			*				
*********************************************************
*	Welcome Victorious Jewel!!!			*
*	Let  Get On A Merry Go Round Of Questions	*
*	Fasten Your SeatBelt				*
*	It's gonna be an amazing ride			*
*********************************************************
""";
		return menu;
	}


	public static String showOptions(){


	String options ="""
*********************************************************
*	Choose from the following options		*				
*********************************************************
*	1  	->	Go for the quiz			*
*	2	->	Nay, No Quiz			*
*********************************************************
""";
	return options;



}

}