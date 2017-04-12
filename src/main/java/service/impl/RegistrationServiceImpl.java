package service.impl;

import com.example.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public RegisterUser save(RegisterUser registerUser) {
       return userRepository.save(registerUser);
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
