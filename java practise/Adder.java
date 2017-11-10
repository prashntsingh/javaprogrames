class Arithmatic 
{
	
	public int add(int a,int b)
	{
		return(a+b);
	}
	
}
	class Adder extends Arithmatic
	{
		 String name="Arithmatic";
		 public void display()
		{

		System.out.println("My super class is:" + name);
		

	}
	
		

public static void main(String[] args) 
	{
		Adder d=new Adder();
		System.out.println(d.add(40,50));
		
		d.display();
	}
}
