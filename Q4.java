import java.util.Scanner;
public class Q4 
{
	void display(int n) 
    {  
        int space =n/2, num=1; 
        for (int i=1;i<=n;i++) 
        { 
          for (int j=1;j<=space;j++) 
                System.out.print(" "); 
               int count=num/2+1; 
            for (int k=1;k<=num;k++) 
            { 
                System.out.print(count); 
                if(k<=num/2) 
                    count--; 
                else
                    count++; 
            } 
            System.out.println(); 
            if (i<=n/2) 
            { 
                space = space-1; 
                num=num + 2; 
            } 
           else 
           { 
                space = space + 1; 
                num=num-2; 
            }
        }
        } 
	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num=sc.nextInt();
      Q4 d =new Q4();
      d.display(num);

	}

}
