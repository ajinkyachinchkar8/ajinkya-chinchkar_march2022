class StaticBlock{
static byte b;
static double d;

static {
b=567;
d=789.89;
}
}
class Demo{
 public static void main(String args[])
 System.out.println(StaticBlock.b);
  System.out.println(StaticBlock.d);
  }