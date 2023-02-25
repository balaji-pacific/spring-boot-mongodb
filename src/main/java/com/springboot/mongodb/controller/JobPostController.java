/**
 * 
 */
package com.springboot.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongodb.model.Post;
import com.springboot.mongodb.repository.CustomSearchRepository;
import com.springboot.mongodb.repository.JobPostRepository;

/**
 * @author balajisoundarrajan
 *
 */
@RestController
public class JobPostController {
	
	
	@Autowired
	JobPostRepository jobPostRepository;
	
	@Autowired
	CustomSearchRepository customSearchRepository;

	@GetMapping("/findAllPost")
	public List<Post> getPosts(){
		return jobPostRepository.findAll();
		
	}
	
	@GetMapping("/filterSearch/{filter}")
	public List<Post> filterSearch(@PathVariable String filter){
		return customSearchRepository.searchProfile(filter);
	}
	
	

}
