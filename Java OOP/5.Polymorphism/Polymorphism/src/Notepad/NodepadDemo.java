package Notepad;

import java.lang.reflect.Modifier;

public class NodepadDemo {
	public static final void main(String[] args) throws Exception {
		
		Page first =  new Page("First Page", "Text on first page", 1);
		Page second = new Page("Second Page", "Text on second page",2);
		Page third =  new Page("Third Page", "Text on third page", 3);
		Page fourt =  new Page("Fourt Page", "Text on fourt page", 4);
		Page fifth =  new Page("Fifth Page", "Text on 3fifth page", 5);
	
		Page[] pages = new Page[]{first, second, third, fourt, fifth};
		INotepad notepad =  new SimpleNotepad(pages);
		INotepad securedNotepad = new SecuredNotepad(pages, "1Aewe45");
														
	
		notepad.addText(0, "New TEXT");
		notepad.addText(1, "Some Text Here");
		notepad.addText(0, "???");
		notepad.reWriteText(2, "Only new text!");
		notepad.reWriteText(0, "Mai Raboti!");
		notepad.deleteText(3);
		notepad.addText(3, "Some"); 
		notepad.reWriteText(3, "1234345");
		System.out.println();
		notepad.reviewOfPages();
		
		System.out.println("TUK " + notepad.searchWord(4, "Text")); 
		notepad.printAllPagesWithDigits();
		
		
		 
		if(securedNotepad instanceof SecuredNotepad){
			((SecuredNotepad)securedNotepad).addText(0, "Tova sega go slagam", "rhehn");
			((SecuredNotepad)securedNotepad).addText(0, "Tova go slagam po-kysno", "1Aaewe45");
			((SecuredNotepad)securedNotepad).reWriteText(0, "Only new", "1Ae45");
			System.out.println("TUK " + ((SecuredNotepad)securedNotepad).searchWord(4, "Text", "1Aaewe45"));
			((SecuredNotepad)securedNotepad).printAllPagesWithDigits("1Aaewe45");
		}
		
		
		ElectronicSecurityNotepad elNotepad =  new ElectronicSecurityNotepad(pages, "1Aaewe45");
		elNotepad.start();
		if(elNotepad.isStarted() == true){
			elNotepad.addText(0, "Text from El. Notepd", "1Aaewe45");
			elNotepad.printAllPagesWithDigits("e45");
		}
		elNotepad.stop();
		if(elNotepad.isStarted() == true){
			elNotepad.reWriteText(2, "Pffff", "66666");
		}
		System.out.println("Martin!");
		 
		try{
				SecuredNotepad moderenNotePad =  new SecuredNotepad(pages, "jhgkbkbvkerbv");
				
			} catch(Exception U){
				System.out.println(U);
			}
		notepad.addText(0, "New TEXT");
		notepad.addText(1, "Some Text Here");
	}

}
