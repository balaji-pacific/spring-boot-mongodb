/**
 * 
 */
package com.springboot.mongodb.repository.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.springboot.mongodb.model.Post;
import com.springboot.mongodb.repository.CustomSearchRepository;

/**
 * @author balajisoundarrajan
 *
 */
@Component
public class CustomSearchRepositoryImpl implements CustomSearchRepository{
	
	@Autowired
	MongoClient mongoClient;
	
	@Autowired
	MongoConverter converter;
	
	

	@Override
	public List<Post> searchProfile(String filter) {
		
		List<Post> filterResults = new ArrayList<Post>(); 
		
		MongoDatabase database = mongoClient.getDatabase("Balaji");
		MongoCollection<Document> collection = database.getCollection("JobPost");

		@SuppressWarnings("unchecked")
		AggregateIterable<Document> result =  collection.aggregate(Arrays.asList(new Document("$search", 
		    new Document("index", "default").append("text", 
		    new Document("query", filter).append("path", Arrays.asList("desc", "profile", "techs")))), 
		    new Document("$sort", 
		    new Document("exp", -1L)), 
		    new Document("$limit", 5L)));
		
		
		result.forEach(document -> filterResults.add(converter.read(Post.class, document)));
		return filterResults;
	}

}
