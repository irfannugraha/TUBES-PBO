package Class;

public class Tires {
    private int id;
    private String Velg;
    private String Type;
    private int Diameter;
    private int Lebar;
    private String Color;
    
    public Tires(int id, String Velg, String Type, int diameter, int lebar, String color) {
        this.id = id;
        this.Velg = Velg;
        this.Type = Type;
        this.Diameter = diameter;
        this.Lebar = lebar;
        this.Color = color;
    }

    public int getIdTires() {
        return id;
    }
    
    public String getVelg() {
        return Velg;
    }

    public String getType() {
        return Type;
    }

    public int getDiameter() {
        return Diameter;
    }

    public int getLebar() {
        return Lebar;
    }

    public String getColor() {
        return Color;
    }
    
    public String toString(){
        return ("\nVelg : " + getVelg() + "\nWarna Velg : " + getColor() + "\nTipe Ban : " + getType() + "\nDiameter : " + getDiameter() + "\nLebar : " + getLebar() );
    }
}