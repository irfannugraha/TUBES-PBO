package Class;

public class Engine {
    private int id;
    private int CC;
    private String Knalpot;
    private int Cylinder;

    public Engine(int id, int cc, String knalpot, int cylinder) {
        this.id = id;
        this.CC = cc;
        this.Knalpot = knalpot;
        this.Cylinder = cylinder;
    }

    public int getIdEngine() {
        return id;
    }

    public int getCC() {
        return CC;
    }

    public String getKnalpot() {
        return Knalpot;
    }

    public int getCylinder() {
        return Cylinder;
    }  
    
    public String toString(){
        return ( "\nCC : " + getCC() + "\nKnalpot : " + getKnalpot() + "\nCylinder : " + getCylinder() );
    }
}