package com.stackroute.userservice.repository;

import com.stackroute.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    //Spring boot automatically creates implmentation

    //List<User> findByName(String name);

    //@Query
   /* List<User> findByNameAndGender(String name, String gender);
    List<User> findByNameLike(String name);
    List<User> findByNameContains(String name);*/
}
