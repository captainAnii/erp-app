package com.geekster.erpapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Data
public class Student {

    private  int rollNumber;
    private  String name;
    private List<Double> marks; //5 subjects
    private String city;
    private String gender;

}
