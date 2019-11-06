package com.wipro.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.wipro.entity.PanCardEntity;

@Repository
public class CheckEligibilityDaoImpl extends AbstractDao implements CheckEligibilityDao{

	@Override
	public void saveEmployee(PanCardEntity panCardEnity) {
		persist(panCardEnity);
	}

	@Override
	public PanCardEntity getScore(String panCardNumber) {
		 Criteria criteria = getSession().createCriteria(PanCardEntity.class);
	        criteria.add(Restrictions.eq("panCardNumber",panCardNumber));
	        return (PanCardEntity) criteria.uniqueResult();
	}

}
