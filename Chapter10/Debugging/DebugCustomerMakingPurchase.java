public class DebugCustomerMakingPurchase extends DebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;
    public DebugCustomerMakingPurchase(int id, String name, double credit, double purchAmount)
    {
      super(id, name, credit);
       amountOfPurchase = purchAmount;
       if(amountOfPurchase > this.credit)
          overLimit = true;
       else
          overLimit = false;
    }
    @Override
    public void display()
    {
       super.display();
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit == true)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
