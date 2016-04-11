package TestLib4Again;

import java.util.Comparator;

public class ReadingMaterialComparator implements Comparator<ReadingMaterial> {
	@Override
	public int compare(ReadingMaterial rm1, ReadingMaterial rm2) {
		return rm1.whenMaterialIsTaken().compareTo(rm2.whenMaterialIsTaken());
	}

}
