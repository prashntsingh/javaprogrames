class Constructor /*constructor are specialised setter whose name is same as of class name*/
{ 
	String name;
	String breed;
	int cost;

	public Constructor(String x,String y,int z)/*rhis is parametrized constuctor*/

	{
		name=x;
		breed=y;
		cost=z;
	}
	public String getName()
	{
		return name;
	
	}
	public String getBreed()
	{
		return breed;
	}
	public int getcost()
	{
		return cost;
		
	}
}


	class Launch{

	
	public static void main(String[] args) 
	{ 
		Constructor c=new Constructor("sandy","pomelian",5000);
		Constructor d=new Constructor("rocky","labradore",6000);


		System.out.println(c.getName());
		
		System.out.println(c.getBreed());
		
		System.out.println(c.getcost());
		System.out.println(d.getName());
		
		System.out.println(d.getBreed());
		
		System.out.println(d.getcost());


	}
}
