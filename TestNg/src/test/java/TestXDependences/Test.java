package TestXDependences;

public class Test
{
	@org.testng.annotations.Test
	public void CreateShipment()
	{
		System.out.println(5/0);
	}
	@org.testng.annotations.Test(dependsOnMethods = {"CreateShipment"},alwaysRun = true)
	public void TrackShipment()
	{
		System.out.println("TrackShipment");
	}
	@org.testng.annotations.Test(dependsOnMethods = {"CreateShipment"},alwaysRun = true)
	public void CancelShipment()
	{
		System.out.println("CancelShipment");
	}



}
