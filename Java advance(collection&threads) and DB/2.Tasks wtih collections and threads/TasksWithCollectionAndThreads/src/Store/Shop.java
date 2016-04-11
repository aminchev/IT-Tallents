package Store;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shop {

	private static final int COUNT_OF_PRODUCTS_GET_FROM_STORE = 5;
	private static final int MIN_VALUE_FOR_PRODUCT_IN_SHOP = 3;
	private Map<String, HashMap<String, Integer>> productsInShop;
	private Store store;

	public Shop(Store store) {
		this.productsInShop = new HashMap<String, HashMap<String, Integer>>();
		this.setStore(store);
	}

	void getProductFromStore(String productName) {
		for (String product : productsInShop.keySet()) {
			HashMap<String, Integer> products = productsInShop.get(product);
			for (String curProduct : products.keySet()) {
				if (products.get(curProduct) < MIN_VALUE_FOR_PRODUCT_IN_SHOP) {
					if (curProduct.equals(productName)) {
						products.put(curProduct, products.get(curProduct) + COUNT_OF_PRODUCTS_GET_FROM_STORE);
						this.store.getProductOut(productName);
						
					}
				}
			}
		}
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		if (store != null) {
			this.store = store;
		}
	}
}
