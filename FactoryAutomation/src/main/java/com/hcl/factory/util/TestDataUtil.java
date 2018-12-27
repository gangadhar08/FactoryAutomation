package com.hcl.factory.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestDataUtil {
	public static Logger logger = LoggerFactory.getLogger(TestDataUtil.class);
	
	public static Date getDate(String date,String format) {
		logger.info("Method getDate Entered::");
		Date dateReturn = null;
		if(date != null && !date.isEmpty()) {
			if(format != null && !format.isEmpty()) {
				DateFormat df= new SimpleDateFormat(format);
				try {
					dateReturn  = df.parse(date);
					logger.info("Method getDate Returning::"+dateReturn);
					return dateReturn;
				} catch (ParseException e) {
					logger.error("Exception Raised While Parsing::"+e.getCause());
				}				
			}			
		}
		logger.info("Method getDate Returning::"+dateReturn);
		return dateReturn;
	}
	
	public static String getDate(Date date, String format) {
		logger.info("Method getDate Entered::");
		String dateReturn = null;
		if(date != null) {
			if(format != null && !format.isEmpty()) {
				DateFormat df= new SimpleDateFormat(format);
				dateReturn = df.format(date);	
				logger.info("Method getDate Returning::"+dateReturn);
				return dateReturn;	
			}	
			dateReturn = date.toString();
			logger.info("Method getDate Returning::"+dateReturn);
			return dateReturn;
		}
		logger.info("Method getDate Returning::"+dateReturn);	
		return null;
	}
	
}
