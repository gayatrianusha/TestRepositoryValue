package JavaInterviewCoding;

import org.testng.annotations.Test;

public class JavaCode7 {

	
	@Test
	public void test()
	{
		
		int a=5;
		int b=4;
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(" a and b is:"+a+":"+b+":");
		
	}
}
