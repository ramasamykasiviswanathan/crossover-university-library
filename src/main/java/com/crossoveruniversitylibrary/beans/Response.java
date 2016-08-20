package com.crossoveruniversitylibrary.beans;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class Response implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 882363886640939295L;
	@JsonProperty("status")
	private AuthenticationStatus authenticationStatus;
	
	/**
	 * @return the authenticationStatus
	 */
	public AuthenticationStatus getAuthenticationStatus()
	{
		return authenticationStatus;
	}
	/**
	 * @param authenticationStatus the authenticationStatus to set
	 */
	public void setAuthenticationStatus(AuthenticationStatus authenticationStatus)
	{
		this.authenticationStatus = authenticationStatus;
	}
	
}
