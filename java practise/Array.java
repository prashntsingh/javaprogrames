class Array 
{
	public static void main(String[] args) 
	{
      double [] mylist={1.2,2.3,4.5,6.5,3.2};

	

		System.out.println(mylist[0]);
        
		for(int i=0;i<mylist.length;i++){
		
			System.out.println(mylist[i] +" ");

		}
	
	
	


	
	  double total=0;
	  for(int i=0;i<mylist.length;i++){
		  total =  total +mylist[i];
	  }
	  System.out.println("total is :"+total);
	  
      double max=0;
	  for(int i=0;i<mylist.length;i++)
		{
		  if(max<mylist[i])
			{
			  max=mylist[i];

			}
		}
			System.out.println("max is :"+max);
		

    
	
	}
}
