package com.hcl.factory.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.factory.constants.Constants;
import com.hcl.factory.model.RequestWrapper;
import com.hcl.factory.model.ResponseWrapper;
import com.hcl.factory.model.TestData;
import com.hcl.factory.repository.TestRepository;

@Service
public class TestDataService {
	
	@Autowired
	public TestRepository repository;
	
	public ResponseWrapper getTestData(RequestWrapper requestBody) {
		ResponseWrapper resData = new ResponseWrapper();
		List<String> data = new ArrayList<>();
		List<String> dateTimeStamps = new ArrayList<>();
		List<TestData> dataAll = repository.findAll();
		
		for(TestData testData: dataAll) {
			if(requestBody.getMetricType().equalsIgnoreCase(Constants.REQ_TEST_DATA_FILTER1)) {
				if(testData.getKey().equalsIgnoreCase(Constants.RES_TEST_DATA_FILTER1)) {
					if(!data.contains(testData.getValue())) {
						data.add(testData.getValue());
					}
					if(!dateTimeStamps.contains(testData.getDateTime())) {
						data.add(testData.getDateTime());
					}					
				}
			}			
		}		
		resData.setData(data);
		resData.setDatatimestamps(dateTimeStamps);
		resData.setEndtime(requestBody.getEnd());
		resData.setStarttime(requestBody.getStart());
		
		return resData;
	}

	public static void main(String[] args) {

	}

}
