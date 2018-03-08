package ProgramingChallenge3;

public class num3Retail {
	
	private String description; //description
	private int unitsOnHand; // units on hand
	private double price; // price
	
	public num3Retail(String description, int unitsOnHand, double price) {
		// TODO Auto-generated constructor stub
		setDesc(description); // sets description
		setUnits(unitsOnHand); // sets units on hand
		setPrice(price); // sets price
		 if (unitsOnHand < 0){ // checks to see 
			 try {
					throw new negativeUnit(unitsOnHand); // throws an error
				} catch (negativeUnit e) {
					e.getMessage(); // displays the message
				}
		 }
		 if (price < 0){
			 try {
					throw new negativePrice(price); // throws an error
				} catch (negativePrice e) {
					e.getMessage(); // displays the message
				}
		 }
		
	}
	
	

	
	public String getDesc() {
		return description;
	}

	
	public void setDesc(String description) {
		this.description = description;
	}

	
	public int getUnits() {
		return unitsOnHand;
	}

	
	public void setUnits(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}

	
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		this.price = price;
	}
}
