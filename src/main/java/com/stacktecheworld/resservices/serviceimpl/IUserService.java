package com.stacktecheworld.resservices.serviceimpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacktecheworld.resservices.entities.User;
@Repository
public interface IUserService extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
