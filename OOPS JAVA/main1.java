class A {
static int a =10;
 int i;
 int b;
 float f;
 
void printdata(){
System.out.println("hi");
}

void m1(int i, int b,float f){
this.i=i;
this.b=b;
this.f=f;
System.out.println(" "+i+" "+b+" "+f+" ");
}

void m1(int i, int b,double d){
System.out.println("int i, int b,double d :m1");
}

void m2(int i){
System.out.println("int i: m2");
}

void m2(double i){
System.out.println("double i:m2");
   }
}


class B extends A {
	
void m1(int i, int b,double d){    //overriding
System.out.println("int i, int b,double d :m1");
}

void m2(float i){    //overloading
System.out.println("float i:m2");
   }
}


class main1 {
	public static void main(String [] args){
   A a = new A();
   a.m1(10,10,25.34);
 
   B b = new B();
   b.m1(20,30,45.56f);
   b.m1(23,34,56.67);
   b.m2(29);
   b.m2(30.45f);
   
   System.out.println(A.a);
   a.printdata();
 }
}

