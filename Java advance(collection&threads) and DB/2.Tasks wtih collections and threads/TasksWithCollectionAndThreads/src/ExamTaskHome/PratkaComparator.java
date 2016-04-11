package ExamTaskHome;

import java.util.Comparator;

public class PratkaComparator implements Comparator<Pratka> {

	@Override
	public int compare(Pratka pratka1, Pratka pratka2) {
		return pratka1.getTimeOfEntering().compareTo(pratka2.getTimeOfEntering());
	}

}
