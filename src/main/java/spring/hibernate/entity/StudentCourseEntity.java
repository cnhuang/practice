package spring.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_course")
public class StudentCourseEntity implements Serializable
{
	private static final long serialVersionUID = 7998804818656425409L;

	long id;
	int courseId;
	int studentId;

	@Id
	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public int getCourseId()
	{
		return courseId;
	}

	public void setCourseId(Integer courseId)
	{
		this.courseId = courseId;
	}

	public int getStudentId()
	{
		return studentId;
	}

	public void setStudentId(Integer studentId)
	{
		this.studentId = studentId;
	}
}
