package com.blog.apis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.apis.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
