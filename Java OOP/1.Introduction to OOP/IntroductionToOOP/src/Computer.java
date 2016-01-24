
public class Computer {
	int year;
	float price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemomry;
	String operationSystem;
	
	void changeOperationSystem(String operationSystem){
		if(operationSystem != null && !operationSystem.equals("")){
			this.operationSystem = operationSystem;
		}
	}
	
	void useMemory(int memory){
		if(memory>0){
			if(memory>this.freeMemomry){
				System.out.println("Not enough free memory. There is only " + this.freeMemomry );
			}
			else{
			this.freeMemomry = this.freeMemomry - memory;
			}
		}
	}
	
}
