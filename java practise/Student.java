class Names 
{
	String firstname;
	String middlename;
	String lastname;

	public Names(String fname,String mname,String lname)
	{
		this.firstname=fname;
		this.middlename=mname;
		this.lastname=lname;
	}
	public String getfname()
	{
		return fname();
	}
	public String getmname()
	{
		return mname();
	}
	public String getlname();
	{
		return lname();
	}


}

	public class Student
	{
		int age;
		Names n;
		public int getage()
		{
			return age();
		}




	
	public static void main(String[] args) 
	{
		Student s=new Student();
		 Names n=new Names("prashant","singh","rajput");
         System.our.println((s.getage()));
		 System.out.println((n.getfname()));
		
	}
}
