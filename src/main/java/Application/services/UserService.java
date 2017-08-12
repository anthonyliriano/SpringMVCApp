package Application.services;

import Application.model.User;
import Application.repository.UserRepository;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public void addUser(User user) throws IOException{

       String imageBaseName = "." + FilenameUtils.getExtension(user.getAvatar().getOriginalFilename());

        //Write the Multipart file to profile_pictures
        Path path = Paths.get(System.getProperty("user.home"),user.getUserID() + imageBaseName);
        Files.write(path, user.getAvatar().getBytes());

        userRepository.addUser(user);
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
}
