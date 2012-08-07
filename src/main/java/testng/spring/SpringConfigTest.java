package testng.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "configuration/spring/spring-main.xml" }, loader=CustomContextLoader.class )//
public class SpringConfigTest extends AbstractTestNGSpringContextTests
{
	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void testconfig()
	{
		Assert.assertNotNull(applicationContext);
	}

}
