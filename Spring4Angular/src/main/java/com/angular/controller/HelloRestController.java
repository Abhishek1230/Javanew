package com.angular.controller;

import java.util.List;

import com.angular.model.EndUser;

@RestController
public class HelloRestController 
{
	@Autowired
	UserService userService;
	
	//Retrieve Users
	@RequestMapping(value = "/Enduser/", method = RequestMethod.GET)
	public ResponseEntity<List<EndUser>> listAllUsers()
	{
		List<EndUser> users = userService.findAllUsers();
		if(users.isEmpty())
		{
			return new ResponseEntity<List<EndUser>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EndUser>>(users, HttpStatus.OK);
		}
	}

//Retrieve Single User
@RequestMapping(value = "/enduser/{id}", method = RequestMethod.GET,produces = )

}
