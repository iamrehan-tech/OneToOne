package com.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.Main.Userprofile;

@Repository
public interface UserprofileRepo extends JpaRepository<Userprofile,Long> {

}
