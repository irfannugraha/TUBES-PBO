package Class;

import Application.Application;
import Controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Driver{
    
    public static void main(String[] args) {
        Application a = new Application();
        Controller c = new Controller(a);
    }
}