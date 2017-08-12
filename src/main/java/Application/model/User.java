package Application.model;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

/**
 * Created by aliriano on 7/22/17.
 */
public class User {

    private String userID;

    @NotNull
    private String username;

    @NotNull
    private String password;

    private String email;

    private MultipartFile avatar;

    public User(){
        //No user..
    }

    public User(String userID, String username, String password, String email, MultipartFile avatar){
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.avatar = avatar;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }
}
