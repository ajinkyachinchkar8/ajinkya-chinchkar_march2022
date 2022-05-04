import java.util.*;
class Reversearray
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int arr[]=new int[6];
   int i;
   int n=5;
   System.out.println("Enter the array elements");
   for(i=0;i<arr.length;i++)
   {
      arr[i]=sc.nextInt();
	}
	for(i=0;i<arr.length;i++)
	{
	  System.out.println(arr[i]);
	}
	
    
	System.out.println();
	
	for(i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
		
		
	
		

	
	
	
}

}

	   
  