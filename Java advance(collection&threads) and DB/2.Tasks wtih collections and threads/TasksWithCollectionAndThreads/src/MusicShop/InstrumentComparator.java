package MusicShop;

import java.util.Comparator;

public class InstrumentComparator implements Comparator<Instrument> {

	@Override
	public int compare(Instrument instrument1, Instrument instrument2) {
		return instrument1.getName().compareTo(instrument2.getName());
	}

}
