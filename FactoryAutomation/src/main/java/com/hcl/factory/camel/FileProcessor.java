package com.hcl.factory.camel;

import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.factory.parser.FileParser;

public class FileProcessor implements Processor {
	public static Logger logger = LoggerFactory.getLogger(FileProcessor.class);
	
	@Autowired
	public FileParser fileParser;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		Message msg = exchange.getIn();
		File body = msg.getBody(File.class) ;
		if(body !=null) {
			fileParser.parse(body);		
		}		
	}

}
