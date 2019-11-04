package com.wipro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.service.CheckEligibilityService;

@Controller
public class CheckEligibilityController {

	@Autowired
	CheckEligibilityService checkEligibilityService;
	
	@RequestMapping(value="/checkCardScore", method = RequestMethod.POST)
	public String getResult(@RequestParam("panNo") String panNumber) {
		String upperCasePan = panNumber.toUpperCase();
		return checkEligibilityService.getPanCardScoreStatus(upperCasePan);
	}
}
