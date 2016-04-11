package ExamTaskHome;

import java.time.LocalDateTime;
import java.util.List;

public class Pratka {
	
	private static int id = 1;
	
	private Person sender;
	private Person receiver;
	private String content;
	private LocalDateTime timeOfEntering;
	private int uniqueId;
	private List<Protocol> protocolsThatThisPratkaExists;
	
	public Pratka(Person sender, Person receiver, String content, LocalDateTime timeOfEntering) {
		this.setSender(sender);
		this.setReceiver(receiver);
		this.setContent(content);
		this.setTimeOfEntering(timeOfEntering);
		this.uniqueId = id++;
	}

	public Person getSender() {
		return sender;
	}

	private void setSender(Person sender) {
		if(sender!=null){
			this.sender = sender;
		}
	}

	public Person getReceiver() {
		return receiver;
	}

	private void setReceiver(Person receiver) {
		if(receiver!=null){
			this.receiver = receiver;
		}
	}

	public String getContent() {
		return content;
	}

	private void setContent(String content) {
		if(content!=null && content.length()>0){
			this.content = content;
		}
	}

	public LocalDateTime getTimeOfEntering() {
		return timeOfEntering;
	}

	private void setTimeOfEntering(LocalDateTime timeOfEntering) {
		this.timeOfEntering = timeOfEntering;
	}

	public List<Protocol> getProtocolsThatThisPratkaExists() {
		return protocolsThatThisPratkaExists;
	}
	
	
}
