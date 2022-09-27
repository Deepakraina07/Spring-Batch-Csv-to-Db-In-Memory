package com.samco.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.samco.model.UserDetails;

@Component
public class Processor implements ItemProcessor<UserDetails, UserDetails>{
	
	private static final Map<String, String> DEPARTMENT_NAME = new HashMap<>();

	@Override
	public UserDetails process(UserDetails item) throws Exception {
		return item;
	}
}
