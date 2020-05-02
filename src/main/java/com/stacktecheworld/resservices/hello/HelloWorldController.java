package com.stacktecheworld.resservices.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stacktecheworld.resservices.model.UserDetails;

//controller
@RestController
public class HelloWorldController {

	//@RequestMapping(method= RequestMethod.GET, path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloworld() {
	return"Hello World1";
}
	
	@GetMapping("/helloworld-bean")
	public UserDetails hellowWOrldBean() {
		//return user;
		return new UserDetails("Riddhi", "Thakur", "Pune");
	}
	
	@GetMapping("/allUser")
	public List<UserDetails> getAllUser(){
		
		
		List<UserDetails> ulist=new ArrayList<>();
		for(int i=1;i<11;i++) {
			UserDetails user=new UserDetails();
			 user.setFirstName("Riddhi :"+i);
			 user.setLastName("thakur :"+i);
			 user.setCity("Pune :"+i);//=UserDetails.builder().firstName("Riddhi").lastName("thakur").city("Pune").build();	
			ulist.add(user); 
		}
		return ulist;
		
	}
	
}
