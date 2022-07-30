package JavaInterviewCoding;

import org.testng.annotations.Test;

public class JavaCode3 {
	
	//Maximum Number in Array
	@Test
	public void test3()
	{
		
		int a[]= {1,3,6798,33};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		
		System.out.println(max);
	}

}
