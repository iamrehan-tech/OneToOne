package com.onetoone.services.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.onetoone.Main.User;
import com.onetoone.Main.Userprofile;
import com.onetoone.Repository.UserRepo;
import com.onetoone.Repository.UserprofileRepo;
import com.onetoone.services.Userprofileservices;
@Component
public class UserprofileImpl implements Userprofileservices {

	@Autowired
	 UserRepo userrepo;

	@Autowired
     UserprofileRepo userprofilerepo;
	
	
	@Override
	public User createUser(User usr) {
		// TODO Auto-generated method stub
		return  userrepo.save(usr);
		
	}

	@Override
	public  User updateUser(User usr) {
		// TODO Auto-generated method stub
		return userrepo.save(usr);
	    
	}

	@Override
	public List<User> getUser(Long usrId) {
		Optional<User> optionaluser =  userrepo.findById(usrId);
		if(optionaluser.isPresent()) {
			return (List<User>) optionaluser.get();
		}
		return null;
	}

	@Override
	public void deleteUser(Long usrId) {
		userprofilerepo.deleteById(usrId);
		 System.out.println("Successfull delete the data...");
	}

	@Override
	public List<User> getAllUser() {
		System.out.println("111111111");
		
		return userrepo.findAll();
	}

	@Override
	public List<Userprofile> getAllUserprofile() {
		
		return userprofilerepo.findAll();
	}

}
