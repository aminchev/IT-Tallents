package NaNikiZaSupport;

import java.util.Stack;

public class Torba implements ITorba {

	private static final int MAX_CAPACITY = 10;
	private Stack<String> products = new Stack<String>();

	/** Dobavq produkt v torbata
	 * @see ITorba#addProduct(String)
	 */
	@Override
	public void addProduct(String product) throws Exception {
		if (product != null && !product.equals(""))
			synchronized (products) {
				products.push(product);
			}
		else {
			throw new Exception("Kyv e toq produkt be kaval!?");
		}
	}

	public boolean isPonapylnena() {
		return products.size() > (int)(0.70 * MAX_CAPACITY);
	}
	
	/* (non-Javadoc)
	 * @see ITorba#getLastProduct()
	 */
	@Override
	public String getLastProduct() throws Exception {
		if (products.isEmpty())
			throw new Exception("Torbata e prazna be galmak!");
		synchronized (products) {
			return products.pop();	
		}
	}
	
	/* (non-Javadoc)
	 * @see ITorba#isFull()
	 */
	@Override
	public boolean isFull() {
		return products.size() == MAX_CAPACITY;
	}
	
	/* (non-Javadoc)
	 * @see ITorba#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return products.isEmpty();
	}

	@Override
	public boolean isPoizpraznena() {
		return products.size() < (int)(0.20 * MAX_CAPACITY);
	}
}
