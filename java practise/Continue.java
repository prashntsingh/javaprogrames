class Continue
{
	public static void main(String[] args) 
	{
		int x=20;
		for (x=0;x<20 ;x++ )
		{ 
			if(x==10 || x==11)
			{
				continue;
		}

		System.out.println("the no is:" +x);
		System.out.println("\n");
		}
	}
}
