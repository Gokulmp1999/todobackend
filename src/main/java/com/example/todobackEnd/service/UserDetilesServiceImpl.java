package com.example.todobackEnd.service;

import com.example.todobackEnd.dto.UserDto;
import com.example.todobackEnd.entity.User;
import com.example.todobackEnd.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetilesServiceImpl implements UserDetilesService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDto userDto) {
        User user = new User(userDto.getId(), userDto.getUsername(), userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()));
        userRepo.save(user);
        return user.getUsername();

    }





//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user=new User();
//        user.setUsername(username);
//        user.setPassword("abc");
//        user.setId(1l);
//        return user;
//    }
}
