package Application.services;

import Application.model.User;
import Application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aliriano on 7/22/17.
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User getUserByUserName(String username){
        return userRepository.findUserByUsername(username);

    }
    public void addUser(User user){
        userRepository.addUser(user);
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
}
