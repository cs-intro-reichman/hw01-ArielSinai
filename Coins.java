public class Coins
{
    public static void main(String[] args) 
	{
        // decler integer + convert argument to integer
		int a = Integer.parseInt(args[0]);
		// calculate and print the quantity of quarters and cents
		System.out.println("Use " + (a / 25) + " quarters and " + (a % 25) + " cents");
    }
}