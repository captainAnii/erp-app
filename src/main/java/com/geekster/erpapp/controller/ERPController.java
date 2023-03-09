package com.geekster.erpapp.controller;

import com.geekster.erpapp.DTO.StudentPercentageDTO;
import com.geekster.erpapp.model.Student;
import com.geekster.erpapp.service.ERPService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api/v1/erp-app")
public class ERPController {
    @Autowired
    private ERPService erpService;//Dependency Injection
    @GetMapping("/find-All-Students")
    public List<Student> findAllStudents(){
        return erpService.findAll();
    }
//    public ResponseEntity<List<Student>> findAllStudents(){ //Another method.....
//        return
//                new ResponseEntity<>(HttpStatus.OK).ok(erpService.findAll());
//    }
    @GetMapping("/find-student/roll/{roll}")
    public Student findStudentById(@PathVariable int roll){
        return erpService.findByrollno(roll);
    }

    @GetMapping("/topper")
    public Student findTopper(){
        return erpService.findTopper();
    }

    @GetMapping("/All-percentage")
    public List<StudentPercentageDTO> findPercentage(){
        List<StudentPercentageDTO> result = erpService.findAllPercentage();
        return result;
    }

}
