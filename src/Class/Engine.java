package Class;

public class Engine {
    private String id;
    private int CC;
    private String Knalpot;
    private int Cylinder;

    public Engine(String id, int cc, String knalpot, int cylinder) {
        this.id = id;
        this.CC = cc;
        this.Knalpot = knalpot;
        this.Cylinder = cylinder;
    }

    public String getIdEngine() {
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
}