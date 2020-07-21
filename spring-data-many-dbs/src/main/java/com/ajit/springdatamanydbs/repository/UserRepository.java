package com.ajit.springdatamanydbs.repository;

import org.springframework.data.repository.CrudRepository;

import com.ajit.springdatamanydbs.entity.user.User1;

public interface UserRepository extends CrudRepository<User1, Long> {

}
