package MusicShop;

import java.util.Comparator;

public class InstrumentComparatorByType implements Comparator<Instrument> {

	@Override
	public int compare(Instrument inst1, Instrument inst2) {
		if(inst1.getType().compareTo(inst2.getType()) == 0){
			return inst1.getName().compareTo(inst2.getName());
		}
		return inst1.getType().compareTo(inst2.getType());
	}

}
