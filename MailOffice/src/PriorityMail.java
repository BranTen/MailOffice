
public class PriorityMail extends Mail {
	private static final double COST = 1.5;
	
	
	
	public PriorityMail(String sendersName, String reciversName, double weight, String zip) {
		super(sendersName, reciversName, weight, zip);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateTotalCost() {
		
		return (super.getWeight() * COST);
	}
	
	public String toString(){
		
		return("Priority Mail :  " + super.toString() + " cost = " + calculateTotalCost());		
		
	}

}
