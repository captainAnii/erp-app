package com.geekster.erpapp.service;
import com.geekster.erpapp.DTO.StudentPercentageDTO;
import com.geekster.erpapp.model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ERPService {
    private static final List<Student> students = new ArrayList<>();
    private static int rollNum = 0;
    static{
        Student s1 = new Student(++rollNum, "Aniket", List.of(80.0,75.0,56.0,35.5,66.66), "Latur", "Male");
        students.add(s1);
        Student s2 = new Student(++rollNum, "Abhi", List.of(60.0,74.0,56.0,35.5,66.66), "Beed", "Male");
        students.add(s2);
        Student s3 = new Student(++rollNum, "Prakash", List.of(70.0,73.0,56.0,35.5,66.66), "Mumbai", "Male");
        students.add(s3);
        Student s4 = new Student(++rollNum, "Akash", List.of(50.0,72.0,56.0,35.5,66.66), "Pune", "Male");
        students.add(s4);
        Student s5 = new Student(++rollNum, "Sanjay", List.of(90.0,71.0,56.0,35.5,66.66), "Ausa", "Male");
        students.add(s5);


    }

    public List<Student> findAll(){
        return students;
    }


    public Student findByrollno(int roll) {
        for(Student student: students){
            if(student.getRollNumber()==roll){
                return student;
            }
        }return  null;
    }

    public Student findTopper() {
        //...
        return null;
    }

    public List<StudentPercentageDTO> findAllPercentage() {
        List<StudentPercentageDTO> percentages = new ArrayList<>();
        for(Student student : students){
            List<Double> marks = student.getMarks();
            double perc = 0.0;
            for(Double mark : marks){
                perc+=mark;
            }
            perc*=0.2;

            StudentPercentageDTO studentPercentageDTO = new StudentPercentageDTO(
                    student.getRollNumber(),student.getName(),perc);

            percentages.add(studentPercentageDTO);
        }
        return percentages;
    }
}
