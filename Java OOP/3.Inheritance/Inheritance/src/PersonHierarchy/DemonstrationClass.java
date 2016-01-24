package PersonHierarchy;

import java.nio.channels.ShutdownChannelGroupException;

public class DemonstrationClass {

	public static void main(String[] args) {
		Person[] persons = new Person[10];

		Person andrey = new Person("Andrey", 20, true);
		Person borqna = new Person("Borqna", 21, false);
		Student ceco = new Student("Ceco", 22, true, 5);
		Student denica = new Student("Denica", 23, false, 5.8);
		Employee elena = new Employee("Elena", 24, false, 80);
		Employee filip = new Employee("Filip", 25, true, 100);

		
		persons[0] = andrey;
		persons[1] = borqna;
		persons[2] = ceco;
		persons[3] = denica;
		persons[4] = elena;
		persons[5] = filip;

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				if (persons[i] instanceof Student) {
					((Student) persons[i]).showStudentInfo();
				}
				if (persons[i] instanceof Employee) {
					((Employee) persons[i]).showEmployeeInfo();
				}
				if (persons[i] instanceof Person) {
					persons[i].showPersonInfo();
				}
				
			}
		}

		 for (int i = 0; i < persons.length; i++) {
			 if (persons[i] != null) {
				 if(persons[i] instanceof Employee){
					 double sum = ((Employee) persons[i]).calculateOverTime(2);
					 System.out.println(sum);
				 }
			 }
		 }
		
	}

}
