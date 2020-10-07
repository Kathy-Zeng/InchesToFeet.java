// Kathy Zeng
// 10/5/20
// UnitConverter.java
// Description: This program will take in the number of inches (int) and
// print the number of feet, yards and centimeters.
// Example 1:
// input: 20. output: 20 inches is equivalent to 1.67 feet, 0.56 yards, and 50.80 centimeters.
// Example 2:
// input: 24. output: 12 inches is equivalent to 1.00 feet, 0.33 yards, and 30.48 centimeters.


import java.util.Scanner;

public class UnitConverter
{
    private static int inches = 0;

	public static void main(String[] args)
	{
     
	 System.out.print("Welcome to Unit Converter! This program will take in the number of inches and print the number of feet, yards and centimeters.");
     input();
     double yards = -1.0;
     double feet = -1.0;
     double cm = -1.0;
     feet = inchesToFeet();
     yards = feetToYards();
     cm = inchesToCm();
     print(feet, yards, cm);

    }
    public static void input()
    {
		
     Scanner input = new Scanner(System.in);
     System.out.println("\n");
     System.out.print("Please enter the number of inches: ");
     inches = input.nextInt();

    }   
    public static double inchesToFeet()
    {

     final double ft = 12;
     double feet= -1.0;
     feet = inches/ft;
     return feet;

    }
    public static double feetToYards()
    {

	 final double yds = 3;
     double yards= -1.0;
     yards = inchesToFeet()/yds;
	 return yards;

    }
    public static double inchesToCm()
    {

	 final double centimeters = 2.54;
	 double cm = -1.0;
	 cm = inches*centimeters;
	 return cm;

    }
    public static void print(double feet, double yards, double cm)
    {

     System.out.printf("%d inches is equivalent to %.2f feet, %.2f yards, and %.2f centimeters.\n", inches, feet, yards, cm); 
     System.out.println();
    }
 }
    
