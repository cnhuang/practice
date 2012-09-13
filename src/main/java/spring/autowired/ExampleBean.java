package spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class ExampleBean
{
	public ExampleBean2 bean2ByContructor;
	public ExampleBean2 bean2ByPublicSetter;
	public ExampleBean2 bean2ByPrivateSetter;

	@Autowired
	public ExampleBean2 bean2ByAutowired;

	public ExampleBean(ExampleBean2 bean2)
	{
		bean2ByContructor = bean2;
	}

	public void setPublicExampleBean2(ExampleBean2 bean2)
	{
		bean2ByPublicSetter = bean2;
	}

	public void setBean2ByAutowired(ExampleBean2 bean2)
	{
		bean2ByAutowired = bean2;
	}


}
