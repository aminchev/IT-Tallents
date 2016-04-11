package Exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import PostWithVideo.MailObject;

public class EmployeePriemchik extends Person implements Runnable{

	List<Pratka> pratki;
	Map<LocalDate, List<Pratka>> protokol;
	
	public EmployeePriemchik(String name, String phoneNumber, String privateNumber, Address address) {
		super(name, phoneNumber, privateNumber, address);
		pratki = new ArrayList<Pratka>();
		protokol = new TreeMap<LocalDate, List<Pratka>>();
	}
	
	void acceptPratka(List<Pratka> pratkiForAccepting){
		if(pratkiForAccepting!=null){
			synchronized (pratki) {
				pratki.addAll(pratkiForAccepting);
			}
		}
	}
	
	void addPratkaInProtocol(Pratka pratka){
		if(pratka!= null){
			if(!protokol.containsKey(LocalDate.now())){
				protokol.put(LocalDate.now(), new ArrayList<Pratka>());
			}
			protokol.get(LocalDate.now()).add(pratka);
		}
	}
	

	@Override
	public void run() {
		
		
	}
	

}
