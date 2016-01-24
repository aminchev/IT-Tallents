
public class Factory {

	public static void main(String[] args) {
		
		Task pocinkovane = new Task("Pocinkovane", 5);
		Task kovane = new Task("Kovane",4);
		Task zavarqvane = new Task("Zavarqvane", 7);
		Task rqzane = new Task("Rqzane", 2);
		
		Employee ivan = new Employee("Ivan");
		ivan.hoursLeft = 6;
		ivan.currentTask = pocinkovane;
		
		Employee spas = new Employee("Spas");
		spas.hoursLeft = 3;
		spas.currentTask = zavarqvane;
		
		ivan.work();
		spas.work();
		
		ivan.showReport();
		spas.showReport();
				
	}

}
