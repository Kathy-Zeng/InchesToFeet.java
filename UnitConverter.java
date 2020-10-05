// Kathy Zeng
// 10/5/20
// UnitConverter.java
// Description: This program will take in the number of inches and
// print the number of feet, yards and centimeters.

import java.util.Scanner;

public class UnitConverter
{
    private static double inches = 0.0;

	public static void main(String[] args)
	{

	 System.out.print("Welcome to Unit Converter!");
     input();
     double yards = 0.0;
     double feet = 0.0;
     double cm = 0.0;
     printOutput (yards, feet, cm);

    }
    public static void input()
    {
		
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter the inches: ");
     double inches = input.nextDouble();

    }   
    public static double inchesToFeet()
    {

     double feet = inches/12;
     return feet;

    }
    public static double feetToYards()
    {

	 double yards = inchesToFeet()/3;
	 return yards;

    }
    public static double inchesToCm()
    {

	 double cm = inches*2.54;
	 return cm;

    }
    public static void printOutput(double yards, double feet, double cm)
    {

     System.out.printf("%d inches, %.2f yards, %.2f feet, %.2f cm",
     inchesToFeet(), feetToYards(), inchesToCm()); 
     
    }
 }
