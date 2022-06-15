package esprit.tn.soa.repository;

import java.util.ArrayList;
import java.util.List;

import esprit.tn.soa.entity.*;
public class StudentRepository {

	private final List<Student> students;

	public StudentRepository() {
		students = new ArrayList<>();
		
		students.add(new Student("123","test ben test","test@esprit.tn"));
		students.add(new Student("1234","Eskander jguirim","eskander@esprit.tn"));
	}
	
	public List<Student> getAllStudents(){
		return students;
	}
	
	
	public Student find(String cin){
		Student a= null;
		for( Student student: students){
			if(student.getCin().equals(cin))
			 a=student;
		}
		return a;
		
	}
	
	public void saveStudent(Student student){
		students.add(student);
	}


	
}
