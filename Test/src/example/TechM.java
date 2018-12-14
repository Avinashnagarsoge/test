package example;

public class TechM {
	
	public static void main(String args[]) {
		
		for (int i=1; i<=100; i++) {
			if (i%3==0 && i%5==0 )
			{
				/*System.out.println(i+ "   Divisible by 3 \n");
				if(i%5==0)*/
			    System.out.print(i+"   Divisible by 3 & 5\n");	
			}
		else if(i%5==0)
		{
		  System.out.print(i+"   Divisible by 5\n");			
		}
		else if(i%3==0)
		{
			System.out.println(i+"   Divisible by 3\n");
		}
		else
		{
			System.out.println(i);
		}
	
	}
}
}