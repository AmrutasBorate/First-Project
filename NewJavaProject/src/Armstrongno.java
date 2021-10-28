public class Armstrongno {
	public static void main(String[] args) 
	{
		int a=153;
		int b=a;
		int c=0;
		int sum;
		for (int i=0;i<3;i++) 
		{
			sum=0;
			sum=a%10;
			c=(sum*sum*sum)+c;
			a=a/10;		
		}
     if(c==b)     
     {
    	 System.out.println(b+ " is Amstrong number");
     }
     else 
     {
    	 System.out.println(b+ "is not Amstrong number");
     }
	}
}
