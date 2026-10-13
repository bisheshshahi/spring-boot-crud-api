package bishesh.crud_spring_boot_demo.service;

import bishesh.crud_spring_boot_demo.entity.Student;
import bishesh.crud_spring_boot_demo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){

        Student studentResp = studentRepository.save(studentReq);
        return studentResp;
    }
}
