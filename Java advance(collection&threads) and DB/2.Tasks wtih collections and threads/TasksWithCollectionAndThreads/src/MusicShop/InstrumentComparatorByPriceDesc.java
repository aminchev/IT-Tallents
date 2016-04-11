package MusicShop;

import java.util.Comparator;

public class InstrumentComparatorByPriceDesc implements Comparator<Instrument> {

	@Override
	public int compare(Instrument ins1, Instrument ins2) {
		return ins2.getPrice() - ins1.getPrice();
	}
	
}
