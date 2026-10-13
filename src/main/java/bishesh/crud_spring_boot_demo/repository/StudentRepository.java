package bishesh.crud_spring_boot_demo.repository;

import bishesh.crud_spring_boot_demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
//which repository(student)
// handling type of
// primary key {

//changed class to interface because in class we have to enter query manually

}
