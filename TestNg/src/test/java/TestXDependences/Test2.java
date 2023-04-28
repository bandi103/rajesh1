package TestXDependences;

public class Test2 
{
	@org.testng.annotations.Test
	public void CreateShipment()
	{
		System.out.println("createShipment");
	}
	@org.testng.annotations.Test(dependsOnMethods = {"CreateShipment"})
	public void TrackShipment()
	{
		System.out.println("TrackShipment");
	}
	@org.testng.annotations.Test(dependsOnMethods = {"CreateShipment"})
	public void CancelShipment()
	{
		System.out.println("CancelShipment");
	}




}
