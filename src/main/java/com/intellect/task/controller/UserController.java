package com.intellect.task.controller;

import javax.ws.rs.core.MediaType;
import java.util.List;

import javax.validation.Valid;

import org.apache.cxf.jaxrs.ext.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.intellect.design.model.User;

import com.intellect.task.service.UserService;




@RestController
@RequestMapping("/intellect")
public class UserController {
	
	
	@Autowired
	 UserService userservice;

	
	@RequestMapping(value = "/user", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)

    public String addUser(@RequestBody User user) throws Exception {
		return UserService.addUser(user);
         
    }
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON)
 
    void updateUser(@PathVariable("id") int id, @RequestBody User user) throws Exception {
        user.setPinCode(user.getPinCode());
        user.setBirthDate(user.getBirthDate());
        UserService.updateUser(user);
    }
	

	
    

}
