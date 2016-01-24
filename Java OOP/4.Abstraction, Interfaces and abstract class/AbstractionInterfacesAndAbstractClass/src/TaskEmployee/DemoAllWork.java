package TaskEmployee;

public class DemoAllWork {
	public static void main(String[] args) throws InterruptedException {
		AllWork bigProject = new AllWork();

		Task asfaltirane = new Task("Asfaltirane", 18);
		Task betonirane = new Task("Betonirane", 20);
		Task ciklene = new Task("Ciklene", 13);
		Task dupchene = new Task("Dupchene", 22);
		Task ecvane = new Task("Ecvane", 17);
		Task formirane = new Task("Formirane", 6);
		Task gorene = new Task("Gorene", 3);
		Task hvurlqne = new Task("Hvurlqne", 26);
		Task izpravqne = new Task("Izpravqne", 21);
		Task kosene = new Task("Kosene", 9);

		Task[] zadachi = new Task[] { asfaltirane, betonirane, ciklene, dupchene, ecvane, formirane, gorene, hvurlqne,
				izpravqne, kosene };
		for (int i = 0; i < zadachi.length; i++) {
			bigProject.addTask(zadachi[i]);
		}

		Employee ivan = new Employee("Ivan");
		Employee kiro = new Employee("Kiro");
		Employee spas = new Employee("Spas");
		Employee dido = new Employee("Dido");

		Employee[] rabotnici = new Employee[] { ivan, kiro, spas, dido };

		for (int i = 0; i < rabotnici.length; i++) {
			rabotnici[i].setAllWork(bigProject);
		}

		int dayCounter = 1;
		while (true) {
			System.out.println("Day:" + dayCounter);
			for (int i = 0; i < rabotnici.length; i++) {
				rabotnici[i].startWorkingDay();
				rabotnici[i].work();
			}

			boolean isWorkFinished = bigProject.isAllWorkDone();
			if (isWorkFinished == true) {
				break;
			}
			dayCounter++;
			Thread.sleep(1000);
			System.out.println();
		}

	}

}
