package com.tate.Student;
import com.tate.Teacher.Teacher;
public class AddStudent {
	String name;
	String teacherName;

	public String getTeacher() {
		Teacher teacher =new Teacher("张老师","英语");
		return teacher.getName();
	}
	public void setTeacher(String teacher) {
		this.teacherName = teacher;
	}
	

}
