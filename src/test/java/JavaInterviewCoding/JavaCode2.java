package JavaInterviewCoding;

import org.testng.annotations.Test;

public class JavaCode2 {
	
	//Fibonacci Series 0 1 1 2 3 5 8
	
	@Test
	public void tes2()
	{
		
	int a=0;
	int b=1;
	int d;
	
	for(int i=0;i<10;i++)
		{
		d=a+b;
		System.out.println(d);
		a=b;
	    b=d;
	
	
	}
	}
}
