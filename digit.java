class digit
{
  int n;
  void setdata(int num)
  {
   n=num;
   }
   void display()
   {
    int sum=0,r;
	while(n!=0)
	 {
	  n=n/10;
	  r=n%10;
	  sum=sum+r;
	 }
	System.out.println("the digit number sum ="+sum);
   }
   public static void main(String args[])
    {
	digit d=new digit();
	d.setdata(123);
	d.display();
	}
}