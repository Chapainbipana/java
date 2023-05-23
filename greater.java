class greater
{
  int a,b;
  void setdata(int x,int y)
   {
     a=x;
     b=y;
   }
  void display()
  {
    if(a>b)
	{
	System.out.println("the largest is "+a);
	}
	else
	{
	System.out.println("the largest is "+b);
	}
	}
  public static void main(String args[])
  {
   greater g=new greater();
   g.setdata(2,3);
   g.display();
  }
}
  