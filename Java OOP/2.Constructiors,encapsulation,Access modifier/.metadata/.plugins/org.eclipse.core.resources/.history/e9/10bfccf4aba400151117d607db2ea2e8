import java.beans.beancontext.BeanContextChildSupport;

public class Colleage {

	public static void main(String[] args) {
		Student andrey = new Student("Andrey", "Java", 20);
		Student boyan = new Student("Boyan", "Java", 21);
		Student cvetan = new Student("Cvetan", "PHP", 23);
		Student daniel = new Student("Daniel", "PHP", 25);
		Student elena = new Student("Elena", "Java", 22);
		Student filip = new Student("Filip", "Java", 27);
		filip.grade = 5.90;
		Student gop = new Student("Gop", "Java", 19);
		Student hari = new Student("Hari", "Java", 26);
		
		andrey.money = 50;
		andrey.receiveScholarship(3.5, 100);
		System.out.println(andrey.money);
		
		boyan.grade = 5.5;
		boyan.receiveScholarship(5, 200);
		System.out.println(boyan.money);
		
		daniel.isDegree = true;
		cvetan.yearInCollege = 2;
		andrey.yearInCollege = 3;
		
		cvetan.upYear();
		System.out.println("Years in college:" + cvetan.yearInCollege + ",Is degree:"+ cvetan.isDegree);
		
		andrey.upYear();
		System.out.println("Years in college:" + andrey.yearInCollege + ",Is degree:"+ andrey.isDegree);
		
		daniel.upYear();
		
		StudentGroup java1 = new StudentGroup();
		StudentGroup php = new StudentGroup();
		
		System.out.println("Free plases in Java1:" + java1.freePlaces);
		System.out.println("Free plases in PHP:" + php.freePlaces);
		java1.groupSubject = "Java";
		php.groupSubject = "PHP";
		java1.addStudent(andrey);
		java1.addStudent(boyan);
		java1.addStudent(cvetan); //този не го добавя, защото е друга специалност
		java1.addStudent(elena);
		System.out.println("Free plases in Java1:" + java1.freePlaces);
		java1.addStudent(filip);
		System.out.println("Free plases in Java1:" + java1.freePlaces);
		java1.addStudent(gop);
		java1.addStudent(hari);// този не го дабавя, защото няма свободни места
		System.out.println("Free plases in Java1:" + java1.freePlaces);
		
		php.addStudent(cvetan);
		php.addStudent(daniel);
		System.out.println("Free plases in PHP:" + php.freePlaces);
		String bestStudent = java1.bestStudent(java1.students);
		System.out.println("Best student in Java1 group is:" + bestStudent);
		
		php.emptyGroup();
		System.out.println("Free plases in PHP:" + php.freePlaces);
	
		java1.printStudentsInTheGroup(java1.students);
		
		java1.emptyGroup();
		java1.printStudentsInTheGroup(java1.students);
		
	    
	}
	

}
