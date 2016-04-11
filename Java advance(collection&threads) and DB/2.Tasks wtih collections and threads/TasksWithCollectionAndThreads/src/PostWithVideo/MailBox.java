package PostWithVideo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MailBox {

	private LinkedList<Letter> content  = new LinkedList<Letter>();
	
	public void addLetter(Letter letter) throws MailBoxException {
		if(letter == null){
			throw new MailBoxException("Kvo e tva pismo.....");
		}
		synchronized (content) {
			content.add(letter);
		}
	}
	
	public List<Letter> getAllLetters(){
		List<Letter> result  = new LinkedList<Letter>();
		synchronized (content) {
			Collections.copy(result, content);
			content.clear();
		}	
		return result;
	}

}
