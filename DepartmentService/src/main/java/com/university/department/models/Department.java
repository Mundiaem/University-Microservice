package com.university.department.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
    private Integer id;
    private String name;



    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }
}
