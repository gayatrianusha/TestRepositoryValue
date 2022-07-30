package JavaInterviewCoding;

import org.testng.annotations.Test;

public class JavaCode6 {

	
	@Test
	public void star()
	{
		
		for(int i=0;i<4;i++)
		{
			for(int j=i+1;j<4;j--)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
	}
}
