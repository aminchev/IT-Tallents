package KristiqnExam;

import java.util.List;

public class DistributionFirmOffice extends FirmOffice{

	
	private List<FirmOffice> myListOfOfficesIHaveToDeliverTo;
	
	
	//SINGLETON
	public DistributionFirmOffice(String townNameOfThisOffice) {
		super(townNameOfThisOffice);
	}

	
	
	
}