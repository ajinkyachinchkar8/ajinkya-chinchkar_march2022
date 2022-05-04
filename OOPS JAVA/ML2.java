class Mulcntr {
 int num1;
 int num2;
  
 Mulcntr(int num1,int num2) {
 this(7.8,5.6);
 this.num1=num1;
 this.num2=num2;
 System.out.println("HELLOOO");
 }
 
 double num3;
 double num4;
 
 Mulcntr(double num3,double num4) {
 this.num3=num3;
 this.num4=num4;
  System.out.println("MUMBAI");
 }
 
  static double res;
 void addint(){
 res= num1+num2;
 System.out.println("result="+res);
 }
  
 void addouble(){
 res= num3+num4;
 System.out.println("result="+res);
 }
 
}
 class ML2 {
 public static void main (String args[]){
  Mulcntr m1 = new Mulcntr(22,32);
   m1.addint();
  Mulcntr m2 = new Mulcntr(22.67,32.54);
   m2.addouble();
   }
   }
 