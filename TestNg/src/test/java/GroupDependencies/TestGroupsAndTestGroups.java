package GroupDependencies;

public class TestGroupsAndTestGroups
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
	

}
