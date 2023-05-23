class even
{
  int n;
  void setdata(int x)
   {
     n=x;
   }
  void display()
  {
    if(n%2==0)
	{
	 System.out.println("even number is "+n);
	}
   else
   {
     System.out.println(" odd number is "+n);
   } 
  }
  public static void main(String args[])
  {
    even e=new even();
	e.setdata(3);
	e.display();
   }
}
	