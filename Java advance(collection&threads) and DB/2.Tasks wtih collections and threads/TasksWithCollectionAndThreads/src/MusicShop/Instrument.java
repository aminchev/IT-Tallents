package MusicShop;

public class Instrument {
	private String type;
	private String name;
	private int price;
	
	public Instrument(String type, String name, int price) {
		this.setType(type);
		this.setName(name);
		this.setPrice(price);
	}

	public String getType() {
		return type;
	}

	private void setType(String type) {
		if(type != null && !type.equals("")){
			this.type = type;
		}
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if(name != null && !name.equals("")){
			this.name = name;
		}
	}

	public int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		if(price>0){
			this.price = price;
		}
	}

	@Override
	public String toString() {
		return "Instrument [type=" + type + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
