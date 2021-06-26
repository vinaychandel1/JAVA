 class A
 {
 int num;
 void show()
 {
 System.out.println("\nHello from A num :=  " + num);
 }
 }
 class B extends A
 {
 int num = 80;
 void show()
 {
 super.num = 50;
 super.show();
 System.out.println("\nHello from B num :=  " + num);
 }
 }
 class JPS12
 {
 public static void main(String args[])
 {
 B obj = new B();
 obj.show();
 }
 }
/*
Hello from A num :=  50

Hello from B num :=  80
*/
