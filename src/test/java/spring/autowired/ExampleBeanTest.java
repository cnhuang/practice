package spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.Test;

import spring.autowired.data.DataBean1;
import spring.autowired.data.a.DataBean2;

@Test
public class ExampleBeanTest
{
	public void TestMethod()
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"configuration/spring/spring.autowired.spring-main.xml");

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
