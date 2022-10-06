package com.api.Restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.Restapi.entity.User;
import com.api.Restapi.entity.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;    //Object created

	@GetMapping("/users")
	public List<User> getStudent(){
		List<User> userList = userRepository.findAll();
//		User s1=new User(1,"Sudheer ",23," Male","Puttaparthi");
//		User s2=new User(2,"Sampath ",22," Male", "Bangalore");
//		User s3=new User(3,"Supriya ",22," female", "Markapur");
//		User s4=new User(4,"Dadu ",23," male", "Mudigubba");
//		 
//		 
//		userList.add(s1);
//		userList.add(s2);
//		userList.add(s3);
//		userList.add(s4);

		// for loop userList


		System.out.println(userList);

		return userList;
	}


	@PostMapping("/users")
	public User createUser(@RequestBody User user) {


		User dbUser = userRepository.save(user);

		return dbUser;
	}


	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable("id") Long id) {

		User updateUserData = userRepository.getById(id);


		updateUserData.setName(user.getName());
		updateUserData.setAge(user.getAge());
		updateUserData.setGender(user.getGender());
		updateUserData.setCity(user.getCity());


		User dbUser = userRepository.save(user);

		return dbUser;
	}


	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable("id") Long id) {

		User dbUser = userRepository.getById(id);

		userRepository.delete(dbUser);

		return "User Deleted Successfully";
	}


}
