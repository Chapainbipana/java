import java.util.Scanner;
class array
{
public static void main (String args[])
{
	Scanner s=new Scanner(System.in);
int a[]=new int[30];
int i;
for(i=0;i<=29;i++)
{
	System.out.println("enter number");
	a[i]=s.nextInt();
}
for(i=0;i<=29;i++)
{
if(a[i]>=16 && a[i]<=47)
	System.out.println(a[i]);
}
}
}
