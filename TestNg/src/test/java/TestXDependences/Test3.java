package TestXDependences;

public class Test3 
{
	@org.testng.annotations.Test(priority = 3)
	public void CreateShipment()
	{
		System.out.println("createShipment");
	}
	@org.testng.annotations.Test(dependsOnMethods = {"CreateShipment"},priority = 1)
	public void TrackShipment()
	{
		System.out.println("TrackShipment");
	}
	@org.testng.annotations.Test(dependsOnMethods = {"CreateShipment"},priority = 2)
	public void CancelShipment()
	{
		System.out.println("CancelShipment");
	}




}
