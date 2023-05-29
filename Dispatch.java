class A 
{ 
void m1() 
{ 
System.out.println("Inside A's m1 method"); 
} 
} 
class B extends A 
{ 
// overriding m1() 
void m1() 
{ 
System.out.println("Inside B's m1 method"); 
} 
} 
class C extends A 
{ 
// overriding m1() 
void m1() 
{ 
System.out.println("Inside C's m1 method"); 
} 
} 
// Driver class 
class Dispatch 
{ 
public static void main(String args[]) 
{ 
A a = new A(); // object of type A 
B b = new B(); // object of type B 
C c = new C(); // object of type C
A ref; // obtain a reference of type A 
ref = a; // ref refers to an A object 
ref.m1(); // calling A's version of m1() 
ref = b; // now ref refers to a B object 
ref.m1(); // calling B's version of m1() 
ref = c; // now ref refers to a C object 
ref.m1(); // calling C's version of m1() 
} 
}
