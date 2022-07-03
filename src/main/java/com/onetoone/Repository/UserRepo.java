package com.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.Main.User;


@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}
