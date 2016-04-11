package KristiqnExam;

public class PhysClient extends Client{

	private final String egn;
	
	
	public PhysClient(String name, String city, String telNum,String egn) {
		//VALIDACIQ
		super(name, city, telNum);
	this.egn=egn;
	}


	public String getEgn() {
		return egn;
	}

}
