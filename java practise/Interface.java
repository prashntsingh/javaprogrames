import java.util.*;/*interface is same as abstraction but here only abstract methods are present in child class and we use implement keyword here*/
interface  Calculator
{
	public void addition();
	public void substraction();

}

class Mycal implements Calculator

{
	public void addition()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1st no");
		int a=scan.nextInt();
      
		System.out.println("enter 2nd no");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	public void substraction()
	{
        Scanner scan=new Scanner(System.in);
		System.out.println("enter 1st no");
		int a=scan.nextInt();

		System.out.println("enter 2nd no");
		int b=scan.nextInt();
		int c=a-b;
		System.out.println(c);
       
	   }
}

class Interface
{


	public static void main(String[] args) 
	{
		Mycal m=new Mycal();
		m.addition();
		m.substraction();
		
	}
}
