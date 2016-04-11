package Test;

import java.util.Comparator;

public class UchebnikComparator implements Comparator<Uchebnik> {

	@Override
	public int compare(Uchebnik uchebnik1, Uchebnik uchebnik2) {
		if(uchebnik1.getName().compareTo(uchebnik2.getName())==0){
			return uchebnik1.getAutor().compareTo(uchebnik2.getAutor());
		}
		return uchebnik1.getName().compareTo(uchebnik2.getName());
	}

}
