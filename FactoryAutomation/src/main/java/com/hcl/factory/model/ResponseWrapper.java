package com.hcl.factory.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseWrapper {
	public static Logger logger = LoggerFactory.getLogger(ResponseWrapper.class);
	private String starttime;
	private String endtime;
	private List<String> datatimestamps;
	private List<String> data;
	
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public List<String> getDatatimestamps() {
		return datatimestamps;
	}
	public void setDatatimestamps(List<String> datatimestamps) {
		this.datatimestamps = datatimestamps;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}	
}
