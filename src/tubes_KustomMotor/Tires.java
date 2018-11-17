package tubes_KustomMotor;

public class Tires extends Color {
    private String Velg;
    private String Type;
    private int diameter;
    private int lebar;
    
    public Tires(String Velg, String Type, int diameter, int lebar, String warna, String tipe) {
        super(warna, tipe);
        this.Velg = Velg;
        this.Type = Type;
        this.diameter = diameter;
        this.lebar = lebar;
    }

    public void setVelg(String Velg) {
        this.Velg = Velg;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public String getVelg() {
        return Velg;
    }

    public String getType() {
        return Type;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getLebar() {
        return lebar;
    }

    public String getcolor(){
        return warna;
    };
    
    public String gettipe(){
        return tipe;
    }; 
}
