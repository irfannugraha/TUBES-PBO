package Class;

public class Body {
    private String id;
    private String Badan;
    private int Tangki;
    private String Headlamp;
    private int Seat;
    private String Color;
    
    public Body(String id, String Badan, int Tangki, String Headlamp, int Seat, String color) {
        this.id = id;
        this.Badan = Badan;
        this.Tangki = Tangki;
        this.Headlamp = Headlamp;
        this.Seat = Seat;
        this.Color = color;
    }

    public String getIdBody() {
        return id;
    }
    
    public String getBadan() {
        return Badan;
    }

    public int getTangki() {
        return Tangki;
    }

    public String getHeadlamp() {
        return Headlamp;
    }

    public int getSeat() {
        return Seat;
    }

    public String getColor() {
        return Color;
    }
}
