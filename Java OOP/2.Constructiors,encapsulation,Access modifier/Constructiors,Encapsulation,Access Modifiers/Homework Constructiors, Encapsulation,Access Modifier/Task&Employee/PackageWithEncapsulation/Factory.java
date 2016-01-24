package PackageWithEncapsulation;

public class Factory {

	public static void main(String[] args) {
		Task zavarqvane = new Task("Zavarqvane", 7);
		Task rqzane = new Task("Rqzane", 3);
		Task kovane = new Task("Kovane", 2);
		Task pocinkovane = new Task("Pocinkovane", 5);
		
		
		Employee ivan = new Employee("Ivan");
		ivan.setHoursLeft(5);
		ivan.currentTask = rqzane;
		
		Employee spas = new Employee("Spas");
		spas.setHoursLeft(4);
		spas.currentTask = zavarqvane;
		
		ivan.work();
		spas.work();
		
		ivan.showReport();
		spas.showReport();
	}

}
