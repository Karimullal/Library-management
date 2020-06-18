package com.user.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.app.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
