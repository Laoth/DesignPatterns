package impl;

import java.util.ArrayList;
import java.util.List;

import interfaces.StudentDAO;
import model.Student;

public class StudentDAOImpl implements StudentDAO {
	
	List<Student> students;
	
	public StudentDAOImpl() {
		students = new ArrayList<Student>();
		Student s1 = new Student("Robert",0);
		Student s2 = new Student("John",1);
		students.add(s1);
		students.add(s2);
	}

	@Override
	public List getAllStudents() {
		return students;
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student);
		System.out.println("Student: Roll No: " + student.getRollNo() + ", deleted from database");
	}

	@Override
	public Student getStudent(int rollNo) {
		
		return students.get(rollNo);
	}


}
