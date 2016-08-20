package com.crossoveruniversitylibrary.repositories;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="User")
public class User
{
	@Id
	private String dataId;
	@Field(value="Username")
	private String userName;
	@Field(value="Password")
	private String password;
	/**
	 * @return the dataId
	 */
	public String getDataId()
	{
		return dataId;
	}
	/**
	 * @param dataId the dataId to set
	 */
	public void setDataId(String dataId)
	{
		this.dataId = dataId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName()
	{
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	
}
