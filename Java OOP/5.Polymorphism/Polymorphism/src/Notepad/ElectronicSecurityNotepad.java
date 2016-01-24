package Notepad;

public class ElectronicSecurityNotepad extends SecuredNotepad implements IElectronicDevice{

	boolean switchOn = false;
	
	public ElectronicSecurityNotepad(Page[] pages, String parola) throws Exception {
		super(pages, parola);
		
	}

	@Override
	public void start() {
		switchOn = true;
	}

	@Override
	public void stop() {
		switchOn = false;
	}

	@Override
	public boolean isStarted() {
		if(switchOn == true){
			return true;
		}
		System.out.println("Please switch on and try again!");
		return false;
		
	}

}
