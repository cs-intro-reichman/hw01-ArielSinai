public class LinearEq
{
    public static void main(String[] args) 
	{
        // decler doubles + convert argument to double
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		// print the equation and find x
		System.out.println(a + " * " + "x" + " + " + b + " = " + c);
		double x = (c - b)/a;
		System.out.println("x = " + x);
    }
}