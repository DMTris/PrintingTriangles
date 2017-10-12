/*
*  Project :  A05a
*  File    :  Triangles.java
*  Name    :  Chris Langdale
*  Date    :  10/10/2017(10/10/2017)
*/

public class Triangles
{
   public static void main(String [] args)
   {
      //print a pattern
      System.out.println("A");
      for (int i = 1; i <= 10; i++)
      {
         for (int j = 1; j <= i; j++)
         {
            System.out.print("*");
         }
      
         System.out.println();
      }
      
      //print b pattern
      System.out.println("B");
      for (int i = 10; i >= 1; i--)
      {
         for (int j = 1; j <= i; j++)
         {
            System.out.print("*");
         }
         
         System.out.println();
      }
      
      //print c pattern
      System.out.println("C");
      for (int i = 10; i >= 1; i--)
      {
         for (int j = 10; j > i; j--)
         {
            System.out.print(" ");
         }
         
         for (int k = 1; k <= i; k++)
         {
            System.out.print("*");
         }
         
         System.out.println();
      }
      //print d pattern
      System.out.println("D");
      for (int i = 10; i > 0; i--)
      {
         for (int j = 0; j < i - 1; j++)
         {
            System.out.print(" ");
         }
         
         for (int k = 10; k > i - 1; k--)
         {
            System.out.print("*");
         }
         
         System.out.println();
      }
      
   }//end main
   
}//end class