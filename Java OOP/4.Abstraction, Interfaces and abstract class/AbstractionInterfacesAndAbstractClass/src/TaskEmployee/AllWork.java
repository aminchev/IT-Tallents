package TaskEmployee;

public class AllWork {
	private Task[] tasks;
	private int freePlacesForTasks = 10;
	private int currentUnassignedTask = 0;
	int indexOfTasks = 0;

	public AllWork() {
		this.tasks = new Task[getFreePlacesForTasks()];
	}

	void addTask(Task task) {
		if (task != null && freePlacesForTasks > 0) {
			this.tasks[currentUnassignedTask] = task;
			currentUnassignedTask++;
			freePlacesForTasks--;
		}
	}

	Task getNextTask() {
		if (indexOfTasks < currentUnassignedTask) {
			return this.tasks[indexOfTasks++];
		}
		return null;
	}

	boolean isAllWorkDone() {
		for (int i = 0; i < currentUnassignedTask; i++) {
			if (tasks[i].getWorkingHours() != 0) {
				return false;
			}
		}
		return true;
	}

//	public Task[] getTasks() {
//		return this.tasks;
//	}
//
//	public void setTasks(Task[] tasks) {
//		if (tasks != null) {
//			this.tasks = tasks;
//		}
//	}

	public int getFreePlacesForTasks() {
		return this.freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		if (freePlacesForTasks > 0 && freePlacesForTasks <= 10) {
			this.freePlacesForTasks = freePlacesForTasks;
		}
	}

	public int getCurrentUnassignedTask() {
		return this.currentUnassignedTask;
	}

	public void setCurrentUnassignedTask(int currentUnassignedTask) {
		if (currentUnassignedTask >= 0 && currentUnassignedTask <= 9) {
			this.currentUnassignedTask = currentUnassignedTask;
		}
	}

}
