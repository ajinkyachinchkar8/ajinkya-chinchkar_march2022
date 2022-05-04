class Mathoperations {

int num1;
int num2;
static double result;
  
  Mathoperations(int num1,int num2){
   System.out.println("Maths Operations");
   this.num1=num1;
   this.num2=num2;
  
  }
  
  void Addition(){
  result = num1+num2;
  System.out.println("Result : "+result);
  Substraction();
  }
  
  void Substraction(){
  result = num1-num2;
  System.out.println("Result : "+result);
  Multiplication();
  }
  
  void Multiplication(){
  result = num1*num2;
  System.out.println("Result : "+result);
  Division();
  }
  
  void Division(){
  result = num1/num2;
  System.out.println("Result : "+result);
  }
  }
  
  class Mathoper {
  public static void main(String args[]){
   Mathoperations m1= new  Mathoperations(34,56);
   m1.Addition();
   }
  }