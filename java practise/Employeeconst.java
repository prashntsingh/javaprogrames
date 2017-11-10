class Parentconst/* here we are using super keyword for calling methid from parent class*/

{
	String name;
	Parentconst()
	{
		System.out.println("this is super class constructor");
	}
	Parentconst( String name)

	{
		this.name=name;
	}
}
public class Employeeconst extends Parentconst
 
{     int emplid;
       Employeeconst()
	{
		   super();
	}

	Employeeconst(String name,int emplid)
	{
		super(name);
		this.emplid=emplid;
		
	}
	public String getname()
	{
		return name;
	}
	public int getemplid()
	{
		return emplid;
	}

	
	




	public static void main(String[] args) 
	{
		Employeeconst e1=new Employeeconst();
		Employeeconst e2=new Employeeconst("prashant",3225247);
		System.out.println(e2.getname());
		System.out.println(e2.getemplid());
		

	}
}
