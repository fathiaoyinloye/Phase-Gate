public class StudentGrade{
	private int noOfStudents;
	private int noOfSubjects;
	private Subject[] subjects = new Subject[noOfStudents];
	private Student[] students = new Student[noOfSubjects];
	private int[] scores = new int[noOfStudents];
	



	public StudentGrade(int noOfStudents, int noOfSubjects, int[] scores){
		this.noOfStudents = noOfStudents;
		this.noOfSubjects = noOfSubjects;
		this.scores = scores

	}
	public void addSubjects(Subject mySubject){
		Subject subject = new Subject();
		for(Object sub : subjects){
			if(sub == null){
				sub = mySubject;
				break;

			}


		}
		
	}

	public Subject[] getSubjects(){
		return subjects;
	}

	







}
	