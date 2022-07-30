package JavaInterviewCoding;

import org.testng.annotations.Test;

public class JavaCode9 {
	
	@Test
	public void test()
	{
		String str="Maven,Testng,Jenkin,Selenium";
		String str1="abc";
		String str2="pqr";
		String str3="xyz";
		
	    String str4=str1.concat(str2).concat(str3);
	    System.out.println(str4);
		String[] s1= str.split(",");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		}
}
