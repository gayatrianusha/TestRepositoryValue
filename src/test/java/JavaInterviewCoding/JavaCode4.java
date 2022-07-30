package JavaInterviewCoding;

import org.testng.annotations.Test;

public class JavaCode4 {
	
	//Minimum Number
	
	@Test
	public void test()
	{
	
		int a[]= {2242,498,90,63};
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				
			}
			
			
		}
		
		System.out.println(min);
		
		
	}
	
	
	

}
