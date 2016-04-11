package Scheduler;

import java.util.Iterator;

public class DemoTasks {
	public static void main(String[] args) throws ShedulerException {
		Scheduler sceduler = new Scheduler();
		
		ITask cooking = new TaskCooking();
		ITask ordering = new TaskOrdering();
		ITask serving = new TaskServing();
		ITask washing = new TaskWashing();
		
		sceduler.push(cooking);
		sceduler.push(ordering);
		sceduler.push(serving);
		sceduler.push(washing);
		
		sceduler.nqkakuvMetod();
		sceduler.nqkakuvMetod();
		sceduler.nqkakuvMetod();
		sceduler.nqkakuvMetod();
		
		//Adding for exception throwing
		sceduler.nqkakuvMetod();
		
		
		
	}
}
