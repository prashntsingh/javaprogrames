class Instancevariable

{
	
	
		int c;/* which comes under class*/

		public void addition()
		{
			int a=2;
			int b=3;
			c=a+b;

		System.out.println("the value is :" +c);
		}
		public void substraction()
		{
			int p=20;
			int q=30;
			c=q-p;
			System.out.println("the value is:" +c);
		}
		public void multiply()
		{
			int x=2;
			int y=3;
			c=x*y;
			System.out.println("the value is:" +c);
		}


public static void main(String[] args) 
	{
	 Instancevariable int1=new Instancevariable ();
	 int1.addition();
	 int1.substraction();
	 int1.multiply();
	
	}
}
