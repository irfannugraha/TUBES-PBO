package Class;

public class User extends Person {
    private Motor m;
    
    public User(String user, String pass){
        super(user, pass);
    }    
    
    public void addMotor(Motor m) {
        this.m = m;
    }    
}
