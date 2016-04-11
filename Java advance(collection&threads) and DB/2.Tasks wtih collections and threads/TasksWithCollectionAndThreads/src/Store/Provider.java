package Store;

import java.util.HashMap;
import java.util.List;

public class Provider implements Runnable {
	
	private static final int DEFAULT_NUMBER_OF_PRODUCT_FOR_LOADING_IN_STORE = 25;
	private Store store;
	
	@Override
	public void run() {
		
		
	}
	
	void provideProduct(String type, String product){
		if(product !=null && product.length()>0){
			HashMap<String, Integer> stokata = this.store.getStoreForAddingProducts(type);
			
			stokata.put(product, stokata.get(product)+DEFAULT_NUMBER_OF_PRODUCT_FOR_LOADING_IN_STORE);
		}
		
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		if(store != null){
			this.store = store;
		}
	}

	
}
