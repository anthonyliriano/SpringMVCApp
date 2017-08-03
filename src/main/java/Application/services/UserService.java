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
        //All Users
        List<User> allUsers = getAllUsers();

        //Iterate over All users
        for (User user : allUsers){
            if(user.getUsername().equals(username))
                return user;
        }
        return null;
    }


    public User getUserById(String userId){
        //All Users
        List<User> allUsers = getAllUsers();

        for (User user : allUsers){
            if(user.getUserID().equals(userId))
                return user;
        }
        return null;
    }

    public void addUser(User user){
        userRepository.addUser(user);
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
}
