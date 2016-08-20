package com.crossoveruniversitylibrary.controller;

import java.util.List;

import org.bson.json.JsonWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crossoveruniversitylibrary.beans.AuthenticationStatus;
import com.crossoveruniversitylibrary.beans.Response;
import com.crossoveruniversitylibrary.repositories.Book;
import com.crossoveruniversitylibrary.repositories.BookRepository;
import com.crossoveruniversitylibrary.repositories.User;
import com.crossoveruniversitylibrary.repositories.UserRepositories;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping(value="/REST")
public class UniversitySearchRestController
{
	@Autowired
	UserRepositories userRepository;
	@Autowired
	BookRepository bookRepository;
	@Autowired
	AuthenticationStatus status;
	
	@RequestMapping(value="/authenticate",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public AuthenticationStatus authenticateUser(@RequestBody User user)
	{
		if(userRepository.authenticateUser(user) ==1)
		{
			status.setStatus("success");
		}
		else
		{
			status.setStatus("failure");
		}
		return status;
	}
	
	@RequestMapping(value = "/getAllBooks", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAllBooks()
	{
		return bookRepository.findAllBooks();
	}
}
