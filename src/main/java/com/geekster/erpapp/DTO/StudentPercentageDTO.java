package com.geekster.erpapp.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentPercentageDTO {
    private int roll;
    private String name;
    private double percentage;

}
