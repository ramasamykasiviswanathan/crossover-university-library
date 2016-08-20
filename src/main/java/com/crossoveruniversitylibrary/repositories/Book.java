package com.crossoveruniversitylibrary.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Book")
public class Book implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4391027896359009057L;
	@Id
	public String bookID;
	@Field(value="Title")
	public String title;
	@Field(value="Publisher")
	public String publisher;
	@Field(value="Description")
	public String description;
	@Field(value="Authors")
	public List<String> authors;
	/**
	 * @return the bookID
	 */
	public String getBookID()
	{
		return bookID;
	}
	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(String bookID)
	{
		this.bookID = bookID;
	}
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher()
	{
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	/**
	 * @return the authors
	 */
	public List<String> getAuthors()
	{
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(List<String> authors)
	{
		this.authors = authors;
	}
	
	
}
