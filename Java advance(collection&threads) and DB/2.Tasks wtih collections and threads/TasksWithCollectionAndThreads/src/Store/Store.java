package Store;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Store implements Runnable {
	
	private static final int MIN_COUNT_OF_PRODUCT = 5;
	private static final int COUNT_OF_PRODUCTS_THAT_MUST_BE_PULL_OUT = 5;
	private Map<String, HashMap<String, Integer>> products;
	private Provider provider;
	
	public Store() {
		this.products = new HashMap<String, HashMap<String, Integer>>();
		for(String type:products.keySet()){
			HashMap<String, Integer> curProducts = products.get(type);
			for(String product: curProducts.keySet()){
				curProducts.put(product, curProducts.get(product)+15);
			}
		}
	}
	
	void checkProductsInStore() throws InterruptedException{
		 for(String type: products.keySet()){
			 HashMap<String, Integer> curProducts = products.get(type);
			 for(String product: curProducts.keySet()){
				 while(curProducts.get(product)>=MIN_COUNT_OF_PRODUCT){   
					 synchronized (products) {
						products.wait();
					}
				 }
				 if(curProducts.get(product)<MIN_COUNT_OF_PRODUCT){
					  this.provider.provideProduct(type,product);
				 }
			 }
		 }
	}
	
	
	void getProductOut(String productName){
		for(String type:products.keySet()){
			HashMap<String, Integer> curProducts = products.get(type);
			for(String product:curProducts.keySet()){
				if(product.equals(productName)){
					if(curProducts.get(product)>=COUNT_OF_PRODUCTS_THAT_MUST_BE_PULL_OUT){
						curProducts.put(product, curProducts.get(product)-COUNT_OF_PRODUCTS_THAT_MUST_BE_PULL_OUT);
						return;					
					}
				}
			}
		}
		return;
	}
	
	
	HashMap<String, Integer> getStoreForAddingProducts(String type){
		HashMap<String, Integer> stoka = products.get(type);
		return stoka;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}



	public Provider getProvider() {
		return provider;
	}



	public void setProvider(Provider provider) {
		this.provider = provider;
	}


}
