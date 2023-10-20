/**
 *
 * @author user
 */
import java.util.Scanner;
public class Room2 {
 public static void main(String[] args)
 {
     int length, width;
     double Area;
     
     Scanner Areaform = new Scanner(System.in);
     System.out.print ("What is the length of the Room?\n");
     System.out.print("length:");
     length = Areaform.nextInt();
     
     System.out.print ("What is the width of the Room?\n");
     System.out.print ("width:");
     width = Areaform.nextInt();
     
     Area = length * width;
     System.out.println ("The length of the Room is: " + length + " And the width of the Room is: " + width + ".\n" 
     + "The total Area of the Room is " + Area + " Square Feet.");
     
     
 }
 
}