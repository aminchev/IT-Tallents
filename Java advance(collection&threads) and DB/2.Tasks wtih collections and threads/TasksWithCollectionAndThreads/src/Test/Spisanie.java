package Test;

public class Spisanie extends Chetivo {

	private int number;
	private int yearOfPublishig;
	private int monthOfPublishing;
	
	
	public Spisanie(String name, String izdatelstvo, int number) {
		super(name, izdatelstvo);
		this.setNumber(number);
	}


	public int getNumber() {
		return number;
	}


	private void setNumber(int number) {
		if(number>0){
			this.number = number;
		}
	}


	@Override
	public String toString() {
		return "Spisanie [number=" + number + ", name=" + this.getName() + ", monthOfPublishing="
				+ monthOfPublishing + "]";
	}


	

	
}
