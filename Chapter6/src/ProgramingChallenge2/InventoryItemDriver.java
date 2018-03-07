package ProgramingChallenge2;

public class InventoryItemDriver {

	
	   public static void main(String[] args)
	   {
	     
	      InventoryItemClass item1, item2, item3, item4;

	      
	      // no-arg constructor.
	      item1 = new InventoryItemClass();
	      System.out.println("Item 1:");
	      System.out.println("Description: "
	                         + item1.getDescription());
	      System.out.println("Units: " + item1.getUnits());
	      System.out.println();


	      // Instantiate item2 and use the 
	      // second constructor.
	      item2 = new InventoryItemClass("Wrench");
	      System.out.println("Item 2:");
	      System.out.println("Description: "
	                         + item2.getDescription());
	      System.out.println("Units: " + item2.getUnits());
	      System.out.println();

	      // Instantiate item3 and use the 
	      // third constructor.
	      item3 = new InventoryItemClass("Hammer", 20);
	      System.out.println("Item 3:");
	      System.out.println("Description: "
	                         + item3.getDescription());
	      System.out.println("Units: " + item3.getUnits());
	      
	      System.out.println("\nThis is the copy of Item 3" );
	      item4 = new InventoryItemClass(item3);
	      System.out.println("Item 4:");
	      System.out.println("Description: "
	                         + item4.getDescription());
	      System.out.println("Units: " + item4.getUnits());
	      
	   }
	}
