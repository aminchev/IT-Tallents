
public class RealComputers {

	public static void main(String[] args) {
		Computer laptop = new Computer();
		Computer desktopComp = new Computer();
		
		laptop.year = 2014;
		laptop.price = 1499.99f;
		laptop.hardDiskMemory = 800;
		laptop.freeMemomry = 500;
		laptop.operationSystem = "Windows 8";
		String oldSystem = laptop.operationSystem;
		
		desktopComp.year = 2008;
		desktopComp.price = 300;
		desktopComp.hardDiskMemory = 250;
		desktopComp.freeMemomry = 110;
		int memoryBeforeUpload = desktopComp.freeMemomry;
		desktopComp.operationSystem = "Linux";
		
		desktopComp.useMemory(100);
		laptop.changeOperationSystem("Windows 10");
		
		System.out.println("Laptop was made in " + laptop.year + " and its price is " + laptop.price +
		", hard disk - " + laptop.hardDiskMemory + ", free memory now is " + laptop.freeMemomry +		
		" with operation system - " + oldSystem + ", but we upgrade it and now is " + laptop.operationSystem);
		
		System.out.println("Our desktop computer was made in " + desktopComp.year + " and its price"
				+ "is "+ desktopComp.price + ", hard disk - " + desktopComp.hardDiskMemory +
				", free memory was " + memoryBeforeUpload + " but after upload free memory is " +
				desktopComp.freeMemomry + " with operation system " + desktopComp.operationSystem);
		
	}

}
