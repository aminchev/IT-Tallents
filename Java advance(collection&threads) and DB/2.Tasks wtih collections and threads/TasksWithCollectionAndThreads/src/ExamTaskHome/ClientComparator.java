package ExamTaskHome;

import java.util.Comparator;

public class ClientComparator implements Comparator<Client> {

	@Override
	public int compare(Client client1, Client client2) {
		return client1.getName().compareTo(client2.getName());
	}

}
