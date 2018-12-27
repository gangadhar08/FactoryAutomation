package com.hcl.factory.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.factory.constants.Constants;
import com.hcl.factory.model.TestData;
import com.hcl.factory.repository.TestRepository;
import com.hcl.factory.util.TestDataUtil;

public class FileParser {
	public static Logger logger = LoggerFactory.getLogger(FileParser.class);
	
	@Autowired
	public TestRepository repository;
	
	public void parse(File file) {		
		try {
			if(file != null && file.exists()) {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = "";
				String fileName = file.getName();
				
				while((line = reader.readLine()) != null) {
					if(!line.contains(Constants.FILE_HEADER_1) && !line.contains(Constants.FILE_HEADER_2) 
							&& !line.contains(Constants.FILE_HEADER_3) && !line.contains(Constants.FILE_HEADER_4)) {
						
						String [] fileDataArr = line.split(Constants.TEST_DATA_SPLITTER);
						
						String [] fileNameArr  = fileName.split(Constants.FILE_NAME_SPLITTER);
						
						TestData dataPojo = new TestData();
						dataPojo.setKey(fileDataArr[0]);
						dataPojo.setValue(fileDataArr[1]);
						dataPojo.setUpperLimit(fileDataArr[2]);
						dataPojo.setLowerLimit(fileDataArr[3]);
						Date dateTime = TestDataUtil.getDate(fileNameArr[1]+" "+fileNameArr[2], Constants.DATE_PATTERN);
						dataPojo.setDateTime(TestDataUtil.getDate(dateTime, Constants.DATE_STR_PATTERN));
						repository.saveAndFlush(dataPojo);						
					}					
				}				
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

	public static void main(String[] args) {

	}
}
