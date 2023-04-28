package TestXDependences;

public class Test1 
{
	@org.testng.annotations.Test
	public void CreateShipment()
	{
		System.out.println(5/0);
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
