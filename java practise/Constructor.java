class Constructor 
{ 
	String name;
	String breed;
	int cost;

	public Constructor(String x,String y,int z)

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

	Class Launch{

	
	public static void main(String[] args) 
	{ 
		Constructor c=new Constructor("sandy","pomelian","5000");


		System.out.println(c.genName());
		
		System.out.println(c.getBreed());
		
		System.out.println(c.getcost());

	}
}
