package interfaces;

import java.util.List;

import model.Student;

public interface StudentDAO {
	
	public List<Student> getAllStudents();
	public Student getStudent(int rollNo);
	void updateStudent(Student student);
	void deleteStudent(Student student);
}
