package Scheduler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.print.attribute.standard.SheetCollate;

public class Scheduler {

	private Queue<ITask> tasks = new LinkedList<ITask>();
	
	void push(ITask task){
		this.tasks.offer(task);
	}
	
	void nqkakuvMetod() throws ShedulerException{
		ITask curTask = tasks.poll();
		if(curTask==null){
			throw new ShedulerException("No more tasks in queue!");
		}
		curTask.doWork();
	}
	
}
