package PersonHierarchy;

public class Student extends Person{
	private static final int MAX_SCORE_IN_SCHOOL = 6;
	private static final int MIN_SCORE_IN_SCHOOL = 2;
	private double score;
	
	
	//get score
	double getScore(){
		return this.score;
	}
	//set score
	void setScore(double score){
		if(score >=MIN_SCORE_IN_SCHOOL && score <=MAX_SCORE_IN_SCHOOL){
			this.score = score;
		}
	}
	
	Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		setScore(score);
	}
	
	void showStudentInfo(){
		System.out.println("Student name:" +this.getName());
		System.out.println("Student age:" + this.getAge());
		System.out.println("Student is male:" + this.getIsMale());
		System.out.println("Student score:" + this.getScore());
		System.out.println();
	}
}
