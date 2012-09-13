package spring.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.hibernate.entity.StudentEntity;

@Component
public class StudentDao 
{
	@Autowired
	public SessionFactory SessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<StudentEntity> getAll()
	{
		return SessionFactory.getCurrentSession().createQuery("from student").list();
	}
}
