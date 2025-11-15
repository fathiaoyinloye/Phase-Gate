public class Student{
	private String name;
	private int subjects;
	private int[] scores = new int[subjects];
	private double average;
	private int total;

	public Student(){

	}
	
	public Student(String name, int subjects){
		this.name = name;
		this.subjects = subjects;


	}
	
	public void setScores(int[] scores){
		this.scores = scores;
		
	}

	public String getName(){
		return name;
	}

	public int getSujects(){
		return subjects;

	}
	

	public void calculateTotal(int[] scores){
		int total = 0;
		for (int score : scores){
			total += score;

		}
		this.total  = total;

	}


	public int getTotal(){
		return total;

	}

	public void calculateAverage(){
		average = total * 1.0 / subjects;


	}

	public double getAverage(){

		return average;

	}
	
	

}