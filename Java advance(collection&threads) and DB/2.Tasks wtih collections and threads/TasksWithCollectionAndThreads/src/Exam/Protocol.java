package Exam;

import java.util.ArrayList;
import java.util.List;

public class Protocol {
	private Person podatel;
	private Person poluchatel;
	
	private List<Pratka> pratkiInThisProtocol;

	public Protocol(Person podatel, Person poluchatel) {
		this.podatel = podatel;
		this.poluchatel = poluchatel;
		pratkiInThisProtocol = new ArrayList<Pratka>();
	}
	
}
