package com.ltp.gradesubmission.repository;

import com.ltp.gradesubmission.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}