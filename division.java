import java.util.Scanner;
class division
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n[]=new int[100];
int a,i;
System.out.println("enter the a number");
a=sc.nextInt();
System.out.println("enter the array");
for(i=0;i<a;i++)
{
	
n[i]=sc.nextInt();
}
System.out.println("the division by 2 and 3");

for(i=0;i<a;i++)
{
if(n[i]%2==0&& n[i]%3==0)
{
System.out.println(n[i]);
}
}
}
}
