package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
    private Connection con = null;
    
//menyambungkan ke database
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
    
 //melakukan save data pada database
    //save data kedalam tabel ADMIN
    public void saveAdmin(Admin a ){
        String query = "insert into admin values ('"+ a.getUsername() +"', '" + a.getPassword() + "');";
        try {
            Statement s = con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save admin sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save admin gagal");
            System.out.println(query);
        }
    }        
    //save data kedalam tabel USER
    public void saveUser(User u){
        String query = "insert into user values ('"+ u.getUsername() + "', '" + u.getPassword() + "');";
        try {
            Statement s = con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save user sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save user gagal");
            System.out.println(query);
        }
    }
    //save data kedalam tabel RELASI KEPEMILIKAN
    public void saveKepemilikan(String u, String m, int e){
        String query = "insert into kepemilikan values ('"+ u + "', '" + m + "', '" + e + "');";
        try {
            Statement s = con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save kepemilikan sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save kepemilikan gagal");
            System.out.println(query);
        }
    }
    //save data kedalam tabel MOTOR
    public void saveMotor(Motor m, Engine e, Body b, Tires t){
        String query = "insert into motor values ( '" +m.getNama()+ "', '"+ m.getMerk() +"', '"+ m.getJenis() + "', '" + e.getIdEngine() + "', '" + b.getIdBody() + "', '" + t.getIdTires() + "');";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save motor sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save motor gagal");
            System.out.println(query);
        }
    }
    //save data kedalam tabel ENGINE
    public void saveEngine(Engine e ){
        String query = "insert into engine values ('"+ e.getIdEngine() +"','" + e.getCC() + "','" + e.getKnalpot() +"','"+ e.getCylinder() + "');";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save engine sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save engine gagal");
            System.out.println(query);
        }
    }   
    //save data kedalam tabel BODY
    public void saveBody(Body b ){
        String query = "insert into body values ('"+ b.getIdBody() +"', '" + b.getBadan() + "', '"+ b.getTangki() +"', '"+ b.getHeadlamp() +"', '" + b.getSeat() +"', '"+ b.getColor() + "');";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save body sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save body gagal");
            System.out.println(query);
        }
    }    
    //save data kedalam tabel TIRES
    public void saveTires(Tires t ){
        String query = "insert into tires values ('"+ t.getIdTires()+"', '" + t.getVelg() + "', '"+ t.getType() +"', '"+ t.getDiameter() +"', '" + t.getLebar() +"', '"+ t.getColor() + "');";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)save tires sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)save tires gagal");
            System.out.println(query);
        }
    }
    
//melakukan pengambilan data dari database
    //mengambil data USER berdasarkan USERNAME
    public User loadUserId (String username){
        String query = "select * from user where username = '" + username + "';";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Motor m = null;
            User u = null;
            while (rs.next()){
                String user = rs.getString(1);
                String pass = rs.getString(2);
                u = new User(user, pass);
            }
            return u;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal");
            System.out.println(query);
            return null;
        }
    }
    //mengambil data MOTOR berdasarkan NAMA MOTOR
    public Motor loadMotorId (String Id){
        try{
            Statement stmt = con.createStatement();
            String query = "select * from motor where nama = '" + Id + "';";
            ResultSet rs = stmt.executeQuery(query);
            
            Motor m = null;
            while (rs.next()){
                String nama = rs.getString(1);
                String merk = rs.getString(2);
                String jenis = rs.getString(3);
                int engine = rs.getInt(4);
                int body = rs.getInt(5);
                int tires = rs.getInt(6);
                m = new Motor(nama, merk, jenis);
                
                Engine e = loadEngineId(engine);
                m.CreateEngine(e.getIdEngine(), e.getCC(), e.getKnalpot(), e.getCylinder());
                
                Body b = loadBodyId(body);
                m.CreateBody(b.getIdBody(), b.getBadan(), b.getTangki(), b.getHeadlamp(), b.getSeat(), b.getColor());
                
                Tires t = loadTiresId(tires);
                m.CreateTires(t.getIdTires(), t.getVelg(), t.getType(), t.getDiameter(), t.getLebar(), t.getColor());
            }
            return m;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal");
            return null;
        }
    }
    //mengambil data ENGINE berdasarkan ID
    public Engine loadEngineId (int Id){
        String query = "select * from engine where id = '" + Id + "';";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Engine e = null;
            while (rs.next()){
                int id = rs.getInt(1);
                int cc = rs.getInt(2);
                String knalpot = rs.getString(3);
                int cylinder = rs.getInt(4);
                e = new Engine(id, cc, knalpot, cylinder);
            }
            return e;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal");
            return null;
        }
    }
    //mengambil data BODY berdasarkan ID
    public Body loadBodyId (int Id){
        try{
            Statement stmt = con.createStatement();
            String query = "select * from body where id = '" + Id + "';";
            ResultSet rs = stmt.executeQuery(query);
            
            Body b = null;
            while (rs.next()){
                int id = rs.getInt(1);
                String Badan = rs.getString(2);
                int Tangki = rs.getInt(3);
                String Headlamp = rs.getString(4);
                String Seat = rs.getString(5);
                String color = rs.getString(6);
                b = new Body(id, Badan, Tangki, Headlamp, Seat, color);
            }
            return b;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal");
            return null;
        }
    }
    //mengambil data TIRES berdasarkan ID
    public Tires loadTiresId (int Id){
        try{
            Statement stmt = con.createStatement();
            String query = "select * from tires where id = '" + Id + "';";
            ResultSet rs = stmt.executeQuery(query);
            
            Tires t = null;
            while (rs.next()){
                int id = rs.getInt(1);
                String Velg = rs.getString(2);
                String Type = rs.getString(3);
                int diameter = rs.getInt(4);
                int lebar = rs.getInt(5);
                String color = rs.getString(6);
                t = new Tires(id, Velg, Type, diameter, lebar, color);
            }
            return t;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal");
            return null;
        }
    }
    //mengambil list USERNAME dari tabel USER
    public ArrayList<String> loadUserList(){
        ArrayList<String> a = new ArrayList<>();
        String query = "select username from user;";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String nama = rs.getString("username");
                a.add(nama);
            }
            return a;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal");
            System.out.println(query);
            return null;
        }
    }
    //mengambil list NAMA MOTOR dari tabel MOTOR
    public ArrayList<String> loadMotorList (String username){
        ArrayList<String> a = new ArrayList<>();
        String query;
        if(username == null)
            query = "select nama from motor;";
        else
            query = "select distinct namaMotor from kepemilikan where username = '" + username + "';";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Motor m = null;
            while (rs.next()){
                String nama = rs.getString(1);
                a.add(nama);
            }
            return a;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal");
            System.out.println(query);
            return null;
        }
    }    
    
//Melakukan pembaruan pada data
    //memperbarui data ENGINE
    public void updateEngine( Engine e ){
        String query = "update engine set CC = '"+ e.getCC() + "', knalpot = '" + e.getKnalpot() +"', cylinder = '"+ e.getCylinder() + "' where id = '" + e.getIdEngine() + "';";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)update engine sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)update engine gagal");
            System.out.println(query);
        }
    }
    //memperbarui data BODY
    public void updateBody( Body b ){
        String query = "update body set badan = '"+ b.getBadan() + "', tangki = '" + b.getTangki() +"', headlamp = '" + b.getHeadlamp() + "', seat = '" + b.getSeat() + "', color = '" + b.getColor() + "' where id = '" + b.getIdBody() + "';";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)update engine sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)update engine gagal");
            System.out.println(query);
        }
    }   
    //memperbarui data TIRES
    public void updateTires( Tires t ){
        String query = "update tires set velg = '"+ t.getVelg() + "', tipe = '" + t.getType() +"', diameter = '" + t.getDiameter() + "', lebar = '" + t.getLebar() + "', color = '" + t.getColor() + "' where id = '" + t.getIdTires() + "';";
        try {
            Statement s= con.createStatement();
            s.execute(query);
            System.out.println("(!!!)update engine sukses");
        } catch (SQLException ex){
            System.out.println("(!!!)update engine gagal");
            System.out.println(query);
        }
    }
    
//memeriksa ketersediaan data
    //memeriksa data EDITABLE pada tabel RELASI kepemiliken
    public boolean CekKepemilikanEditable(String nama){
        String query = "select editable from kepemilikan where namaMotor = '" + nama + "';";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int n = 0;
            while (rs.next()){
                n = rs.getInt(1);
            }
            if(n == 0)
                return false;
            else
                return true;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal;");
            return false;
        }
    }
    //memeriksa USER yang memakai MOTOR dengan NAMA MOTOR tertentu
    public boolean CekKepemilikan(String nama){
        String query = "select count(namaMotor) from kepemilikan where namaMotor = '" + nama + "';";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int jml = 0;
            while (rs.next()){
                jml = rs.getInt(1);
            }
            if(jml > 1)
                return false;
            else
                return true;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal;");
            return false;
        }
    }    
    //memeriksa data USER atau ADMIN berdasarkan USERNAME
    public boolean CekPerson(String input, String username, String password){
        String query;
        if(password == null)
            query = "select * from "+ input +" where username = '" + username + "' ;";
        else
            query = "select * from "+ input +" where username = '" + username + "' and password = '" + password + "' ;";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String name = "";
            while (rs.next()){
                name = rs.getString(1);
            }
            if(name == "")
                return false;
            else
                return true;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal;");
            return false;
        }
    }
    //memeriksa data MOTOR berdasarkan NAMA MOTOR
    public boolean CekMotor(String nama){
        String query;
        query = "select nama from motor where nama = '" + nama + "' ;";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String name = "";
            while (rs.next()){
                name = rs.getString(1);
            }
            if(name == "")
                return true;
            else
                return false;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal;");
            return false;
        }
    }     
    
    //mendapatkan data id suatu KOMPONEN dari NAMA MOTOR
    public int getIdKomponen(String input, String nama){
        String query = "select id" + input + " from motor where nama = '" + nama + "' ;";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int id = 0;
            while (rs.next()){
                id = rs.getInt(1);
            }
            return id;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal");
            System.out.println(query);
            return 0;
        } 
    }
    //mendapatkan data id terakhir dari suatu KOMPONEN
    public int getLastId(String input){
        String query = "select max(id) from " + input + " ;";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int id = 0;
            while (rs.next()){
                id = rs.getInt(1);
            }
            if(id == 0)
                return 0;
            else
                return id;
        } catch (Exception e){
            System.out.println("(!!!)Load gagal");
            return 0;
        }    
    }
 
//menghapus data
    //menghapus data user
    public void deleteUser(User u){
        try{
            String query = "delete from user where username = '" + u.getUsername() + "';";
            Statement s = con.createStatement();
            s.executeUpdate(query);
            System.out.println("(!!!)delete user sukses");
        } catch (SQLException ex){
            System.out.print("(!!!)delete user gagal");
            ex.printStackTrace();
        }
    }
    //mengapus RELASI antara motor dan user melaui NAMA MOTOR
    public void deleteKepemilikanMotor(String m){
        String query = "delete from kepemilikan where namaMotor = '" + m + "'; ";
        try{
            Statement s = con.createStatement();
            s.execute(query);
            System.out.println("(!!!)delete motor sukses");
        } catch (SQLException ex){
            System.out.print("(!!!)delete motor gagal");
            System.out.print(query);
            ex.printStackTrace();
        }
    }
    //mengapus RELASI antara motor dan user melaui USERNAME
    public void deleteKepemilikanUser(String m){
        String query = "delete from kepemilikan where username = '" + m + "'; ";
        try{
            Statement s = con.createStatement();
            s.execute(query);
            System.out.println("(!!!)delete motor sukses");
        } catch (SQLException ex){
            System.out.print("(!!!)delete motor gagal");
            System.out.print(query);
            ex.printStackTrace();
        }
    }
    //mengapus RELASI antara motor dan user melaui NAMA MOTOR dan USERNAME
    public void deleteKepemilikanUserMotor(String u, String m){
        String query = "delete from kepemilikan where username = '" + u + "' and namaMotor = '" + m + "';";
        try{
            Statement s = con.createStatement();
            s.execute(query);
            System.out.println("(!!!)delete motor sukses");
        } catch (SQLException ex){
            System.out.print("(!!!)delete motor gagal");
            System.out.print(query);
            ex.printStackTrace();
        }
    }    
    //menghapus data MOTOR dan KOMPONENNYA
    public void deleteMotor(Motor m){
        String query = "delete from motor where nama = '" + m.getNama() + "'; ";
        try{
            Statement s = con.createStatement();
            s.execute(query);
            deleteKomponen( "engine", m.getEngine().getIdEngine() );
            deleteKomponen( "body", m.getBody().getIdBody() );
            deleteKomponen( "tires", m.getTires().getIdTires() );
            
            System.out.println("(!!!)delete motor sukses");
        } catch (SQLException ex){
            System.out.print("(!!!)delete motor gagal");
            System.out.print(query);
            ex.printStackTrace();
        }
    }    
    //menghapus data KOMPONEN
    public void deleteKomponen(String input, int i){
        String query = "delete from " + input + " where id = '" + i + "';";
        try{
            Statement s = con.createStatement();
            s.execute(query);
            System.out.println("(!!!)delete sukses");
        } catch (SQLException ex){
            System.out.print("(!!!)delete gagal");
            System.out.print(query);
            ex.printStackTrace();
        }
    }    
    
}