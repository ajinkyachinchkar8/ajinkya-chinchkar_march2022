 /*Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].

		Examples :  

		Input : arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170}
			  x = 110;
		Output : 6
		Element x is present at index 6

		Input : arr[] = {10, 20, 80, 30, 60, 50, 
				     110, 100, 130, 170}
			   x = 175;
		Output : -1
		Element x is not present in arr[].
*/
	
	class LinearSearch {
		static int i=0;
		static int j;
		static int result1;
		static int result2;
		public static int linearsearch(int arr[],int x){
			
			int n = arr.length;
			for(i=0;i<n;i++){
				if(arr[i]==x)
					return i;
			}
			return-1;
			}
			
		public static int linearsearch2(int arr1[],int y){	
			int z = arr1.length;
			for(j=0;j<z;j++){
				if(arr1[j]==y)
					return j;
			}
			return-1;
			}
	
				
	public static void main(String... args){
			
			int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
		    int x=110;
		    result1 = linearsearch(arr,x);
			
			if(result1==-1)
				System.out.println("Element is not present in array");
			else
				System.out.println(" "+i);
				System.out.println("Element is present at index"+i);
			
		
		    int arr1[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
			int y = 175;
			result2 = linearsearch2(arr1,y);
			
			if(result2==-1)
				System.out.println("Element is not present in array");
			else{
				System.out.println(" "+j);
				System.out.println("Element is present at index"+j);
			}
				
			
		}
	}
	