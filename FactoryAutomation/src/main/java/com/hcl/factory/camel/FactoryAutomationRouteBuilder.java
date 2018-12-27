package com.hcl.factory.camel;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FactoryAutomationRouteBuilder extends RouteBuilder {
	public static Logger logger = LoggerFactory.getLogger(FactoryAutomationRouteBuilder.class);
	
	@Override
	public void configure() throws Exception {
		from("file://C:/AGangadhar/input?noop=true")	//&delay=1000&preMove=staging&move=.completed
		//.to("file://C:/AGangadhar/HCL/PROJECTS_ONLINE/APPLE/OneDrive_1_12-20-2018/logs/output")        
		.process(new FileProcessor());
	}

}
