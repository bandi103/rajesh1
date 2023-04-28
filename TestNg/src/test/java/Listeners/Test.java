package Listeners;

import static org.testng.Assert.assertEquals;

import java.nio.file.spi.FileSystemProvider;

public class Test
{
	@org.testng.annotations.Test
	public void LoginFacebook()
	{
		System.out.println("login facebook");
		assertEquals("pavan","rajesh");
	}
	@org.testng.annotations.Test
	public void LoginInsta()
	{
		System.out.println("Login Insta");
		assertEquals("rajesh","rajesh");
	}
	@org.testng.annotations.Test()
	public void LoginWhatsapp()
	{
		System.out.println("Login Whatsapp");
		assertEquals("rajesh","rajesh");
	}

}
