import impl.StudentDAOImpl;
import interfaces.StudentDAO;
import model.Student;

public class DAOPatternDemo {

	public static void main(String[] args) {
		StudentDAO student = new StudentDAOImpl();
		for (Student s : student.getAllStudents()){
			System.out.println("Id: " + s.getRollNo() + " Name: " + s.getName());
		}
		
		//update student
	      Student s =student.getAllStudents().get(0);
	      s.setName("Michael");
	      student.updateStudent(s);

	      //get the student
	      student.getStudent(0);
	      System.out.println("Student: [RollNo : " + s.getRollNo() + ", Name : " + s.getName() + " ]");	
		

	}

}
