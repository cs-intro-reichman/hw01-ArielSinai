public class Triangle
{
    public static void main(String[] args) 
	{
        // decler integers + convert argument to int
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		// check if triangle and prints true or false
		if ((a + b > c) && (b + c > a) && (a + c > b)) 
		{
			System.out.println(a + ", " + b + ", " + c + ": true");
		}
		else 
		{
			System.out.println(a + ", " + b + ", " + c + ": false");
		}
    }
}