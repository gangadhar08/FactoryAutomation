package com.hcl.factory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class TestData {
	public static Logger logger = LoggerFactory.getLogger(TestData.class);
	@Id
	@Column(name="ID")
	@GenericGenerator(strategy="native",name="genericGenerator")
	private String id;
	
	@Column(name="KEY")
	private String key;
	@Column(name="VALUE")
	private String value;
	@Column(name="U_LIMIT")
	private String upperLimit;
	@Column(name="L_LIMIT")
	private String lowerLimit;
	@Column(name="TEST_DATE_TIME")
	private String dateTime;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(String upperLimit) {
		this.upperLimit = upperLimit;
	}
	public String getLowerLimit() {
		return lowerLimit;
	}
	public void setLowerLimit(String lowerLimit) {
		this.lowerLimit = lowerLimit;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
