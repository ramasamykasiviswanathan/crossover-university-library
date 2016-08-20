package com.crossoveruniversitylibrary.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository
{
	@Autowired
	MongoTemplate mongoTemplate;
	
	public List<Book> findAllBooks()
	{
		return mongoTemplate.findAll(Book.class);
	}
}
