package TaskEmployee;

public class Employee {
	final int MIN_TASK_TIME = 0;
	final int MIN_WORKER_TIME = 0;
	final private String name;
	private Task currentTask;
	private int hoursLeft;
	private static  AllWork allWork;

	Employee(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			this.name = "Invalid name";
		}
	}

	void startWorkingDay() {
		this.setHoursLeft(8);
		System.out.println(this.getName() + " start work today!");
	}

	 void work() {
		while (this.hoursLeft > 0) {
			if (this.currentTask == null || this.currentTask.getWorkingHours() == 0) {
				this.currentTask = this.allWork.getNextTask();
				if (this.currentTask == null) {
					System.out.println("No task for " + this.getName());
					break;
				}
				System.out.println(this.getName() + " start work on " + this.getCurrentTask().getName());
				this.activityDuringDay();
			} else {
				System.out.println(this.getName() + " continue work on " + this.getCurrentTask().getName());
				this.activityDuringDay();
			}
		}

	}

	 void activityDuringDay() {
		if (this.getHoursLeft() < this.currentTask.getWorkingHours()) {
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.getHoursLeft());
			this.setHoursLeft(0);
			System.out.println(this.getName() + " finished work for today!");
			System.out.println(this.getName() + " has more " + this.getCurrentTask().getWorkingHours()
					+ "hours until end of his current task!");

		}
		if (this.getHoursLeft() >= this.currentTask.getWorkingHours()) {
			this.setHoursLeft(this.getHoursLeft() - this.currentTask.getWorkingHours());
			this.currentTask.setWorkingHours(0);
			System.out.println(this.getName() + " finished work on " + this.getCurrentTask().getName());
			System.out.println(this.getName() + " has more " + this.getHoursLeft() + " hours until end of the day!");
		}
	}

	// getter for AllWork
	public static AllWork getAllWork() {
		return Employee.allWork;
	}

	// setter for AllWork
	public static void setAllWork(AllWork allWork) {
		if (allWork != null) {
			Employee.allWork = allWork;
		}
	}

	// getter name
	public String getName() {
		return name;
	}
	// without setter, bacause worker name can not be changed

	// getter hoursLeft
	public int getHoursLeft() {
		return hoursLeft;
	}

	// setter hoursLeft
	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= MIN_WORKER_TIME) {
			this.hoursLeft = hoursLeft;
		}
	}

	public Task getCurrentTask() {
		return this.currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

}
