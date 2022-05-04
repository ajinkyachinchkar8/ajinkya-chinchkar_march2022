class ArrayDemo{
   public static void main (String... args){
   
   
        int a[]=new int[50]; 
		int i;
		
				a[0]=10;
				a[1]=20;  
				a[2]=70;  
				a[3]=40;  
				a[4]=50;
				a[5]=60;
				a[6]=70; 
				a[7]=80;  
				a[8]=90;  
				a[9]=100;

                int n = 10;
				
				
				for(i=0;i<n;i++){         //printing array elements
					System.out.println(a[i]+" ");
				}
				
				
				int key=70;            //searching array element
				for(i=0;i<n;i++){  
	
					if(a[i]==key){
						System.out.println("Key found "+key);
					    break;
					} else 
						System.out.println("Key not found "+key);
				}
				if(a[i]==n)
					System.out.println("Not found");
				else
					System.out.println("Found");
				
				
				key=70;             //Deleting array element
				for(i=0;i<n;i++){
					if(a[i]==key)
						break;
				}
				for(int k=i;k<n;k++)
                    a[k]=a[k+1];
                    n--;		
				
                for(i=0;i<n;i++)
                   	System.out.println(a[i]+" ");
				
						
						
   }
}
				
				
				
		   
   