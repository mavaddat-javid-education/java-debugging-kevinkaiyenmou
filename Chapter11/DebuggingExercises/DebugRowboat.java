public class DebugRowboat extends DebugBoat
{
   public DebugRowboat()
   {
      super("row");
      this.setPassengers();
      this.setPower();
   }
   protected void setPassengers()
   {
      super.passengers = 2;
   }
   protected void setPower()
   {
      super.power = "oars";
   }
}
