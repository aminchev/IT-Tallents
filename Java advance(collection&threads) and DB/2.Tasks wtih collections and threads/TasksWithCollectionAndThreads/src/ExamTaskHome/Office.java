package ExamTaskHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Office {

		private String city;
		private List<Protocol> protocoli;
		private List<Pratka> pratki;
		private PriemchikEmployee priemchik;
		private TransporterEmployee driver;
		private static SpecialOffice specialOffice;
		
		
		public Office(String city) {
			this.city = city;
			this.protocoli = new ArrayList<Protocol>();
			this.pratki = new ArrayList<Pratka>();
		}
		
		int getCountOfAllPratki(){
			return this.pratki.size();
		}
		
		void acceptPratkaInOffice(List<Pratka> pratkiForAccepting){
			if(pratkiForAccepting!=null){
				synchronized (pratki) {
					pratki.addAll(pratkiForAccepting);
				}	
				Protocol protFoThisPratka = this.makeProtocol(pratkiForAccepting.get(0).getSender(), this.priemchik);
				protocoli.add(protFoThisPratka);
			}
		}
		
		void acceptPratkaInOffice(Pratka pratka){
			this.acceptPratkaInOffice(Arrays.asList(pratka));
		}
		
		Protocol makeProtocol(Person davashtPratka, Person vzimashtPratka){
			Protocol newProtocol = null;
			if(davashtPratka!=null && vzimashtPratka!=null){
				newProtocol = new Protocol(davashtPratka, vzimashtPratka);
			}
			this.protocoli.add(newProtocol);
			return newProtocol;
		}

		public List<Pratka> getPratki() {
			return pratki;
		}

		public TransporterEmployee getDriver() {
			return driver;
		}

		public PriemchikEmployee getPriemchik() {
			return priemchik;
		}
}