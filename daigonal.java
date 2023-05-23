import java.util.Scanner;
class daigonal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num[][]=new int[100][100];
int i,j,m,n, sum=0;
System.out.println("enter a number");
m=sc.nextInt();
n=sc.nextInt();
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println("enter a number");
num[i][j]=sc.nextInt();
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(i>j)
{
sum=sum+num[i][j];
}

System.out.print(num[i][j]+" "); 
}
System.out.println();
}
System.out.println("the sum is "+ sum);
}
}