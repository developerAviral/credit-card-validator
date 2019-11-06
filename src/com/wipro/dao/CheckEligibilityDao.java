package com.wipro.dao;

import com.wipro.entity.PanCardEntity;

public interface CheckEligibilityDao {
	    
	void saveEmployee(PanCardEntity panCardEnity);
	   
	PanCardEntity getScore(String panCardNumber);
}
