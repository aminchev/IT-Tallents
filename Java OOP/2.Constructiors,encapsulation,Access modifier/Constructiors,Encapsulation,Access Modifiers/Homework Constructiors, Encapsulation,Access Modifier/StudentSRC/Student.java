
public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	Student(){
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	Student(String name, String subject, int age){
		this();
		if(name != null && !name.equals("")){
			this.name = name;
		}
		else{
			this.name = "Invalid name";
		}
		
		if(subject != null && !subject.equals("")){
			this.subject = subject;
		}
		else{
			this.subject = "Invalid subject";
		}
		
		if(age>7){
			this.age = age;
		}
		else{
			this.age = 0;
		}
	}

	void upYear(){
		if(this.isDegree == false){
			this.yearInCollege++;
		}
		else{
			System.out.println(this.name + " was already graduated");
		}
		if(this.yearInCollege == 4){
			this.isDegree = true;
		}
	}
	
	double receiveScholarship(double min, double amount){
		if(this.grade>=min && this.age<30){
			this.money = this.money+amount;
		}
		return this.money;
	}
}

