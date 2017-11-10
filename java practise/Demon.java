class Calculator/* this is an example of inheritence*/ 
{

	public static void addition(int a ,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void substraction(int d, int e)
	{
		int f=d-e;
		System.out.println(f);
	}
}

	class Mycalculator extends Calculator
	{
		public static void multiplication(int q,int r)
		{
			int s=q*r;
			System.out.println(s);
		}

	
	}
	class Demon
	{
			public static void main(String[] args)
		{

		Mycalculator m1=new Mycalculator();
			m1.addition(10,20);
		m1.substraction(20,10);
		m1.multiplication(20,10);
	}
	
	}