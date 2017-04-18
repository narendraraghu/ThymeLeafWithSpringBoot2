package com.example.service.impl;

import com.example.RegisterUser;
import com.example.repository.UserRepository;
import com.example.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public RegisterUser save(RegisterUser registerUser) {
        System.out.print("registerUser  111" + registerUser.toString());
        System.out.print("userRepository  222" + userRepository.toString());
        userRepository.save(registerUser);
        return registerUser;
    }

    @Override
    public Iterable<RegisterUser> listAllUsers() {
        return null;
    }

    @Override
    public RegisterUser getUserById(Integer id) {
        return null;
    }
}
