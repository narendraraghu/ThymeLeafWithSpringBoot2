package com.example.service;

import com.example.RegisterUser;

public interface RegistrationService {
    RegisterUser save(RegisterUser apiRequest);
    Iterable<RegisterUser> listAllUsers();
    RegisterUser getUserById(Integer id);
}
