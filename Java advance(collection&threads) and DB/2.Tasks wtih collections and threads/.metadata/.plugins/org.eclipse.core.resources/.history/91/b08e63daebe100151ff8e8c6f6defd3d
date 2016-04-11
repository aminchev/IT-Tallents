
public class Parcel extends MailObject {

	private static final int TIME_TO_DELIVER = 2000;
	private static final double COEFFICIENT_FOR_PRICE = 1.5;
	private static final int OVERSIZE_LIMIT = 60;
	private static final int NORMAL_PRICE = 2;
	private int height;
	private int width;
	private int length;
	private boolean isFragile;
	
	public Parcel(Citizen sender, Citizen receiver, int h, int w, int l, boolean isFragile) {
		super(sender, receiver);
		this.height = h;
		this.width = w;
		this.length = l;
		this.isFragile = isFragile;
	}

	@Override
	public float getTax() {
		float price = NORMAL_PRICE;
		if (overSized()) {
			price *= COEFFICIENT_FOR_PRICE;
		}
		if (isFragile()) {
			price *= COEFFICIENT_FOR_PRICE;
		}
		
		return price;
	}

	private boolean overSized() {
		return width > OVERSIZE_LIMIT || height > OVERSIZE_LIMIT || length > OVERSIZE_LIMIT;
	}

	@Override
	public float getTimeToDeliver() {
		return TIME_TO_DELIVER;
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

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isFragile() {
		return isFragile;
	}

	public void setFragile(boolean isFragile) {
		this.isFragile = isFragile;
	}

}
