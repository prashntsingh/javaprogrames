import java.util.*;/*abstraction*/
  abstract class  Shapes

{float length;
	float area;
 abstract  void acceptinput();
	abstract void  compute();
	
	 void display()
	{
		System.out.println(area);
	}
}


   class Squre extends Shapes

{
	public  void acceptinput()
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of l");

           length=scan.nextFloat();
	}
	 void compute()
	{
      area=length*length;
	}
	}




    class Avi
    {
    

	public static void main(String[] args) 
	{
		Shapes ref;
      Squre s=new Squre();
	  s.acceptinput();
	  s.compute();
	  s.display();

	}
	}


		 

