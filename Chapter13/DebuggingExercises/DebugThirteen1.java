// Program describes two files
// tells you which one is newer and which one is larger
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class DebugThirteen1
{
   public static void main(String[] args)
   {
      FileSystem fs = FileSystems.getDefault();
      Path file1 =
         fs.getPath("/Users/kevinmou/Documents/GitHub/java-debugging-kevinkaiyenmou/Chapter13/DebuggingExercises/DebugData1.txt");
      Path file2 =
         fs.getPath("/Users/kevinmou/Documents/GitHub/java-debugging-kevinkaiyenmou/Chapter13/DebuggingExercises/DebugData2.txt");
      try
      {
         BasicFileAttributes attr1 =
            Files.readAttributes(file1, BasicFileAttributes.class);
         System.out.println("File: " + file1.getFileName());
         System.out.println("Creation time: " + attr1.creationTime());
         System.out.println("Last modified time: " + attr1.lastModifiedTime());
         System.out.println("Size: " + attr1.size());
         BasicFileAttributes attr2 =
            Files.readAttributes(file2, BasicFileAttributes.class);
         System.out.println("\nFile: " + file2.getFileName());
         System.out.println("Creation time: " + attr2.creationTime());
         System.out.println("Last modified time: " + attr2.lastModifiedTime());
         System.out.println("Size: " + attr2.size());
         if(attr1.creationTime().compareTo(attr2.creationTime()) > 0)
            System.out.println("\n" + file1.getFileName() + " was created after " + file2.getFileName());
         else
            System.out.println("\n" + file1.getFileName() + " was not created after " + file2.getFileName());
         if(attr1.size() > attr2.size())
            System.out.println(file1.getFileName() + " is larger than " + file2.getFileName());
         else if(attr1.size() < attr2.size())
            System.out.println(file1.getFileName() + " is smaller than " + file2.getFileName());
         else
            System.out.println(file1.getFileName() + " is the same size as " + file2.getFileName());
      }
      catch(IOException e) 
      {
          System.out.println("IO Exception");
      }
   }
}
