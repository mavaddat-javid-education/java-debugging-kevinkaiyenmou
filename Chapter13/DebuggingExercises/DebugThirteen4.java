// Reads file of entrees and prices
// prompts user for a cutoff price
// and displays entrees that cost no more than the cutoff
import java.nio.file.*;
import java.text.NumberFormat;
import java.io.*;
import static java.nio.file.AccessMode.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class DebugThirteen4
{
   public static void main(String[] args)
   {
      Scanner keyBoard = new Scanner(System.in);
      Path file =
         Paths.get("/Users/kevinmou/Documents/GitHub/java-debugging-kevinkaiyenmou/Chapter13/DebuggingExercises/DebugData4.txt");
      String[] array = new String[2];
      String string = "";
      String delimiter = ",";
      double searchPrice;
      boolean wasFound = false;
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file, CREATE));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));       

         System.out.print("\nEnter maximum price to search for >> ");
         searchPrice = Integer.parseInt(keyBoard.next());
         System.out.println("\nEntrees no more than " + NumberFormat.getCurrencyInstance().format(searchPrice) + "\n");
         string = reader.readLine();
         while(string != null)
         {
            array = string.split(delimiter);
            Double p = Double.parseDouble(array[1]);
            if(searchPrice >= Double.parseDouble(array[1]))
            {
               wasFound = true;
               System.out.println(array[0] + " " + NumberFormat.getCurrencyInstance().format(p));
            }
            string = reader.readLine();           
         }
         if(!wasFound)
            
           System.out.println("No entrees found under $" + NumberFormat.getCurrencyInstance().format(searchPrice));
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}
