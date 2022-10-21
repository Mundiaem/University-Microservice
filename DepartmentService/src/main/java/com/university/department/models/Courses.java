package com.university.department.models;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Courses {
    @Id
    private Integer id;
    private String name;
    private String unit_code;


}
