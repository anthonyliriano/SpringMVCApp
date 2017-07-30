package Application.repository;

import Application.model.User;
import java.util.List;

/**
 * Created by aliriano on 7/22/17.
 */
public class UserRepository {
    private List<User> user;

    public UserRepository(){
        user.add(new User("admin","password"));
        user.add(new User("moderator","password"));
        user.add(new User("password","password"));

    }

    public Boolean findUserByUsername(String username){
        return user.contains("admin");
    }
}
