package KristiqnExam;

public class LawClient extends Client{

	private String bulstat;
	//validaciq
	public LawClient(String name, String city, String telNum,String bulstat) {
		super(name, city, telNum);
		this.setBulstat(bulstat);
	}

	public String getBulstat() {
		return bulstat;
	}

	public void setBulstat(String bulstat) {
		if(bulstat!=null)
		this.bulstat = bulstat;
	}
	

}
