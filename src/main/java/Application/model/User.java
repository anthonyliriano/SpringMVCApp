package Application.model;

/**
 * Created by aliriano on 7/22/17.
 */
public class User {
    private String username;
    private String password;

    public User(){
        //No user..
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
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
}