import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String: ");
		String str1 =sc.nextLine();
		System.out.println("Enter second String: ");
		String str2 =sc.nextLine();
		char arr[] = new char[str1.length()];
		char[] mask = new char[256];
		for(int i=0;i<str2.length();i++)
		mask[str2.charAt(i)]++;
		for(int i=0;i<str1.length();i++)
		{
		if(mask[str1.charAt(i)]==0)
		System.out.print(str1.charAt(i));
		}
		}
	}


