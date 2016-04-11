package Store2;

public class Product {
	private String type;
	private String name;
	
	@Override
	public String toString() {
		return "Product [type=" + type + ", name=" + name + "]";
	}

	public Product(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
}
