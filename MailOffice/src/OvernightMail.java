
public class OvernightMail extends Mail {
	
	private static final double COST = 3;
	
	
	
	public OvernightMail(String sendersName, String reciversName, double weight, String zip) {
		super(sendersName, reciversName, weight, zip);
	}

	@Override
	public double calculateTotalCost() {
		
		return(super.getWeight() * COST);
	}
	
	public String toString(){
		
		return("Overnight Mail :  " + super.toString() + " cost = " + calculateTotalCost());
		
		
	}

}
