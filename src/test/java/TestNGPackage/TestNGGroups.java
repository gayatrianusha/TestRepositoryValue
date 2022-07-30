package TestNGPackage;
import org.testng.annotations.Test;

public class TestNGGroups {

	
	@Test(enabled=true)
	public void test1() {
		
		System.out.println("enabled");
	}
	
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("disabled");
	}
	
	@Test(timeOut=5000000)
	public void test3()
	{
		System.out.println("timeout");
	}
	
	@Test(invocationCount=6)
	public void test87()
	{
		System.out.println("multiple times");
	}
	
	
}
