class area
{
  double r,a;
  double p=3.141;
  void setdata(double x)
   {
    r=x;
   }
  void display()
   {
    a=r*r*p;
	System.out.println("the area of circle="+a);
   }
  public static void main(String args[])
  {
   area e=new area();
   e.setdata(3);
   e.display();
  }
}
	
   