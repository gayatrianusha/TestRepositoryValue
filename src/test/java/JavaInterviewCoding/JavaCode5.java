package JavaInterviewCoding;

import org.testng.annotations.Test;

public class JavaCode5 {
	
	//Prime
	
	@Test
	public void test() {
		
		int a=19;
		boolean flag=false;
		
		for(int i=2;i<a/2;i++)
		{
			
			if(a%2==0) {
				
				flag= true;
				
			}
		}
		
		if(flag)
		{
			
			System.out.println("Not a Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}
	}

}
