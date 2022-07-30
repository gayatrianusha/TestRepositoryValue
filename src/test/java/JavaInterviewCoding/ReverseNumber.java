package JavaInterviewCoding;

import org.testng.annotations.Test;

public class ReverseNumber {
	
	@Test
	public void test()
	{
		int n=768;
		int add;
		int rev=0;
		
		while(n>0)
		{
		   add=n%10;
			n=n/10;
			rev=rev*10+add;
		}
		
		System.out.println(rev);
		
			}

}
