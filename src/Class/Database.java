package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
    private Connection con = null;
    
    public void connect(){
        try{
            String url = "jdbc:mysql://localhost/kostumisasi";
            String username = "root";
            String pass = "";
            con = DriverManager.getConnection(url, username, pass);
            System.out.println("(!!!)connected");
        } catch(SQLException ex){
            System.out.println("(!!!)connection error");
            ex.printStackTrace();
        }
    }

    public void saveAdmin(Admin a ){
        String query = "insert into User values ('"+ a.getUsername() +"', '" + a.getPassword() + "');";
        try {
            Statement s = con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save admin sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save admin gagal");
            System.out.println(query);
        }
    }        
    
    public void saveUser(User u, Motor m ){
        String query = "insert into User values ('"+ u.getUsername() + "', '" + u.getPassword() + "', '" + m.getIdMotor()+ "');";
        try {
            Statement s = con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save user sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save user gagal");
            System.out.println(query);
        }
    }
    
    public void saveMotor(Motor m, Tires t, Engine e, Body b ){
        String query = "insert into User values ('"+ m.getIdMotor() +"', '" +m.getNama()+ "', '"+ m.getJenis() +"', '"+m.getMerk()+ "', '" + t.getIdTires() + "', '" + b.getIdBody() + "', '" + e.getIdEngine() + "';";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save motor sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save motor gagal");
            System.out.println(query);
        }
    }
    
    public void saveEngine(Engine e ){
        String query = "insert into User values ('"+ e.getIdEngine() +"', '" + e.getKnalpot() + "', '"+ e.getCC() +"', '"+ e.getCylinder() + "';";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save motor sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save motor gagal");
            System.out.println(query);
        }
    }   
    
    public void saveBody(Body b ){
        String query = "insert into User values ('"+ b.getIdBody() +"', '" + b.getBadan() + "', '"+ b.getTangki() +"', '"+ b.getHeadlamp() +"', '" + b.getSeat() +"', '"+ b.getColor() + "';";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save body sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save body gagal");
            System.out.println(query);
        }
    }    
    
    public void saveTires(Tires t ){
        String query = "insert into User values ('"+ t.getIdTires()+"', '" + t.getVelg() + "', '"+ t.getType() +"', '"+ t.getDiameter() +"', '" + t.getLebar() +"', '"+ t.getColor() + "';";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save tires sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save tires gagal");
            System.out.println(query);
        }
    }
    
    public User loaUserId (String username){
        try{
            Statement stmt = con.createStatement();
            String query = "select * from User where Username = '" + username + "';";
            ResultSet rs = stmt.executeQuery(query);
            
            Motor m = null;
            User u = null;
            while (rs.next()){
                String user = rs.getString(2);
                String pass = rs.getString(3);
                u = new User(user, pass);
            }
            return u;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal");
            return null;
        }
    }
    
    /*public ArrayList<Book> loadallbook(){
        try{
            ArrayList<Book> l = new ArrayList();
            Statement stmt = con.createStatement();
            String query = "select * from book";
            ResultSet rs = stmt.executeQuery(query);
            Book b = null;
            while (rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                String title = rs.getString(2);
                String author = rs.getString(3);
                int year = Integer.parseInt(rs.getString(4));
                String genre = rs.getString(5);
                b = new Book(id, title, author, year, genre);
                l.add(b);
            }
            return l;
        }catch (Exception e){
            System.out.println("(!!!)error loading");
            return null;
        }
    }*/
    
    public void deleteUser(User u){
        try{
            String query = "delete from User where usernam = '" + u.getUsername() + "';";
            Statement s = con.createStatement();
            s.executeUpdate(query);
            System.out.println("(!!!)delete user sukses");
        } catch (SQLException ex){
            System.out.print("(!!!)delete user gagal");
            ex.printStackTrace();
        }
    }
}
