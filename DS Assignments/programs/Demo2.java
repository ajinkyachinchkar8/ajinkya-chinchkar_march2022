
import java.util.*;
class Arrayapp1
{
  
     int arr[]=new int[50];
	 Scanner sc=new Scanner(System.in);
	 
	 int n=10;
     int key=110;
	 int i;
	 int k;
	 void insert()
	 {
	 
	  System.out.println("Enter elements in an array");
	 for(i=0;i<n;i++)
	 {
	   arr[i]=sc.nextInt();
	  }
	 
	/*for( i=0;i<n;i++)
	{
	  System.out.println(arr[i]);
	}
	*/
   }
   
   
  void display()
  {
  
    System.out.println("Array elemnts are:");
	for( i=0;i<n;i++)
	{
	  System.out.println(arr[i]);
	}
  }
  
	void Search()
	{
	for(i=0;i<n;i++)
	{
		if(arr[i]==key)
		{
			System.out.println("elements "+arr[i]+" is found");
			break;
		}
		
	}
	if(i==n)
	{
	 System.out.println("elements "+key+" is not found");
	 
	}
  }
  
  
  void delete()
  {
  
   System.out.println("Array elemnts after deleting key");
   for(i=0;i<n;i++)
	{
		if(arr[i]==key)
		{
			
			break;
		}
		
	}
	
	 if(i==n)
	{
	 System.out.println("elements "+key+" is not found");
	}
	
	else
	{
	 for( k=i;k<n;k++)
	{
	 arr[k]=arr[k+1];
	}
	for(k=0;k<n-1;k++)
	{
		System.out.println(arr[k]);
	}
    }
	 
  
  	
	
	
  }
	
 
  
}

class Demo2
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		Arrayapp1 a1=new Arrayapp1();
		
		System.out.println("Enter 1 for insert");
		System.out.println("Enter 2 for Display");
		System.out.println("Enter 3 for Search");
		System.out.println("Enter 4 for delete");
		System.out.println("Enter Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		 case 1:a1.insert();
		        break;
		 case 2:a1.display();
		        break;
		 case 3:a1.Search();
		        break;
		 case 4 :a1.delete();
		        break;
		 default:System.out.println("Invalid Choice");
		}
	}
	
}
		