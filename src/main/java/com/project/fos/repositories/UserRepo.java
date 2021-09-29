package com.project.fos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fos.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
