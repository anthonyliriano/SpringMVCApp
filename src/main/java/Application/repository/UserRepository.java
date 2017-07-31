package Application.repository;

import Application.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserRepository {
    private List<User> user = new ArrayList<>();

    public UserRepository(){
        user.add(new User("admin","password","test@test.com"));
        user.add(new User("moderator","password", "test@test.com"));
        user.add(new User("password","password", "test@test.com"));

    }

    public Boolean findUserByUsername(String username){
        return user.contains("admin");
    }

    public void addUser(User newUser){
        user.add(newUser);
    }
}
