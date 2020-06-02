package com.example.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
	
		creatingUser("Gabriel Fernando manuel", "Fred@gamil.com");
	
	User user=userRepository.getOne(2L);
	System.out.println(user.getName());
	System.out.println(user.getName());
	System.out.println(user.getName());
	System.out.println(user.getName());
	System.out.println(user.getName());
	List<User> us=userRepository.findtodosUsers("Gabriel Fernando manuel");
	for (User user2 : us) {
		System.out.println(user2.getEmail());
	}
	}
	
	public void creatingUser(String name, String email) {
		User user=new User();
		user.setEmail("gabrielfernad92@gmail.com");
		user.setName("Gabriel Fernando manuel");
		userRepository.save(user);
	} 

}
