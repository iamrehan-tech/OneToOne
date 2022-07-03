package com.onetoone.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onetoone.Main.User;
import com.onetoone.Main.Userprofile;

@Service
public interface Userprofileservices {
	public User createUser(User usr);
	public User updateUser(User usr);
	public List<User> getUser(Long id);
	public void deleteUser(Long usrId);
	public List<User> getAllUser();
	
	
	public List<Userprofile> getAllUserprofile();
	
	
}
