package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.dao.CheckEligibilityDaoImpl;
import com.wipro.entity.PanCardEntity;

@Service
@Transactional
public class CheckEligibilityService {
	
	@Autowired
	CheckEligibilityDaoImpl checkEligibilityDao;
	
	public String getPanCardScoreStatus(String panCard) {
		PanCardEntity panCardEntity = getPanCardScore(panCard);
		if(panCardEntity == null) {
			return "invalid";
		}
		
		String scoreStatus = panCardEntity.getCreditScore() >= 5 ?  "eligible" :  "not-eligible";
		return scoreStatus;
	}
	
	public PanCardEntity getPanCardScore(String panCard) {
		return checkEligibilityDao.getScore(panCard);
	}

}
