import java.util.*;
public class BubbleSort{
  public static void main(String[] args) {
  int[] someNums = {88, 33, 99, 22, 54};

  System.out.println("Array is now:\t\t\t"+Arrays.toString(someNums));
  int a,b, temp;
  for (a=0; a < someNums.length -1; ++a) {

    for(b = 0 ; b < someNums.length - 1; ++b)
      if(someNums[b] > someNums[b + 1]){
        temp = someNums[b];
        someNums[b] = someNums[b + 1];
        someNums[b + 1] = temp;
        System.out.println("When a is "+ a +" and b is "+ b +" then the array is now:\t"+Arrays.toString(someNums));
      }

    }
  }
}
