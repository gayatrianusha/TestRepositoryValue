package JavaInterviewCoding;

import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class JavaCode10 {
	
	//String coding
	
	@Test
	public void test()
	{
		
		String str="Hello Welcome";
		String str2=" Hello W ";
		String str3= new String("Hello");
		
		Boolean b1= str.equals(str2);
		Boolean b2=str.equals(str3);
		
		System.out.println(b1);
		System.out.println(b2);
		

	if(str==str2)
	{
		System.out.println("Objects are equal");
	}
	else
	{
		System.out.println("Objects are not equal");
	}
	
	
	System.out.println(str.charAt(0));
	System.out.println(str.compareTo(str2));
	System.out.println(str.concat(str3).concat(str2));
	System.out.println(str.endsWith("llo"));
	System.out.println(str.replace('H','W'));
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	System.out.println(str2.trim());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

}
