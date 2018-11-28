package Class;

import GUI.*;

public class Driver{
        
    public static void main(String[] args) {
        
        //Application a = new Application();
        
        ViewMotorUser v = new ViewMotorUser();
        
        Database d = new Database();
        d.connect();

        
        
        System.out.println( d.loaUserId("Irfan") );
        
    }
}