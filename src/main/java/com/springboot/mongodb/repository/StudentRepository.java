/**
 * 
 */
package com.springboot.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongodb.model.Student;

/**
 * @author balajisoundarrajan
 *
 */
public interface StudentRepository extends MongoRepository<Student, Integer> {

}
