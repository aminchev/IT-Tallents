public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemomry;
	String operationSystem;
	String name;
	
	Computer(){
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		if(year>1990){
			this.year = year;
		}
		else{
			this.year = 0;
		} 
		
		if(price>0){
			this.price = price;
		}
		else{
			this.price = 0;
		}
		
		if(hardDiskMemory>0){
			this.hardDiskMemory = hardDiskMemory;
		}
		else{
			this.hardDiskMemory = 0;
		}
		
		if(freeMemory>=0 && freeMemory<=hardDiskMemory){
			this.freeMemomry = freeMemory;
		}
		else{
			this.freeMemomry = 0;
		}
	}
	
	Computer(int year, double price, boolean isNoteBook, double hardDiskMemory, double freeMemory, String operationSystem){
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNoteBook;
		
		if(operationSystem != null && !operationSystem.equals("")){
			this.operationSystem = operationSystem;
		}
		else{
			this.operationSystem = "Invalid operation system!";
		}		
	}
	
	int comparePrice(Computer c){
		if(this.price>c.price){
			return -1;
		}
		else 
			if(this.price<c.price){
			return 1;
		}
		else{
			return 0;
		}
		
	}
}