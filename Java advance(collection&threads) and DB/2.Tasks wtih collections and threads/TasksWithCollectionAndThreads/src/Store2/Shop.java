package Store2;

import java.util.HashMap;
import java.util.Map;

public class Shop implements Runnable {

	private static final int COUNT_OF_ADD_PRODUCTS_IN_SHOP_FROM_STORE = 5;
	private static final int COUNT_FOR_WHICH_PRODUCT_MUST_BE_LOADED = 5;
	private static final int START_COUNT_OF_PRODUCT = 15;
	private Map<Product, Integer> productsInShop;
	private IStore store;

	public Shop(Store store) {
		this.store = store;
		this.productsInShop = new HashMap<Product, Integer>();
		String[] types = { "Fruit", "Vegetables", "Meat" };
		String[] productsInArray = { "Banana", "Orange", "Apple", "Potato", "Tomato", "Cucumber", "Pork", "Beef",
				"Chicken" };
		int helper = 0;
		for (int type = 0; type < types.length; type++) {
			int counter = 0;
			for (int prod = 0 + helper; prod < productsInArray.length; prod++) {
				productsInShop.put(new Product(types[type], productsInArray[prod]), START_COUNT_OF_PRODUCT);
				counter++;
				if (counter == 3) {         //умишлено не са константи
					helper = helper + 3;
					break;
				}
			}
		}
	}

	@Override
	public void run() {
		while(true){
		for (Product product : productsInShop.keySet()) {
			if (productsInShop.get(product) < COUNT_FOR_WHICH_PRODUCT_MUST_BE_LOADED) {
				System.out.println(Thread.currentThread().getName() +" Sega she zaredq stoka ot sklada!");
				while (this.store.isNeedFromSomeProduct() == true) {
					synchronized (store) {
						try {
							System.out.println(Thread.currentThread().getName() + " Skladut q nqma tazi stoka, she pochakam da zaredi!");
							this.store.wait();
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
					}
				}

				System.out.println(Thread.currentThread().getName() +" Stokata q ima v sklada, sega she zaredq");
				Product deficitProduct = product;
				synchronized (store) {
					this.store.getProductFromStore(deficitProduct.getName());
					synchronized (productsInShop) {
						productsInShop.put(product, productsInShop.get(product) + COUNT_OF_ADD_PRODUCTS_IN_SHOP_FROM_STORE);
					}
					store.notifyAll();
				}
			}
		}
		}
	}

	void buyProductFromShop(String nameOfSearchedProduct, int quontity) {
		if (nameOfSearchedProduct != null && nameOfSearchedProduct.length() > 0) {
			for (Product product : productsInShop.keySet()) {
				if (product.getName().equals(nameOfSearchedProduct)) {
					if (productsInShop.get(product) >= quontity) {
						productsInShop.put(product, productsInShop.get(product) - quontity);
						System.out.println(Thread.currentThread().getName() + " Ostavat " + productsInShop.get(product) + " " + product.getName() );
					}
				}
			}
		}
	}

	boolean isSearchedProductExist(String nameOfProduct, int quontity) {
		if (nameOfProduct != null && nameOfProduct.length() > 0) {
			for (Product product : productsInShop.keySet()) {
				if (product.getName().equals(nameOfProduct)) {
					if (productsInShop.get(product) >= quontity) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
 	public boolean isNeededStoreToBeLoaded(){
		for(Product product:productsInShop.keySet()){
			if(productsInShop.get(product)<3){
				return true;
			}
		}
		return false;
	}

	public IStore getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
}
