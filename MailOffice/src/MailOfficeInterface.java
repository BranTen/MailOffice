import java.util.ArrayList;
 
/**
 * This Interface defines the behavior of the MailOffice Class
 * @author Khandan Monshi
 *
 */
public interface MailOfficeInterface {
	/**
	 * Creates a Mail object and adds it to the list of the mails in the MailOffice
	 * class.It also increments the numofmails which should be defined in the MailOffice Class
	 * @param Type, type of mail : 1- regular, 2- priority , 3 - overnight
	 * @param weight, weight of mail (pound)
	 * @param zipCode, zipcode where the mail will be sent to
	 * @param sender, a string representing the name of the sender
	 * @param receiver, a string representing the name of the receiver
	 */
	public  void addMail( int type, double weight, String zipCode, String sender, String receiver );
	 
	
	/**
	 * creates a copy of the mail list and sorts it based on the mail zipcode and returns the sorted list.
	 * Notice that the original mail list will remain the same.  
	 * @return, sorted arrayList of Mails
	 */
	public ArrayList <Mail>  sortMails();
}