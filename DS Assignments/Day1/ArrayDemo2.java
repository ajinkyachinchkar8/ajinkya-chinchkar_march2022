/*Array program for searching and deleting elements using methods*/

import java.util.*;

   class ArrayMethods{
	   int a1[] =new int[50];
       Scanner sc = new Scanner(System.in);
	   
	   int n=10;
	   int i;
	   int key;
	   
	   
	void Insert(){
	    System.out.println("Enter Array elements");
		
		for(i=0;i<n;i++)
			a1[i]=sc.nextInt();
	    }
		
		
	void Display(){
		  System.out.println("Display Array elements");
		  
		  for(i=0;i<n;i++)
			   System.out.println(a1[i]);
	}
	
	      
	void Search(){
		System.out.println("Enter key: ");
		  key=sc.nextInt();
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
		  System.out.println("Enter key: ");
		  key=sc.nextInt();
		System.out.println("Array Element after Deleting Key");
		for(i=0;i<n;i++){
			if(a1[i]==key){
			break;
			}
		}
	if(a1[i]==n){
				System.out.println("key"+key+"not found");
	} else{
		for(int k=i;k<n;k++){
			a1[k]=a1[k+1];
		 
		}
	   for(i=0;i<n-1;i++){
		  System.out.println(a1[i]);
	   }
	}
	}
   }
	
	class ArrayDemo2{
	    public static void main (String... args){
			ArrayMethods ar = new ArrayMethods();
			    ar.Insert();
                ar.Display();
				ar.Search();
				ar.Delete();
		}
	}
   
   
	
	
	
			
				
			
			  
		 


