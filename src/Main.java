import java.util.Random;
import java.util.Scanner;

public class Main
{
	private static Scanner scan = new Scanner(System.in);
	private final static long time = System.currentTimeMillis();
	private static int key = 0;
	private static String str = "";
	private static char[] charArray;
	private static int[] ASCII;

	public static void main(String[] args)
	{

		System.out.println("Enter your string to encrypt: ");
		str = scan.nextLine();

		key = findMiddleDigitOfKey();
			
		charArray = str.toCharArray();
		ASCII = new int[charArray.length];
		encrypt();
	}

	private static void encrypt()
	{
		for(int i = 0; i < charArray.length; i++)
		{
			char character = charArray[i];
			ASCII[i] = (int) character;
		}
		
		
		for(int i = 0; i < ASCII.length; i++)
		{
			ASCII[i] = ASCII[i] * key;
		}
		
		System.out.println("Your new encrypted string is: ");
		for(int i = 0; i < ASCII.length; i++)
		{
			System.out.print(ASCII[i] + " ");
		}
	}

	private static int findMiddleDigitOfKey()
	{
		int x = (int) time;
		String num = Integer.toString(x);
		Random rand = new Random();
		int n = rand.nextInt(num.length());
		while(true)
		{
			if(Integer.parseInt("" + num.charAt(n)) == 0)
			{
				n = rand.nextInt(num.length());
			}
			else
			{
				break;
			}
		}
		return Integer.parseInt("" + num.charAt(n));
	}

}
