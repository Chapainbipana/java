public class ClassA 
{
 public void dispA()
 {
 System.out.println("This is method of ClassA");
 }
}
public class ClassB extends ClassA 
{
 public void dispB()
 {
 System.out.println("This is method of ClassB");
 }
 public static void main(String args[])
 {
 ClassB b = new ClassB();
 b.dispA();
 b.dispB();
 }
}
