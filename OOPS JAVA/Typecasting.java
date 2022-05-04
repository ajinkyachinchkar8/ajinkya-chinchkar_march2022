class Typecasting {
public static void main (String args []){
 int a=45;
 float b=a;  // (small to big feasible)
 System.out.println(b); //45.0
 
 /*double e =78; 
 int f=e;  //incompatible types:possible lossy conversion (big to small not allowed)
 System.out.println(b);
 */
 
 int c =78;
 double d=c;  //(small to big feasible)
 System.out.println(d);  //78.0
 
 //byte k = b+d; // incompatible types: possible lossy conversion
 double k =(double)a+c;
 System.out.println(k);
}
}