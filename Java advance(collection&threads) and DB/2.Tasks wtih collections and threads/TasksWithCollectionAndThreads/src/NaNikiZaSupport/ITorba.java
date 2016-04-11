package NaNikiZaSupport;

public interface ITorba {

	void addProduct(String product) throws Exception;

	String getLastProduct() throws Exception;

	boolean isFull();

	boolean isEmpty();
	
	public boolean isPonapylnena();
	
	public boolean isPoizpraznena();

}