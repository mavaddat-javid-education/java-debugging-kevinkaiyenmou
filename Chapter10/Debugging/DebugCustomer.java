public class DebugCustomer
{
    protected int id;
    protected String name;
    protected double credit; //'credit' is the credit limit
    public DebugCustomer(int id, String name, double credit /*'credit' is the credit limit */)
    {
       this.id = id;
       this.name = name;
       this.credit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + id + " Name: " +  name + "\nCredit limit $" + credit);
    }
}
