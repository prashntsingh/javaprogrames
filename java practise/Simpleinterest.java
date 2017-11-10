import java.util.Scanner;
class Simpleinterest
{
    float p;
	float r;
	float t;
	float si;
	String a;
	Scanner scan=new Scanner(System.in);
	public void acceptInput()
	{
		System.out.println("enter the value of principle");
		p=scan.nextFloat();
		System.out.println("enter the value of r");
		r=scan.nextFloat();
		System.out.println("enter the value of time");
		t=scan.nextFloat();
		System.out.println("enter the value of abcd");
		a=scan.nextLine();

	}

	public void calculate()
	{
		si=(p/r*t)/100;
	}
	public void display()
	{
		System.out.println("the value of simple interest is :"+si);
	}




	public static void main(String[] args) 
	{
		Simpleinterest s1=new Simpleinterest();
		Simpleinterest s2=new Simpleinterest();
		s1.acceptInput();
		s1.calculate();
		s1.display();
		s2.acceptInput();
		s2.calculate();
		s2.display();



	}
}
