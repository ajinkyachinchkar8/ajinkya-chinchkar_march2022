/* WAP to access/invoke Static variable and static method.*/
class Statc {
static int a=34;
static float b=56.78f;
double c=45.8;

static void display(){
System.out.println("Hiii CDAC Mumbai");
}

 void display2(){
System.out.println("Hiii Juhu");
}


 public static void main (String args []){
 System.out.println(a);
 System.out.println(b);
 //System.out.println(c);
 display();
 //display2(); //non static content can't be accesed in staic content
 Statc sc = new Statc();
 sc.display2();
 }
 }