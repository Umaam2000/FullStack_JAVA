package com.ust.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.security.entity.MyUser;
@Repository
public interface UserRepository extends JpaRepository<MyUser, String>
{

}

