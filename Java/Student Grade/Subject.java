public class Subject{
	private  String name;
	private int noOfStudent;
	private int[] scores = new int[noOfStudent];
	private int total;
	private double average;
	private int pass;
	private int fail;

	public Subject(){

	}

	public Subject(String name, int noOfStudent){
		this.name = name;
		this.noOfStudent = noOfStudent;
	


	}


	public void setScores(int[] scores){
		this.scores = scores;
		

	}

	public void calculateTotal (){
		int total = 0;
		for(int count = 0; count < scores.length; count++){
		
			total += scores[count];

		}
		this.total = total;
	}
	public int getTotal(){

		return total;
	}

	
	public void calculateAverage(){
		
		average = total * 1.0/noOfStudent;

		this.average = average;
		

	}
	public double getAverage(){
		return average;

	}

	public void calculatePassAndFail(){
		for(int count = 0; count < scores.length; count++){
			if(scores[count] >= average)
				pass += 1;

			else
				fail += 1;
		}


		

	}
	public int getPass(){
		return pass;

	}
	public int getFail(){
		return fail;
	}
}