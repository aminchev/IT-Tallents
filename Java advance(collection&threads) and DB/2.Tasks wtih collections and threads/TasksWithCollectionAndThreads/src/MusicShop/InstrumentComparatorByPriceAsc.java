package MusicShop;

import java.util.Comparator;

public class InstrumentComparatorByPriceAsc implements Comparator<Instrument> {

	@Override
	public int compare(Instrument inst1, Instrument inst2) {
		return inst1.getPrice()-inst2.getPrice();
	}

}
