//import java.util.Scanner;
class fibo
{
public static void main(String args[])
{
//Scanner sc=new Scanner(System.in);
int fibo[]=new int[10];
int i,n;
for(i=0;i<10;i++)
{
if(n==1)
{
System.out.printl(fibo[0]);
}

else if (n==2)
{
System.out.println(fibo[1]);
}
else
{
System.out.println(fibo(n-1)+fibo(n-2));
}
}
}
}




