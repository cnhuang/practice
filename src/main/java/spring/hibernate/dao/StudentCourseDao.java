package spring.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.hibernate.entity.StudentCourseEntity;

@Component
public class StudentCourseDao 
{
	@Autowired
	public SessionFactory SessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<StudentCourseEntity> getAll()
	{
		//System.out.println(SessionFactory.getCurrentSession());
		return SessionFactory.getCurrentSession().createQuery(" from StudentCourseEntity ").list();
	}
}
