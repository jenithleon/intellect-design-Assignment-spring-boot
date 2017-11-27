package com.intellect.task.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

import com.intellect.design.model.User;


@ContextConfiguration
@Service
public class UserService {
 
	static Map<String, User> users = new HashMap<>();

	
	public static String addUser(User user) throws Exception {
	    if(users.values().iterator().hasNext()){
        if(users.values().iterator().next().getEmail().matches(user.getEmail())) {
           throw new Exception("User already exists");
        }
	    }
		/*if(users.containsKey(user.getEmail())) {
			
            throw new Exception("Student already exists");
        }*/
        else {
            users.put(user.getId(), user);
            System.out.println("***********"+users);
        }
		
        
        String userid=user.getId();
        return userid;
    }
	
	public static void updateUser(User user) throws Exception {
        if(users.containsKey(user.getId())) {
        	if(user.getfName().isEmpty() && user.getlName().isEmpty() && user.getEmail().isEmpty()){
        		users.put(user.getId(), user);
        	}else {
            throw new Exception("User not found");
        }
    }
	}
	public void DeactivateUser(User user) throws Exception {
		
		//boolean isActive=false;
        if(users.containsKey(user.getId())) {
        	
              user.setActive(user.isActive());  
            users.put(user.getId(), user);
        }
        
        else {
            throw new Exception("User not found");
        }
    }
	
  
}
