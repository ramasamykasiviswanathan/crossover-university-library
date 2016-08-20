package com.crossoveruniversitylibrary.beans;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationStatus
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6666636719037329578L;
	private String status;
	private String errorMessage;
	/**
	 * @return the status
	 */
	public String getStatus()
	{
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status)
	{
		this.status = status;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage()
	{
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
}
