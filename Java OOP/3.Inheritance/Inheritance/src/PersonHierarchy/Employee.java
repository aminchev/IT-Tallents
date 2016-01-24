package PersonHierarchy;

public class Employee extends Person {
	private static final int MIN_AGE_FOR_OVERTIME = 18;
	private static final double RATE_FOR_OVERTIME = 1.5;
	private static final int DAY_WORKING_HOURS = 8;
	private double daySalary;
	
	//getter for daySalary
	double getDaySalary(){
		return this.daySalary;
	}
	//setter for daySalary
	void setDaySalary(double daySalary){
		if(daySalary>0){
			this.daySalary = daySalary;
		}
	}
	
	Employee(String name, int age, boolean isMale, double daySalary){
		super(name, age, isMale);
		setDaySalary(daySalary);
	}
	
    double calculateOverTime(double hours){
    	double overtimeMoney=0;
		if(hours>0){
			if(this.getAge()>MIN_AGE_FOR_OVERTIME){
				overtimeMoney = (this.getDaySalary()/DAY_WORKING_HOURS) * RATE_FOR_OVERTIME * hours;
			}
		}
		return overtimeMoney;
	}
    
    void showEmployeeInfo(){
    	System.out.println("Employee name:" + this.getName());
    	System.out.println("Employee age:" + this.getAge());
    	System.out.println("Employee is male:" + this.getIsMale());
    	System.out.println("Employee day salary:" + this.getDaySalary());
    	System.out.println();
    }
	
}
