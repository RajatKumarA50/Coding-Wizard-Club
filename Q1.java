import java.util.Scanner;
public class Q1 
{
    public static void find3Numbers(int arr[], int sum) 
    { 
        for (int i=0;i<arr.length-2;i++) 
        { 
          for (int j=i+1;j<arr.length-1;j++)  
        	  {
                for (int k=j+1;k<arr.length;k++) 
                { 
                    if (arr[i]+arr[j]+arr[k]==sum) 
                    { 
                        System.out.print("Triplet is: "+ arr[i] +", "+arr[j]+", "+arr[k]);                    
                    } 
                } 
            } 
        } 
    } 
	public static void main(String[] args) 
	{
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter size of array: ");
		  int n=sc.nextInt();
	      int arr[] =new int[n];
	      System.out.println("Enter "+n+" numbers: ");
	      for(int i=0;i<n;i++)
	      {
	    	  arr[i]=sc.nextInt();
	      }
	      System.out.println("Enter sum: ");
	      int sum=sc.nextInt();
	      Q1 t = new Q1(); 
	      t.find3Numbers(arr,sum); 
   }
}
