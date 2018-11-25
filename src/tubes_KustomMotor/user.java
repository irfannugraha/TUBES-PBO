package tubes_KustomMotor;

public class user {
    private String username = "kustom";
    private String password = "123";
    
    public user(String user, String pass){
        username = user;
        password = pass;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}
