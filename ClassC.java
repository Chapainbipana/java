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
}
public class ClassC extends ClassB
{
 public void dispC()
 {
 System.out.println("This is method of ClassC");
 }
 public static void main(String args[])
 {
 ClassC c = new ClassC();
 c.dispA();
 c.dispB();
 c.dispC();
 }
}
