package ProgramingChallenge8;

public class CashRegister
{
    private RetailItem retailItem;
    private int quantityItems;
    private final double SALES_TAX = .06;
    private int subTotal;
    private double price;
    public CashRegister ()
    {
        quantityItems = 0;
        subTotal = 0;
    }
   public CashRegister(RetailItem retailObject, int quantity)
   {
      price = retailObject.getPrice();
      quantityItems = quantity;
   }
    public RetailItem getRetailItem()
    {
        return new RetailItem();
    }
    public double getSubTotal()
    {
        return quantityItems * retailItem.getPrice();
    }
    public double getTax()
    {
        return SALES_TAX;
    }
    public double getTotal()
    {
        return subTotal + SALES_TAX;
    }
}