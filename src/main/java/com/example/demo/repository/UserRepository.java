package com.example.demo.repository;

import com.example.demo.domain.NewUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//相当于mapper接口

@Repository
public interface UserRepository extends JpaRepository<NewUser,Long> {
    NewUser findByUserName(String userName);
    NewUser findByUserNameOrEmail(String username, String email);
}
