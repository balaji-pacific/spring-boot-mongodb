/**
 * 
 */
package com.springboot.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongodb.model.Post;

/**
 * @author balajisoundarrajan
 *
 */
public interface JobPostRepository extends MongoRepository<Post, Integer>{

}
