/**
 * 
 */
package com.springboot.mongodb.repository;

import java.util.List;

import com.springboot.mongodb.model.Post;

/**
 * @author balajisoundarrajan
 *
 */
public interface CustomSearchRepository {

	List<Post> searchProfile(String filter);
}
