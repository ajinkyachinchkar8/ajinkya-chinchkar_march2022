import java.util.*;

  class FibonacciSeries{
	  static int fibonacci(int n){
	  if(n<=1)
		  return 1;
	  else 
		  return fibonacci(n-1)+fibonacci(n-2);
  }

  public static void main(String... args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number ");
	   int n = sc.nextInt();
      
	  for (int i=0;i<=10;i++){
		  System.out.println(fibonacci(n-2)+"");
	  }
  }
 }
 
	  
  