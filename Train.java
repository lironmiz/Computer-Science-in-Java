import java.util.Scanner;
public class Train
{
 public static void main (String [] args)
 {
  Scanner scan = new Scanner (System.in);
  System.out.println ("Please enter 4 integers "); 
  System.out.println ("Please enter the speed of train 1:");
  int v1 = scan.nextInt();
  System.out.println ("Please enter the time of train 1:");
  int t1 = scan.nextInt();
  System.out.println ("Please enter the speed of train 2:");
  int v2 = scan.nextInt();
  System.out.println ("Please enter the time of train 2:");
  int t2 = scan.nextInt();
  int dis = Math.abs(((t1 / 60) * v1) - ((t2 / 60) * v2));
  Systen.out.println (" The distance between the trains is " + dis + "km");
 } // end of method main
} //end of class Train
