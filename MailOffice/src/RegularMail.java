
public class RegularMail extends Mail {

	private static final double COST = 0.30;
	
	
	
	public RegularMail(String sendersName, String reciversName, double weight, String zip) {
		super(sendersName, reciversName, weight, zip);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateTotalCost() {
		
		return (super.getWeight() * COST );
	}
	
	public String toString(){
		
		return("Regular Mail :  " + super.toString() + " cost = " + calculateTotalCost());
		
		
	}

}
