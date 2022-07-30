/*Important Notes
 * TestNG
 * Priority---Default it takes 0 and negative values can be entered in Priority attribute eg:-199897897 (The least value takes the highest priority
 * Exclude and Include Group is present in the @Test Annotation, then exclude takes more priority,that @Test annotation wont execute
 * when same method is excluded and included then included method take priority
 * when parameter is given then need to execute from TestNG.xml only
 * invocationCount attribute---run the same method multiple times
 * timeOut
 * 2 ways to skip the test --enabled=false in @Test Annotation skip that test execution for that test/we can skip the test method through exclude the method in TestNG.xml
 * dependsOnMethods--attribute,depends on that method,after that method is executed then only this @Test will execute
 * In TestNG.xml, for example test1=@Test(dependsOnMethods="test2"), we include only test1 method, then error is thrown because test2 is not included(as it is dependent on test2)
 * In TestNG.xml, for example test1=@Test(dependsOnGroups="smoke"), we include only test1 method, then error is thrown because atleast one test method which contains smoke  is not included(as it is dependent on smoke group)
 * In above, if example smoke group methods are 8 displayed but if u include any one testmethod of smoke, then when we execute Testng.xml ,wont throw error
 * There are 3 tests which include smoke groups and one method is dependent on smoke group, after all 3 tests completed execution then only
 * dependent one should execute,now if one test fails for smoke group , then dependent test gets Skipped(without execution)
 * 
 *
 */

package TestNGPackage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(priority=-1)
	public void test1()
	{
		System.out.println("Priority -1");
	}
	@Test(priority=-2,groups= {"smoke"})
	public void test2()
	{
		Assert.assertTrue(false);
		System.out.println("Priority -2 and Group 2");
	}
	@Test()
	
	public void test9()
	{
		System.out.println("Priority -3");
		

	}
	@Test(priority=-1008299999,groups= {"smoke"},enabled=true)
	public void test8()
	{
		System.out.println("Priority -100 and Group 1");
	}
	
	@Test(dependsOnGroups= {"smoke"})
	public void grp()
	{
		System.out.println("AfterGroups executed");
		
	}
	
	@Test(priority=0)
	public void _test_()
	{
		System.out.println("Priority 0-test_");
	}
	
	@Test(priority=0)
	public void test$()
	{
		System.out.println("Priority 0-Test$");
	}
	
	@Test(priority=1)
	public void test5()
	{
		System.out.println("Priority 1");
	}
	
	@Test(priority=2)
	public void test6()
	{
		System.out.println("Priority 2");
	}
	@Test(priority=-1,dependsOnMethods="test6")
	public void test3()
	{
		System.out.println("depends on methods test");
		
	}
	
	
	
	
	
}
