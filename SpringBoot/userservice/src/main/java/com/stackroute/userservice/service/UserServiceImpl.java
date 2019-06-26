package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.exceptions.UserAlreadyExistsException;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.UnknownServiceException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

    @Override
    public User saveUser(User user) throws UserAlreadyExistsException {
        if(userRepository.existsById(user.getId()))
        {
            throw new UserAlreadyExistsException("User Already Exists!");
        }
        User saveUser=userRepository.save(user);
        if(saveUser==null)
        {
            throw new UserAlreadyExistsException("User Already Exists!");
        }
        return saveUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /*@Override
    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }
*/
}
