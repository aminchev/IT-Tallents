package PartShop;

public class PartCategory {
	private int categoryNumber;
	private String categoryName;
	
	public PartCategory(int categoryNumber, String categoryName) {
		setCategoryNumber(categoryNumber);
		setCategoryName(categoryName);
	}
	
	
	
	
	
	
	public int getCategoryNumber() {
		return this.categoryNumber;
	}
	public void setCategoryNumber(int categoryNumber) {
		if(categoryNumber>0){
			this.categoryNumber = categoryNumber;
		}
	}
	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		if(categoryName != null && !categoryName.equals("")){
			this.categoryName = categoryName;
		}
	}
}


