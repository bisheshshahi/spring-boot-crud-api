package bishesh.crud_spring_boot_demo.controller;

import bishesh.crud_spring_boot_demo.entity.Student;
import bishesh.crud_spring_boot_demo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //create student
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){

        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);

    }

    //read one student
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student studentResp = studentService.getStudent(id);

        if(studentResp == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.ok(studentResp);
    }

    //read all student
    @GetMapping("getAll")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> studentList = studentService.getAllStudents();

        if(studentList.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentList);
    }

}
