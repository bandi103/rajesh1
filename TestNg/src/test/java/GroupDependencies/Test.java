package GroupDependencies;

public class Test 
{
	@org.testng.annotations.Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("smoke");
	}
	@org.testng.annotations.Test(groups = {"sanity"})
	public void test2()
	{
		System.out.println("sanity");
	}
	@org.testng.annotations.Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("regression");
	}
	@org.testng.annotations.Test(groups = {"functional"})
	public void test4()
	{
		System.out.println("functional");
	}
	@org.testng.annotations.Test(dependsOnGroups = {"sanity","smoke"},alwaysRun = true)
	public void test0()
	{
		System.out.println("main method");
	}





}
