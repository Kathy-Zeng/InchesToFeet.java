/* Kathy Zeng
   9/11/20
   CalculatePi.java
   This will give 2 different approximations of pi. Both will be printed to
   2 places, then 6 places, then give the difference from pi.
   Working on: Declare and intialize variables, formatting output using
   printf and Format.
*/

public class CalculatePi
{
	private final float PI = 3.141592;

	public static void main(String[] args)
	{
	   CalculatePi calcPi = new CalculatePi();
	   calcPi.firstApprox();
	   calcPi.secondApprox();
	}

    /* Pseudocode = Plan
     * D & I variable approx1, diff1
     * Set approx1 to 22/7, diff1 to difference between approx1 and PI
     * Print three blank lines, then the first intro sent using PI
     * Print approx1 to 2 places, then 6, then the diff to 6 places 
     */ 

     
	public void firstApprox()
	{
      float approx1;
      approx1 = 22/7
      System.out.println("PI - approx1");
      System.out.printf("%0.2f\n", approx1);



      System.out.println("PI - approx1");
      System.out.printf("%0.6f\n", approx1);
    }

    /* D & I variable approx2, diff2
     * Set approx2 to (4 + 100) * 8 + 62000 all divided by 20000,
     * diff2 to difference between approx2 and PI
     * Print one blank link
     * Print approx2 to 2 places, then 6, then the diff2 to 6 places
     * Print three blank lines.
     */ 
    

    public void secondApprox()
    {
      float approx2;
      approx2 = (4 + 100) * 8 + 62000/20000;
      float diff2;
      diff2 = ("PI - approx2"); 
      System.out.println("PI - approx2");
      System.out.printf("%0.2f\n", approx2);

      System.out.println("PI - approx2"); 
      System.out.printf("%0.6f\n", approx2);
      System.out.println("diff2");
      System.out.printf("%0.6f\n", diff2); 

    }
 }
