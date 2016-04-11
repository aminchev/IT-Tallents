package PostAlone;

import java.util.List;

public class Collector extends PostMen {

	
	public Collector(String firstName, String lastName, String address, int staj) {
		super(firstName, lastName, address, staj);
	}

	@Override
	public void run() {
		while(true){
			while(getPostoffice().getCountOfMailObjectsInPost()>50){
				System.out.println(Thread.currentThread().getName() +" There are too many mail and parcels in post office");
				synchronized (getPostoffice()) {
					try {
						getPostoffice().wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			System.out.println(Thread.currentThread().getName()+ " I will go for some letter");
			
			this.startCollectMailsFromMailboxes();
			
			
//			for(MailBox mailBox:getMailboxes()){
//				List<Letter> letters = mailBox.getAllLettersFormBox();
//				getPostoffice().addMailObjectsInPostOffice(letters);
//				System.out.println(Thread.currentThread().getName() + " dobavih pisma v poshtata");
//				
				synchronized (getPostoffice()) {
					getPostoffice().notifyAll();
				}

			//}
		}
		
	}

}
