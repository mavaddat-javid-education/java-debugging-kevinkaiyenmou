// DebugSix1.java
// Start with a penny
// double it every day
//   how much do you have in a 30-day month?
public class DebugSix1
{
   public static void main(String args[])
   {
      final int DAYS = 30;
      double money = 0.01;
      for(int i = 0; i < DAYS; i++)
      {
         money = 2 * money;
         System.out.println("After day " + String.format("%2d",i+1) +
            " you have $" + String.format("%11.2f",money));
      }
   }
}
