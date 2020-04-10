package com.joaozin.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.joaozin.workshopmongo.entities.User;
import com.joaozin.workshopmongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired 
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		User u = new User(null, "Maria Brown", "maria@gmail.com");
		User u1 = new User(null,"Alex Green","alex@gmail.com");
		User u2 = new User(null,"Bob Grey","bob@gmail.com");
		repository.saveAll(Arrays.asList(u,u1,u2));
	}

}
