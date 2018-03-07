package ProgramingChallenge4;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class softwareSalesDriver {

	public static void main(String[] args) {
		

				   
				   	DecimalFormat money = new DecimalFormat("$#,##0.00");
				   	DecimalFormat percent = new DecimalFormat("#0%");
				   	
				   	String inputPackageAmount;
				   	double quantity;
				   	softwareSales some= new	softwareSales();
				   	inputPackageAmount = JOptionPane.showInputDialog("enter the number of packages");
				   	quantity = Integer.parseInt(inputPackageAmount);
				   	some.setQuant(quantity);

					
				   	JOptionPane.showMessageDialog(null, "The Discount amount is: " + percent.format(some.getDiscount()) + 
				   										"\nThe Purchase amount after the discount is: " + money.format(some.getTotalAmount()));	
				   }

		
	}


