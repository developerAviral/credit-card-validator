package com.wipro.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class PanCardEntity {
	
	@Id
	private String panCardNumber;
	private Double creditScore;
	
	public String getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public Double getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(Double creditScore) {
		this.creditScore = creditScore;
	}

}
