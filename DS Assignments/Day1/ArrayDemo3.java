/*Write a Java Menu driven Program for Arrays Data structure for following Menu.
		1.Insert
		2.Display
		3.Search
		4.Delete
		5.Exit
*/

import java.util.*;

   class ArrayMethods1{
	   int a1[] =new int[]{10,20,30,40,50,60};
	   
         /*a1[0]=10;
		 a1[1]=20;
		 a1[2]=30;
		 a1[3]=40;
		 a1[4]=50;
		 a1[5]=60;
	   */
	  
	   int n=6;
	   int i;
	   int key=40;
	   
	Scanner sc = new Scanner(System.in);
	void Insert(){
		 
		int a2[] =new int[10];
	    System.out.println("Enter Array elements");
		
		for(i=0;i<n;i++)
			a2[i]=sc.nextInt();
	    }
	
		
	void Display(){
		  System.out.println("Display Array elements");
		  
		  for(i=0;i<n;i++)
			   System.out.println(a1[i]);
	}
	
	      
	void Search(){
		
		for(i=0;i<n;i++){
			if(a1[i]==key){
				System.out.println("key"+key+"found");
			break;
			}
		}
			if(a1[i]==n)
				System.out.println("key"+key+"not found");
		
	}
		
	
    void Delete(){
		  
		for(i=0;i<n;i++){
			if(a1[i]==key){
			break;
			}
		}
		n--;
	    if(i==n)
				System.out.println("key"+key+"not found");
	    else{
		for(int k=i;k<n;k++){
			a1[k]=a1[k+1];
		}
	    for(i=0;i<n;i++){
		  System.out.println(a1[i]);
	    }
	}
    }
}
   
	
	class ArrayDemo3{
	    public static void main (String... args){
			Scanner sc = new Scanner(System.in);
			
			ArrayMethods1 ar = new ArrayMethods1();
			    System.out.println("Enter 1 for Insert");
				System.out.println("Enter 2 for Display");
		        System.out.println("Enter 3 for Search");
				System.out.println("Enter 4 for Delete");
				System.out.println("Enter your choice");
				
			    int ch=sc.nextInt();
			switch(ch){
                case 1:ar.Insert();
                       break;
                case 2:ar.Display();					   
                	   break;	
                case 3:ar.Search();					   
                	   break;
                case 4:ar.Delete();					   
                	   break; 
                default:System.out.println("Invalid choice");
			}
		}
	}
	
	
									   
			
	