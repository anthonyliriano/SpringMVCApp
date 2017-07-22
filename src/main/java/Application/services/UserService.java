package Application.services;

import Application.model.User;
import Application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by aliriano on 7/22/17.
 */
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Boolean getUserByUserName(String username){
        return userRepository.findUserByUsername(username);

    }
}
