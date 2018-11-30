package Class;

import java.util.ArrayList;

public class Admin extends Person{
    
    public Admin(String user, String pass){
        super(user, pass);
    }
    
    public String toString(){
        return ("\nUsername : " + getUsername());
    }
}
