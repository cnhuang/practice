package edward.practice.testng.listener;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

@Test
public class ListenerTestCase
{
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}

	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}

	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}

	@Test(dataProvider = "ListenerDP")
	public void Test(Integer num1, Integer num2)
	{
		System.out.println(num1 / num2);
	}

	@DataProvider(name = "ListenerDP")
	public Object[][] createData1()
	{
		return new Object[][] { { 4, 2 }, { 4, 0 } };
	}

}
