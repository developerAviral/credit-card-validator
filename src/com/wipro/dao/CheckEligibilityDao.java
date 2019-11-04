package com.wipro.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CheckEligibilityDao {
	
	public Double getPanCardScore(String panCard) {
		Map<String,Double> hm = new HashMap<String, Double>();
		hm.put("AXSSP1122H",3.10 );
		hm.put("APPSA3355P", 8.50);
		hm.put("APPXA2244X", 9.50);
		hm.put("AXVPS7766V", 1.50);
		hm.put("ASXPS2121S", 5.10);
		
		return hm.get(panCard);
	}

}
