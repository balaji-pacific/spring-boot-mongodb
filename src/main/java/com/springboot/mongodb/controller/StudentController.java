/**
 * 
 */
package com.springboot.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.ConfigTreePropertySource.Option;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongodb.model.Student;
import com.springboot.mongodb.repository.StudentRepository;

/**
 * @author balajisoundarrajan
 *
 */

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repository;
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		repository.save(student);
		return "Student with id " + student.getId() + " is inserted.";
	}
	
	
	@GetMapping("/findAllStudents")
	public List<Student> findAllStudents() {
		return repository.findAll();
	}
	
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		repository.deleteById(id);
		return "Deleted";
	}
	
	
	@GetMapping("/findStudent/{id}")
	public Optional<Student> findStudent(@PathVariable int id) {
		return repository.findById(id);
	}

}
