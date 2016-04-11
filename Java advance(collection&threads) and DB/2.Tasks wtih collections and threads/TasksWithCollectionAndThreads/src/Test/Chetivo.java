package Test;

import java.util.HashMap;
import java.util.Map;

public abstract class Chetivo {
	private String name;
	private String izdatelstvo;
	private Map<String, String> status;
	
	public Chetivo(String name, String izdatelstvo) {
		this.setName(name);
		this.setIzdatelstvo(izdatelstvo);
		status = new HashMap<String, String>();
	}

	void getChetivo(Chetivo chetivo, String dataOfGetting){
		if(chetivo != null){
			if(chetivo instanceof Spisanie){
				System.out.println("Spisanie can not not be taken");
				return;
			}
			if(!status.containsKey(dataOfGetting)){
				status.put(dataOfGetting, null);
			}
			else{
				System.out.println("This chetivo already get and it is not here!");
			}
			
		}
	}
	
	void returnChetivo(Chetivo chetivo, String dataOfReturning){
		if(chetivo != null){
			for(String dataOfGetting:status.keySet()){
				if(status.get(dataOfGetting)==null){
					status.put(dataOfGetting, dataOfReturning);
					return;
				}
			}
		}
	}
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		if(name!= null && name.length()>0){
			this.name = name;
		}
	}

	 String getIzdatelstvo() {
		return izdatelstvo;
	}

	private void setIzdatelstvo(String izdatelstvo) {
		if(izdatelstvo!=null && izdatelstvo.length()>0){
			this.izdatelstvo = izdatelstvo;
		}
	}
}
