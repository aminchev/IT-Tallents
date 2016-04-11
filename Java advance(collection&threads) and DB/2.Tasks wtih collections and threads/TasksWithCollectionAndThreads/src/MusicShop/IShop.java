package MusicShop;

import java.util.TreeSet;

public interface IShop {
	void sellInstrument(String name, int count);
	void addNewInstrumentsInTheShop(String type, String name, int price, int count);
	TreeSet<Instrument> catalogOfSortedInstrumentsByCriteria(String criteria);
	void spravkaForShopWork();
	void typeOfInstumentsWithBestEarnedMoney();
	void typeOfBestInstuments();
	void makeRequestForInstrument(String instrumentName);
	boolean isNeedFromDeliveries();
	void addMissingInstruments();
	void buyInstrumentFromShop(String name, int count);
	boolean canIBuyInstrument(String instrumentName, int count);
}
