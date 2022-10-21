package com.university.department.repository;

import com.university.department.models.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface CourseRepository extends JpaRepository<Courses, Integer> {
}
