package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	List<User> userlist = new ArrayList<User>();
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveUser(User user)
	{
		service.saveUser(user);
	}
	@RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	{
		public User findById(@PathVariable("id") long id)
		{
			return service.findById(id);
		}
		@RequestMapping(value = "/{username}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		{
			public ResponseEntity<User> findByName(@PathVariable("username") String username)
			{
				ResponseEntity<User> resEnt = new ResponseEntity<User>(service.findByName(username),HttpStatus.OK);
				return resEnt;
			}
			@RequestMapping(value="/" method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<List<User>> findAllUser()
			{
				ResponseEntity<List<User>> resEnt = new ResponseEntity<List<User>>(service.findAllUser(),HttpStatus.OK);
				return resEnt;
			}
			@RequestMapping(value="/" method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
			public void updateUser(long id,User user)
			{
				ResponseEntity<List<User>> resEnt = new ResponseEntity<List<User>>(service.findAllUser(),HttpStatus.OK);
				return resEnt;
			}
			
		}
	}
	
}
