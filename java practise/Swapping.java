class Swapping 
{

	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		System.out.println("the no before swapping were a:"+a +"b:"+b);
	

	swapFunction(a,b);
	}
	 public static void swapFunction(int n1,int n2)
	{
		 int n3=n1;
		 n1=n2;
		 n2=n3;

		System.out.println("the no after swapping :" +n1 + n2);
	}
}
