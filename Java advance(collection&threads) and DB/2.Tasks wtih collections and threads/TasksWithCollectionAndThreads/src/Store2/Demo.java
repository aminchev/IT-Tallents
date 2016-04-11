package Store2;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.HandlerBase;

public class Demo {

	public static void main(String[] args) {
		Provider ivanProv = new Provider();
		Store sklad = new Store(ivanProv);
		
		
		ivanProv.setStore(sklad);
		
		Shop lidl = new Shop(sklad);
		Shop billa = new Shop(sklad);
		Shop fantastiko = new Shop(sklad);
		Shop[] shops = {lidl, billa, fantastiko};
		for(int i = 0; i<shops.length; i++){
			Thread shopThread = new Thread(shops[i], "Magazin nomer " +i);
			shopThread.start();
		}
		
		
		Client asen = new Client(lidl);
		Client boris = new Client(lidl);
		Client ceco = new Client(lidl);
		Client dido = new Client(billa);
		Client elena = new Client(billa);
		Client fia = new Client(billa);
		Client georgi = new Client(fantastiko);
		Client hari = new Client(fantastiko);
		Client ivan = new Client(fantastiko);
	    Client[] clients = {asen,boris,ceco,dido,elena,fia,georgi,hari,ivan};
	    for(int i = 0; i<clients.length; i++){
	    	Thread clientThread = new Thread(clients[i], "Klient nomer " +i );
	    	clientThread.start();
	    }
	    
	    Thread providerThread = new Thread(ivanProv, "Dostavshik");
	    providerThread.start();
		
		
		
	}

}
