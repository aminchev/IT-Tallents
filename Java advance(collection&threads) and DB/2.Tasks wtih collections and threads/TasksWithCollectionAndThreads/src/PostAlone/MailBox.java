package PostAlone;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
	List<Letter> letters = new ArrayList<Letter>();
	
	void addLetter(Letter letter) throws MailException{
		if(letter != null){
			synchronized (letter) {
				letters.add(letter);
			}
		}
		else{
			throw new MailException("Mail can not be null");
		}
	}
	
	public List<Letter> getAllLettersFormBox(){
		List<Letter> allLetters = new ArrayList<Letter>();
		synchronized (letters) {
			for(Letter curLetter:letters){
				allLetters.add(curLetter);
			}
			letters.clear();
		}
		return allLetters;
	}
}
