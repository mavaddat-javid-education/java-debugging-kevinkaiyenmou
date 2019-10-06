public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("ocean liner");
      this.setPassengers();
      this.setPower();
   }
   protected void setPassengers()
   {
      super.passengers = 2400;
   }
   protected void setPower()
   {
      super.power = "four engines";
   }
}
