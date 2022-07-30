package JavaInterviewCoding;

import org.testng.annotations.Test;

public class ReverseString {

	
	@Test
	public void test()
	{
		String rev="";
		String original="Amma";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
			
		}
		
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(original))
		{
			System.out.println("it is Palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
	}
}
