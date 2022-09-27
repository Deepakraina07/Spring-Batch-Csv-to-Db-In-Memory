package com.samco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samco.model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer>{

}
