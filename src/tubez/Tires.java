package tubez;

public class Tires implements Color {
    private String Velg;
    private String Type;
    private int diameter;
    private int lebar;
    private String warna;
    private String type;
    
    public Tires(String Velg, String Type, int diameter, int lebar) {
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
    
    public void setcolor(String color, String type){
        this.warna = color;
        this.type = type;
    }
    
    
}
