package Notepad;

public class SecuredNotepad extends SimpleNotepad {
	private String parola; 
	
	
	public  SecuredNotepad(Page[] pages, String parola) throws Exception {
		super(pages);
		this.setParola(parola);
	}
	
	public void addText(int pageIndex, String textForAdding, String parola){
		if(isParolaCorrect(parola)){
			super.addText(pageIndex, textForAdding);
		}
		else{
			System.out.println("Wrong password");
		}
	}
	
	public void reWriteText(int pageIndex, String textForReWtiting, String parola){
		if(isParolaCorrect(parola)){
			super.reWriteText(pageIndex, textForReWtiting);
		}
		else{
			System.out.println("Wrong password");
		}
	}
	
	public void deleteText(int pageIndex, String parola) {
		if(isParolaCorrect(parola)){
			super.deleteText(pageIndex);
		}
		else{
			System.out.println("Wrong password");
		}
	}
	
	public void reviewOfPages(String parola){
		if(isParolaCorrect(parola)){
			super.reviewOfPages();
		}
		else{
			System.out.println("Wrong password");
		}
	}
	
	public boolean searchWord(int pageIndex, String word, String parola){
		if(this.isParolaCorrect(parola)){
			return super.searchWord(pageIndex, word);
		}
		else{
			System.out.println("Wrong password");
		}
		return false;
	}
	
	public void printAllPagesWithDigits(String parola) {
		if(this.isParolaCorrect(parola)){
			super.printAllPagesWithDigits();
		}
		else{
			System.out.println("Wrong parola!");
		}
	}

	private boolean isParolaCorrect(String parola) {
		return this.getParola().equals(parola);
	}


	public String getParola() {
		return this.parola;
	}
	public void setParola(String parola) throws Exception {
		boolean hasLetter = false;
		boolean hasCapitalLetter = false;
		boolean hasDigit = false;
		if(parola.length()>=5 && parola.length()<50){
			char[] array = parola.toCharArray();
			for (int i = 0; i < array.length; i++) {
				if(array[i]>='a' && array[i]<='z'){
					hasLetter = true;
				}
				if(array[i]>='A' && array[i]<='Z'){
					hasCapitalLetter = true;
				}
				if(array[i]>='0' && array[i]<= '9'){
					hasDigit = true;
				}
			}
			if(hasLetter == true && hasCapitalLetter == true && hasDigit == true){
				this.parola = parola;
				
			}
			else{
				throw new Exception("Wrong password! You must have letter, capital letter and digit!");
//				System.out.println("Wrong password! You must have letter, capital letter and digit!");
//				this.parola = parola;
			}
		}
		else{
			throw new Exception("Wrong password! Password must be longer than 5 simbols and less than 50! ");
//			System.out.println("Wrong password! Password must be longer than 5 and shorter than 50 simbols! ");
//			this.parola = parola;
		}
		
	}

}
