package com.crossoveruniversitylibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crossoveruniversitylibrary.beans.LoginModel;

@Controller
@RequestMapping(value="/")
public class UniversityLibraryWebAppsController 
{
	@RequestMapping(method=RequestMethod.GET)
	public String loadSite(@ModelAttribute("loginBean") LoginModel loginModel)
	{
		return "login";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("loginBean") LoginModel loginModel)
	{
		return "main";
	}
}
