import java.util.Scanner;
public class StudentGradeMain{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of student: ");
		int noOfStudent =  scanner.nextInt();


		System.out.print("Enter the number of sujects: ");
		int noOfSubjects =  scanner.nextInt();

		StudentGrade grade = new StudentGrade(noOfStudent, noOfSubjects, );


		Object output[] = grade.getSubjects();



			Subject subject = new Subject("Mathematics", 8);
		
			int[] scores = {40,3,5,6};
			subject.setScores(scores);
			subject.calculateTotal();
		
		System.out.print(subject.getTotal());
	}






}