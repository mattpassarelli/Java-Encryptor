import java.security.SecureRandom;
import java.util.Scanner;

public class Main
{
	private static Scanner scan = new Scanner(System.in); 

	public static void main(String[] args)
	{
		String str, decrypted = "";
		char[] charArray;
		int[] ASCII;
		int key = 0;
		long time = System.currentTimeMillis();

		System.out.println("Enter your string to encrypt: ");
		str = scan.nextLine();

		key = findMiddleDigitOfKey(time);

		charArray = str.toCharArray();
		ASCII = new int[charArray.length];
		encrypt(charArray, ASCII, key);
		decrypt(charArray, ASCII, key, decrypted);
	}

	private static void decrypt(char[] charArray, int[] ASCII, int key, String decrypted)
	{
		for(int i = 0; i < ASCII.length; i++)
		{
			ASCII[i] = ASCII[i] / key;
		}

		for(int i = 0; i < ASCII.length; i++)
		{
			String temp = Character.toString((char) ASCII[i]);
			charArray[i] = temp.charAt(0);
		}

		decrypted = new String(charArray);
		System.out.println("Your decrypted string is: " + decrypted);
	}

	private static void encrypt(char[] charArray, int[] ASCII, int key)
	{
		for(int i = 0; i < charArray.length; i++)
		{
			char character = charArray[i];
			ASCII[i] = (int) character;
			charArray[i] = '0';
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

		System.out.println();
	}

	private static int findMiddleDigitOfKey(long time)
	{
		int x = (int) time;
		String num = Integer.toString(x);
		SecureRandom rand = new SecureRandom();
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
