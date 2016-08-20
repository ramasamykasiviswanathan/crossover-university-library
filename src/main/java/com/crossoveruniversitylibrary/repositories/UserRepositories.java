package com.crossoveruniversitylibrary.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositories
{
	@Autowired
	MongoTemplate mongoTemplate;
	
	public List<User> findAllUsers()
	{
		return mongoTemplate.findAll(User.class);
	}
	
	public long authenticateUser(User user)
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("Username").is(user.getUserName()).and("Password").is(user.getPassword()));
		return mongoTemplate.count(query , User.class);
	}
}
