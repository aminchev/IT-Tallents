package Exam;

import java.time.LocalDateTime;

public class Pratka {
	
	private static int id = 0;
	
	private Person sender;
	private Person receiver;
	private String content;
	private LocalDateTime timeOfGetting;
	private int curId;
	private Protocol protocol;
	
	public Pratka(Person sender, Person receiver, String content, LocalDateTime timeOfGetting) {

		this.setSender(sender);
		this.setReceiver(receiver);
		this.setContent(content);
		this.setTimeOfGetting(timeOfGetting);
		this.curId = id++;
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
		if(receiver!= null){
			this.receiver = receiver;
		}
	}

	public String getContent() {
		return content;
	}

	private void setContent(String content) {
		if(content!=null){
			this.content = content;
		}
	}

	public LocalDateTime getTimeOfGetting() {
		return timeOfGetting;
	}

	private void setTimeOfGetting(LocalDateTime timeOfGetting) {
		this.timeOfGetting = timeOfGetting;
	}

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		if(protocol!=null){
			this.protocol = protocol;
		}
	}
	
	
	
}
