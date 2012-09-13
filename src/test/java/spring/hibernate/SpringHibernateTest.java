package spring.hibernate;

import java.util.List;

import junit.framework.Assert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import spring.hibernate.dao.StudentCourseDao;
import spring.hibernate.entity.StudentCourseEntity;

@Test(groups = { "spring.hibernate" })
public class SpringHibernateTest
{
	ApplicationContext context;

	@BeforeSuite
	public void initialize()
	{
		context = new FileSystemXmlApplicationContext(
				"configuration/spring/spring.hibernate.spring-main.xml");
	}

	public void testBean()
	{
		StudentCourseDao dao = context.getBean(StudentCourseDao.class);
		Assert.assertNotNull(dao);
		//Assert.assertNotNull(dao.SessionFactory);
	}

	public void testDao()
	{
		StudentCourseDao dao = context.getBean(StudentCourseDao.class);
		List<StudentCourseEntity> students = dao.getAll();
		System.out.println(students.size());
	}
}
