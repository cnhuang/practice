package testng.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextLoader;

public class CustomContextLoader implements ContextLoader 
{

	public ApplicationContext loadContext(String... locations) throws Exception
	{
		final ApplicationContext context = new FileSystemXmlApplicationContext(locations);	
		return context;
	}

	public String[] processLocations(Class<?> arg0, String... locations)
	{
		return locations;
	}

}
