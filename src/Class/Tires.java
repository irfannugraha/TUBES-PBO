package Class;

public class Tires {
    private String id;
    private String Velg;
    private String Type;
    private int Diameter;
    private int Lebar;
    private String Color;
    
    public Tires(String id, String Velg, String Type, int diameter, int lebar, String color) {
        this.id = id;
        this.Velg = Velg;
        this.Type = Type;
        this.Diameter = diameter;
        this.Lebar = lebar;
        this.Color = color;
    }

    public String getIdTires() {
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
}