 /*Binary search of an element"*/
 
  class BinarySearch{
    public static int binarysearch(int a1[],int x,int l,int r){
	  if(l<=r){
		  int mid = (l+r)/2;
		  if(a1[mid]==x)
			  return mid;
		  if(a1[mid]>x)
			  return binarysearch(a1,x,l,mid-1);
		  if(a1[mid]<x)
		      return binarysearch(a1,x,mid+1,r);
	  }
	  return-1;
	}
  
    public static void main(String... args){
	  
	  int a1[]={2,4,8,9,12,58};
	  int x =12;
	  int n = a1.length;
	  int result = binarysearch(a1,x,0,n-1);
	  
	  if(result==-1)
		  System.out.println("Array element not found");
	  else
       	  System.out.println("Array element found");
    }
 }
 
	  
       
	   
