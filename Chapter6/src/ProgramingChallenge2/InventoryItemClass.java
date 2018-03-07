package ProgramingChallenge2;



	public class InventoryItemClass
	{
	   private String description;  // Item description
	   private int units;           // Units on-hand

	 

	   public InventoryItemClass()
	   {
	      description = "";
	      units = 0;
	   }

	 

	   public InventoryItemClass(String d)
	   {
	      description = d;
	      units = 0;
	   }
	   
	   
	   public InventoryItemClass(InventoryItemClass item4){
		   description = item4.description;
		   units = item4.units;
		   
		   
	   }
	 
	   public InventoryItemClass(String d, int u)
	   {
	      description = d;
	      units = u;
	   }

	   
	   public void setDescription(String d)
	   {
	      description = d;
	   }

	

	   public void setUnits(int u)
	   {
	      units = u;
	   }

	 

	   public String getDescription()
	   {
	      return description;
	   }

	  

	   public int getUnits()
	   {
	      return units;
	   }
	}