package Application.repository;

import Application.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Component
public class UserRepository {
    private List<User> user = new ArrayList<>();

    public UserRepository(){

        user.add(new User(
                UUID.randomUUID().toString(),
                "admin",
                "password",
                "test@test.com"));
        user.add(new User(
                UUID.randomUUID().toString(),
                "moderator",
                "password",
                "test@test.com"));
        user.add(new User(
                UUID.randomUUID().toString(),
                "user",
                "password",
                "test@test.com"));

    }

    public User findUserByUsername(String username){
        for (User user : user){
           if(user.getUsername().equals(username))
               return user;
        }
        return null;
    }

    public void addUser(User newUser){
        System.out.println("User added " + newUser.getUsername());
        user.add(newUser);
    }

    public List<User> getAllUsers(){
        return user;
    }
}
