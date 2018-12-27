package com.hcl.factory.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestWrapper {
	public static Logger logger = LoggerFactory.getLogger(RequestWrapper.class);
	private String start;
	private String end;
	private String metricType;
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getMetricType() {
		return metricType;
	}
	public void setMetricType(String metricType) {
		this.metricType = metricType;
	}	
}
