 //declarations of array
 import java.util.*;
 class Array {
  
public static void main(String args[]){
	
      //method1 
      int arr[] = new int[6];
	 
      for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
      }
	  System.out.println("");
	   
	
	   //method2
	   int a1[] = new  int[5]; //array declared
		
	  for(int i=0;i<=4;i++){
		
	  System.out.println("Array element = "+a1[i]);
		}
		
		
		//method3 input
		int a2[] = new  int[5];  //array declared
		Scanner sc = new Scanner(System.in);//user input 
		
		for(int i=0;i<=4;i++){   //total 5 elements:0 to 4
		System.out.println("Enter Array elements ["+i+"] : ");
		a2[i] = sc.nextInt();
		
		}
		
		for(int i=0;i<=4;i++){
		
		System.out.println("Array element = "+a2[i]);
		}
		
		
		//method 4
		int a3[] = {1,2,3,4,5};
		
		
		for(int i=0;i<=4;i++){
		
		System.out.println("Array element = "+a3[i]);
		}
		
		
}
 }
 