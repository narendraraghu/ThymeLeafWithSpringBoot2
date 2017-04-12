package service;

import com.example.RegisterUser;
import org.springframework.stereotype.Service;

public interface RegistrationService {
    RegisterUser save(RegisterUser apiRequest);
    Iterable<RegisterUser> listAllUsers();
    RegisterUser getUserById(Integer id);
}
