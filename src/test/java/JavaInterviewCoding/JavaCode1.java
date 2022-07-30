package JavaInterviewCoding;

import org.testng.annotations.Test;

public class JavaCode1 {
	
	/*1.ArraySum*/
	
	@Test
	public void mes()
	{
		int sum=0;
		int a[]= {1,3,5,40};
		
		for(int i=0;i<a.length;i++)
		{
			
			sum=sum+a[i];
			
		}
		
		System.out.println(sum);
		
	}

}
