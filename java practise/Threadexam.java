/*public class Threadexam extends Thread

{    public void run()
	{
	  System.out.println("thread is now running");
	}


	public static void main(String[] args) 
	{
		Threadexam t=new Threadexam();
		Threadexam t2=new Threadexam();
        t.start();
		t2.start();

	}
}
*/

public class Threadexam implements Runnable

{
	public void run()
	{
		System.out.println("heeelo i am running");
	}

	public static void main (String[]args)
	{
		Threadexam t=new Threadexam();
		Thread t1=new Thread(t);
		System.out.println(t1.getName());
		t1.setName("prashant");
		System.out.println(t1.getName());
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());

		t1.start();
	}

}