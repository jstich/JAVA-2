package ProgramingChallenge7;

import java.text.DecimalFormat;


public class RetailItemClassModified {
	private String description;  // Item description
	   private int itemNumber;      // Item number
	   private CostData cost;       // Cost data

	   public RetailItemClassModified(String desc, int itemNum, 
	                     double wholesale, double retail)
	   {
	      description = desc;
	      itemNumber = itemNum;
	      cost = new CostData(wholesale, retail);
	   }

	   
	   public String toString()
	   {
	      String str;  // To hold a descriptive string.
	      
	      // Create a DecimalFormat object to format output.
	      DecimalFormat dollar = new DecimalFormat("#,##0.00");

	      // Create a string describing the item.
	      str = "Description: " + description
	          + "\nItem Number: " + itemNumber
	          + "\nWholesale Cost: $" 
	          + dollar.format(cost.wholesale)
	          + "\nRetail Price: $" 
	          + dollar.format(cost.retail);
	      
	      // Return the string.
	      return str;
	   }

	  

	   private class CostData
	   {
	      public double wholesale,  // Wholesale cost
	                    retail;     // Retail price


	      public CostData(double w, double r)
	      {
	         wholesale = w;
	         retail = r;
	      }
	   }
	}