package KristiqnExam;

import java.time.LocalDateTime;

public class Package {
	
	private static int currentId=1;
	

	private Client sender;
	private Client receiver;
	private String content;
	private LocalDateTime enterDate;
	private int id;
	
	
	@Override
	public String toString() {
		return "Package [sender=" + sender + ", receiver=" + receiver + ", content=" + content + ", enterDate="
				+ enterDate + ", id=" + id + "]";
	}


	//validaciq
	public Package(Client sender, Client receiver, String content, LocalDateTime enterDate) throws PackageException {
		if(sender!=null && receiver!=null && content!=null){
			this.sender = sender;
			this.receiver = receiver;
			this.content = content;
			this.enterDate = enterDate;
			this.id = currentId++;
		}else{
			throw new PackageException("This is just unacceptable!");
		}
	}

	
	
	

	public Client getSender() {
		return sender;
	}


	public Client getReceiver() {
		return receiver;
	}


	public String getContent() {
		return content;
	}


	public LocalDateTime getEnterDate() {
		return enterDate;
	}


	public int getId() {
		return id;
	}
	
	
	
	

}
