package Store2;

import java.util.HashMap;
import java.util.Map;

public class Store implements IStore {
	private static final int COUNT_OF_PRODUCTS_FOR_LOADING = 5;
	private static final int COUNT_FOR_PRODUCT_ADD_WHEN_IT_IS_UNDER_LIMIT = 25;
	private static final int START_COUNT_OF_PRODUCT = 15;
	private static final int MIN_CUONTITY_OF_PRODUCTS = 5;
	private Map<Product, Integer> products;
	private Provider provider;

	public Store(Provider provider) {
		this.provider = provider;
		this.products = new HashMap<Product, Integer>();
			String[] types = { "Fruit", "Vegetables", "Meat" };
			String[] productsInArray = { "Banana", "Orange", "Apple", "Potato", "Tomato", "Cucumber", "Pork", "Beef",
					"Chicken" };
			int helper = 0;
			for (int type = 0; type < types.length; type++) {
				int counter = 0;
				for (int prod = 0 + helper; prod < productsInArray.length; prod++) {
					products.put(new Product(types[type], productsInArray[prod]), START_COUNT_OF_PRODUCT);
					counter++;
					if (counter == 3) {      //умишлено не са константи
						helper = helper + 3;
						break;
					}
				}
			}
	}

	public void addMissingProducts() {
		for (Product product : products.keySet()) {
			if (products.get(product) < MIN_CUONTITY_OF_PRODUCTS) {
				synchronized (products) {
					products.put(product, products.get(product) + COUNT_FOR_PRODUCT_ADD_WHEN_IT_IS_UNDER_LIMIT);
				}

			}
		}

	}

	public void getProductFromStore(String name){
		if(name != null && name.length()>0){
			for(Product product:products.keySet()){
				if(product.getName().equals(name)){
					if(products.get(product)>COUNT_OF_PRODUCTS_FOR_LOADING){
						synchronized (products) {
							products.put(product, products.get(product)-COUNT_OF_PRODUCTS_FOR_LOADING);
						}
					}
				}
			}
		}
	}

	public boolean isNeedFromSomeProduct(){
		for (Product product : products.keySet()) {
			if (products.get(product) < MIN_CUONTITY_OF_PRODUCTS) {
				return true;
			}
		}
		return false;
	}
	
}
