package esprit.tn.soa.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.tn.soa.entity.Student;
import esprit.tn.soa.repository.StudentRepository;

public class Query implements GraphQLRootResolver{
	
	private final StudentRepository studentRepository;

	public Query(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.getAllStudents();
	}
	
	public Student find(String cin){
		return studentRepository.find(cin);
	}
	

}
