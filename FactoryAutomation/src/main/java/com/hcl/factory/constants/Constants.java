package com.hcl.factory.constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {
	public static Logger logger = LoggerFactory.getLogger(Constants.class);
	
	public static final String DATE_PATTERN= "yyyyMMdd HHmmss";
	public static final String DATE_STR_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	public static final String FILE_HEADER_1 = "TEST";
	public static final String FILE_HEADER_2 = "VALUE";
	public static final String FILE_HEADER_3 = "U_LIMIT";
	public static final String FILE_HEADER_4 = "L_LIMIT";
	public static final String FILE_NAME_SPLITTER = "_";
	
	public static final String TEST_DATA_SPLITTER = ",";
	
	public static final String REQ_TEST_DATA_FILTER1 = "m1";
	public static final String RES_TEST_DATA_FILTER1 = "MEASUREMENT_1";

}
