package edward.practice.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import edward.practice.spring.data.DataBean1;
import edward.practice.spring.data.a.DataBean2;

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

	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"configuration/spring/spring-main.xml");

		ExampleBean bean = context.getBean(ExampleBean.class);
		
		System.out.println(bean.bean2ByContructor.Name);
		System.out.println(bean.bean2ByPublicSetter.Name);
		System.out.println(bean.bean2ByAutowired.Name);
		System.out.println(bean.bean2ByPrivateSetter);
		
		DataBean1 b1 = context.getBean(DataBean1.class);
		System.out.println(b1);
		
		DataBean2 b2 = (DataBean2) context.getBean("DataBean2");
		System.out.println(b2);
	}

}
