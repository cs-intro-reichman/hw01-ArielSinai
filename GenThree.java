import java.lang.Math;
public class GenThree
{
    public static void main(String[] args) 
	{
		//define range
	    int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int range = max - min ;
		//create and print 3 random number within the range
		int rand1 = (int)(Math.random() * range) + min;
		System.out.println(rand1);
		int rand2 = (int)(Math.random() * range) + min;
		System.out.println(rand2);
		int rand3 = (int)(Math.random() * range) + min;
		System.out.println(rand3);
		// find and print the minimum number
		int minimum1 = Math.min(rand1, rand2);
		int minimum = Math.min(rand3, minimum1);
		System.out.println("The minimal generated number was " + minimum);
    }
}