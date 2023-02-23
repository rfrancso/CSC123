//Francisco Rodriguez (frodriguez127@toromail.csudh.edu)


import java.util.Scanner;

public class Gravity {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter height in meters: ");
    double height = sc.nextDouble();
    
    System.out.print("Time in seconds: ");
    double time = sc.nextDouble();
    
    double acceleration = -9.81;
    double initialVelocity = 0;
    
    double distanceFallen = 0.5 * acceleration * (time * time);
    double distanceFromGround = height + distanceFallen;
    
    System.out.println("After being dropped from " + height + " meters, the object fell " + distanceFallen + " meters in " + time + " seconds. The distance from the ground at the time was " + distanceFromGround + " meters.");
  }
}
