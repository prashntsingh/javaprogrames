class Overridding /*  in overridding methods are inheritted by thechild class from parent class but it is not used in same manner rather then it is modiied by child class*/ 

{
	public  void display()
	{
		System.out.println("he is my hero");
	}

}

  class Student extends Overridding
	{

	  public  void display()
		{
		  System.out.println(" madharvhod");
		}
	}

		 class Teacher extends Student
		{
			public  void display()
			{

			System.out.println("lund");
		}
		}

  class Test
  {
  

	public static void main(String[] args) 
	{
		Overridding o=new Overridding();
		o.display();
		Overridding s=new Student();
		s.display();
        Overridding m=new Teacher();
		m.display();

	}
}
