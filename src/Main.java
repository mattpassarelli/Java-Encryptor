import java.util.Random;
import java.util.Scanner;

public class Main
{
	private static Scanner scan = new Scanner(System.in);
	private final static long time = System.currentTimeMillis();
	private static int key = 0;
	private static String str = "";
	
	public static void main(String[] args)
	{
		System.out.println("Enter your string to encrypt: ");
		str = scan.nextLine();
		System.out.println("String is: " + str);
		
		
		key = findMiddleDigitOfKey();
	}

	private static int findMiddleDigitOfKey()
	{
		int x = (int) time;
	    String num = Integer.toString(x);
	    Random rand = new Random();
	    int n = rand.nextInt(num.length());
	    while(true)
	    {
	    	if (n == 0)
	    	{
	    		n = rand.nextInt(num.length());
	    	}
	    	else
	    	{
	    		break;
	    	}
	    }
		n = Integer.parseInt("" + num.charAt(n), 10);
		return n;
	}

}
