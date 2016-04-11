package ExamTaskHome;

import java.util.ArrayList;
import java.util.List;

public class Protocol {
	
	private Person davashPratki;
	private Person vzimashtPratki;
	List<Pratka> pratkiInThisProtocol;
	
	public Protocol(Person davashPratki, Person vzimashtPratki) {
		this.davashPratki = davashPratki;
		this.vzimashtPratki = vzimashtPratki;
		pratkiInThisProtocol = new ArrayList<Pratka>();
	}

	public Person getDavashPratki() {
		return davashPratki;
	}

	public void setDavashPratki(Person davashPratki) {
		if(davashPratki!=null){
			this.davashPratki = davashPratki;
		}
	}

	public Person getVzimashtPratki() {
		return vzimashtPratki;
	}

	public void setVzimashtPratki(Person vzimashtPratki) {
		if(vzimashtPratki!=null){
			this.vzimashtPratki = vzimashtPratki;
		}
	}
	
	
}
