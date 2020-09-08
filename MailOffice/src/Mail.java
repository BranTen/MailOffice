
public abstract class Mail implements Comparable<Mail> {

	private double weight;
	private String zip;
	private String sendersName;
	private String reciversName;

	public Mail(String sendersName, String reciversName, double weight, String zip) {
		this.weight = weight;
		this.zip = zip;
		this.sendersName = sendersName;
		this.reciversName = reciversName;

	}

	public abstract double calculateTotalCost();
	//THIS METHOD IS CALLED BY THE COMPARABLE SORT METHOD
	
	public int compareTo(Mail mail) {				
		//To do make sure that this returns -1, 0, 1

		
		return (this.zip.compareTo(mail.getZip()));
	
	}

	public String toString(){
		
		return("Weight = " + weight + " Sender = " + sendersName + " Recvier = " + reciversName + " zipcode = " + zip);
		
	}
	
	
	
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getSendersName() {
		return sendersName;
	}

	public void setSendersName(String sendersName) {
		this.sendersName = sendersName;
	}

	public String getReciversName() {
		return reciversName;
	}

	public void setReciversName(String reciversName) {
		this.reciversName = reciversName;
	}
	
	
	

}
