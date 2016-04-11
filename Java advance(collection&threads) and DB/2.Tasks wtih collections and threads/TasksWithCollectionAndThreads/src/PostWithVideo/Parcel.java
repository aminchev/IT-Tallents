package PostWithVideo;

public class Parcel extends MailObject {

	private static final int NORMAL_PRICE = 2;
	private int height;
	private int width;
	private int lenght;
	private boolean isFragile;
	
	public Parcel(Citizen sender, Citizen receiver, int h, int w, int l, boolean isFragile) {
		super(sender, receiver);
		this.height = h;
		this.width = w;
		this.lenght = l;
		this.isFragile = isFragile;
		
	}

	@Override
	public float getTax() {
		float price = NORMAL_PRICE;
		if(overSized()){
			price = price*1.5f;
		}
		if(isFragile){
			price = price*1.5f;
		}
		return price;
	}

	private boolean overSized() {
		return width>60 || height>60 || lenght>60 ;
	}

	@Override
	public float getTimeForDelivery() {
		return 2000;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public boolean isFragile() {
		return isFragile;
	}

	public void setFragile(boolean isFragile) {
		this.isFragile = isFragile;
	}

}
