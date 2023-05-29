class ThreadRunnable implements Runnable
{
ThreadRunnable()
{
Thread t=new Thread(this,"Demo");
System.out.println("Child Thread"+t);
t.start();
}
public void run()
{
try
{
for(int i=0;i<10;i++)
{
System.out.println("Value="+i);
Thread.sleep(10);
}
}
catch(InterruptedException e)
{
System.out.println("Interrupt occurs.");
}
}
}
class MainRunnable
{
public static void main(String args[])
{
ThreadRunnable r1=new ThreadRunnable();
ThreadRunnable r2=new ThreadRunnable();
}
}
