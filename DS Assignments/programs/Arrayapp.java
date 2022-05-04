class Arrayapp
{
  public static void main(String args[])
  {
     int arr[]=new int[50];
	 arr[0]=10;
	 arr[1]=20;
	 arr[2]=25;
	 arr[3]=30;
	 arr[4]=40;
	 arr[5]=50;
	 arr[6]=60;
	 arr[7]=70;
	 arr[8]=80;
	 arr[9]=90;
	 
	 int n=10;
     int key=60;
	 int i;
	 int k;
	 
	for( i=0;i<n;i++)
	{
	  System.out.println(arr[i]);
	}
	
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