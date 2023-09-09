/*Print a horizontal star shaped isosceles triangle with the entered value for base*/

import java.util.Scanner;

public class HorizontalStarShapedIsoscelesTriangle{
   public static void main(String[] args){
      while(true){
      System.out.println("Please enter the value for base to build a horizontal star shaped isosceles triangle :");
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      System.out.println();
      horizontalStarShapedIsoscelesTrianglePrinter(number);
      System.out.println("--------------------------------------------------------------------------------------");
      }
   }

   public static void horizontalStarShapedIsoscelesTrianglePrinter(int number){
      int half = number/2;
      for(int i = half; i >= 1; --i){
         for(int j = half; j >= i; j--){
            System.out.print("* ");
         }
         System.out.println("");
      }
      if (number%2 != 0){
         for(int i = 0; i <= half; ++i){
            System.out.print("* ");
         }
         System.out.println();
      }
      for(int i = 1; i <= half; ++i){
         for(int j = half; j >= i; --j){
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}


// by Arman Azarnik
// armanazarnik@gmail.com