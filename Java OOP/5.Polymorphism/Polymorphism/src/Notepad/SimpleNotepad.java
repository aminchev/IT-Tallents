package Notepad;

import java.util.Arrays;

public class SimpleNotepad implements INotepad {
	private Page[] pages;
	
	public SimpleNotepad(Page[] pages) {
		if(pages != null){
			this.pages = Arrays.copyOf(pages, pages.length);
		}
	}

	
	
	@Override
	public void addText(int pageIndex, String textForAdding) {
		if(validatePage(pageIndex)){
			this.pages[pageIndex].addTextInPage(textForAdding);
		}
		System.out.println(this.pages[pageIndex].getText());
	}

	@Override
	public void reWriteText(int pageIndex, String textForReWtiting) {
		if(validatePage(pageIndex) && textForReWtiting !=null){
			this.pages[pageIndex].deleteTextFromPage();
			this.pages[pageIndex].addTextInPage(textForReWtiting);
		}
		System.out.println(this.pages[pageIndex].getText());
	}

	@Override
	public void deleteText(int pageIndex) {
		if(validatePage(pageIndex)){
			this.pages[pageIndex].deleteTextFromPage();
		}
		System.out.println(this.pages[pageIndex].getText() + "Teksta na stranicata beshe iztrit!");
	}

	@Override
	public void reviewOfPages() {
		for (int i = 0; i < pages.length; i++) {
			this.pages[i].pageView();
			System.out.println(this.pages[i].pageView());
		}
		
	}
	

	@Override
	public boolean searchWord(int pageIndex, String word) {
		if(validatePage(pageIndex) && word !=null && !word.equals("")){
			if(this.pages[pageIndex].searcWordInPage(word) == true){
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if(this.pages[i].containsDigitsInPage() == true){
				System.out.println(this.pages[i].pageView());
				System.out.println();
			}
		}
		
	}
	
	private boolean validatePage(int pageIndex) {
		return pageIndex>=0 && pageIndex<this.pages.length;
	}
	
	Page[] getPages(){
		return Arrays.copyOf(this.pages, this.pages.length);
	}



	
	
	
}
