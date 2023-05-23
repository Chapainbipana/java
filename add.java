class add
{
  int a,b,c,sum;
  void setdata(int x,int y ,int z)
  {
    a=x;
    b=y;
    c=z;
   }
  void displays()
   {
     sum=a+b+c;
     System.out.println("the sum of three numbers ="+sum);
   }
  public static void main(String args[])
  {
    add a=new add();
    a.setdata(2,3,4);
	a.displays();
  }
}
