class Overloading /*overloading means its an idea where one method perform different activities but with different parameters*/


{
public void addition()
	{
	int a=10;
	int b=20;
	System.out.println("the sum of two no is:"+(a+b));
	}

	public void addition (int a,int b)
	{
		System.out.println("sum is:"+(a+b));
	}
	public void addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}


	public static void main(String[] args) 
	{
      Overloading d=new Overloading();
	  d.addition();
	  d.addition(20,40);
	  d.addition(50,60,70);
	  


		
	}
}
