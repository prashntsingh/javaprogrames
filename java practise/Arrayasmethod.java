 class Arrayasmethod 
{

public static void printarray(int []mylist)
	{
	for(int i=0;i<mylist.length;i++)
		{
		System.out.println(mylist[i]+"");
		}

   
	}
	public static void main(String[] args) 
	{
		printarray	(new int[]{1,2,3,4,5,6});

	}
}
