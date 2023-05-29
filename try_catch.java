class try_catch 
{ 
public static void main(String [] args) 
{ 
 int a=10,b=5,c=5; 
 int x,y; 
 try 
 { 
 x= a / (b-c); 
 System.out.println ("This is Not Printed"); 
 }
catch (ArithmeticException e) 
 { 
 System.out.println (e); 
 System.out.println ("Division by Zero."); 
 } 
 y = a / (b+c); 
 System.out.println ("y: "+y); 
} 
}