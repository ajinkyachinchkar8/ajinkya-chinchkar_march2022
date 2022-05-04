import java.util.Scanner;
class ArrayReverse{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Array["+i+"] = ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Array : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		//reverse
		System.out.print("Reverse Array : ");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
			
		}
	}
}