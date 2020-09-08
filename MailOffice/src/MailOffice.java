import java.util.ArrayList;
import java.util.Collections;

public class MailOffice implements MailOfficeInterface{
	
	final  int REGULAR =1, PRIORITY =2 , OVERNIGHT=3;
	private ArrayList<Mail> mailList = new ArrayList<Mail>();

	private String postOffice;

	public MailOffice(String postOffice) {
		this.setPostOffice(postOffice);
	}

	@Override
	public void addMail(int type, double weight, String zipCode, String sender, String receiver) {
		// TODO Auto-generated method stub
		Mail mail = null;
		
		if(type == REGULAR){
			mail = new RegularMail(sender, receiver, weight, zipCode);
		}
		if(type == PRIORITY){
			mail = new PriorityMail(sender, receiver, weight, zipCode);
		}
		if(type == OVERNIGHT){
			mail = new OvernightMail(sender, receiver, weight, zipCode);
		}
		//you can add a generic Mail object like RegularMail and PriorityMail and OvernightMail
		//since mail is the super class
		mailList.add(mail);
	}

	
	//
	@Override
	public ArrayList<Mail> sortMails() {
		// this collections calls Mail.compareTo method to sort the list
		Collections.sort(mailList);
		
		return (mailList);
	}

	public String getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}
	
	
	
	public String toString(){
		
		String msg;
		
		msg = postOffice + "List of sent mails\n";
		msg += "Total number of mails " + mailList.size() + "\n";
		
		for (int i = 0; i < mailList.size(); i++) {
			msg += mailList.get(i).toString() + "\n";
		}
		
		
		
		return(msg);
		
	}
	
	
}
