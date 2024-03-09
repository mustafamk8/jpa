package com.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepo;
import com.jpa.dto.User;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(BootJpaApplication.class, args);
	
	UserRepo userRepo = context.getBean(UserRepo.class);
	
	
	
	
	// CRUD OPERATION
	// create object of user
	
//	User user1 = new User();
//	user1.setName("Swadeep");
//	user1.setCity("Indore");
//	user1.setStatus("I am CAT Student");
//	
//	User user2 = new User();
//	user2.setName("Deependra");
//	user2.setCity("Indore");
//	user2.setStatus("I am Python developer");
//	
//	
//	List<User> users = List.of(user1,user2);
//	Iterable<User> result = userRepo.saveAll(users);
//	
//	result.forEach(user->{
//		System.out.println(user);
//	});
	
	// Update  User table
	
//	Optional<User> optional = userRepo.findById(3);
//	User user = optional.get(); // this method will find the data
//	
//	user.setName("Sakshi Vora");
//	
//	User result =  userRepo.save(user);
//	System.out.println(result);
	
	// how to get the data
//	Iterable<User> itr =  userRepo.findAll();
//	itr.forEach(us->{
//		System.out.println(us);
//	});
	
	
	// delete
	
//	userRepo.deleteById(2);
//	// print all the data after deleting by id
//	Iterable<User> itr =  userRepo.findAll();
//	itr.forEach(us->{
//		System.out.println(us);
//	});
	
	// Usinf custome finder method

//		Iterable<User> itr =  userRepo.findByName("mustafa");
//		itr.forEach(us->{
//			System.out.println(us);
//		});
	
		// fet detail using JPQl
//		List<User> us = userRepo.getUserByName("mustafa");
//		us.forEach(e->{
//			System.out.println(e);
//		});
		
		// fegett detail using SQL NAtive Query
				List<User> us = userRepo.getAllUsers();
				us.forEach(e->{
					System.out.println(e);
				});

	
	
	
	
	
	}

}
