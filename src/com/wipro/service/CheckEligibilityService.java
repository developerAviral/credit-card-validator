package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.dao.CheckEligibilityDao;

@Service
public class CheckEligibilityService {
	
	@Autowired
	CheckEligibilityDao checkEligibilityDao;
	
	public String getPanCardScoreStatus(String panCard) {
		Double panCardScore = getPanCardScore(panCard);
		if(panCardScore == null) {
			return "invalid";
		}
		
		String scoreStatus = panCardScore >= 5 ?  "eligible" :  "not-eligible";
		return scoreStatus;
	}
	
	public Double getPanCardScore(String panCard) {
		return checkEligibilityDao.getPanCardScore(panCard);
	}

}
