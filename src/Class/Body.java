package Class;

public class Body {
    private int id;
    private String Badan;
    private int Tangki;
    private String Headlamp;
    private String Seat;
    private String Color;
    
    public Body(int id, String Badan, int Tangki, String Headlamp, String Seat, String color) {
        this.id = id;
        this.Badan = Badan;
        this.Tangki = Tangki;
        this.Headlamp = Headlamp;
        this.Seat = Seat;
        this.Color = color;
    }

    public int getIdBody() {
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

    public String getSeat() {
        return Seat;
    }

    public String getColor() {
        return Color;
    }
    
    public String toString(){
        return ( "\nBadan : " + getBadan() + "\nWarna Badan : " + getColor() + "\nTangki : " + getTangki() + "\nHeadlamp : " + getHeadlamp() + "\nSeat : " + getSeat() );
    }
}
