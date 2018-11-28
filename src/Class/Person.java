package Class;

public class Person {
    private String username;
    private String password;
    
    public Person(String user, String pass) {
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
