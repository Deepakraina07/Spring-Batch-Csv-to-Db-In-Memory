package com.samco.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samco.model.UserDetails;
import com.samco.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<UserDetails>{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends UserDetails> user) throws Exception {
		System.out.println("Data saved for user: "+user);
		userRepository.saveAll(user);
	}
	
	

}
