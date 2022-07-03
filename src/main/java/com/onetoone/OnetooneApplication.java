package com.onetoone;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onetoone.Main.Gender;
import com.onetoone.Main.User;
import com.onetoone.Main.Userprofile;
import com.onetoone.Repository.UserRepo;
import com.onetoone.Repository.UserprofileRepo;

@SpringBootApplication
public class OnetooneApplication{


	public static void main(String[] args) {
		SpringApplication.run(OnetooneApplication.class, args);
	}

}
