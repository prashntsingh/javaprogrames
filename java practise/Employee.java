class Person

{
	String name="prashant";

} 

public  class Employee extends Person
{
	String name="gandu";
	 public void display()
	{
		 System.out.println("the name of super class emplyee is :" + super.name);
		 System.out.println("the name of sub class emplyee is:"+ name);


}





	public static void main(String[] args) 
	{
		Employee e1=new Employee();

		e1.display();
	}
}
