 /*Program to reverse an array*/
 
 class ArrayReverseDemo{
    public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		size=sc.nextInt();
		int[] a1 = new int[size];
		
		for(int i=0;i<size;i++){
			System.out.println(" Array ["+i+"]= ");
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Array: ");
		for(inti=0;i<size;i++){
			System.out.println(a1[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("Reverse Array: ");
		for(int i=size-1;i>=0;i--){
			System.out.println(a1[i]+" ");
		}
	}
 }
 
		
		
		

			
	
