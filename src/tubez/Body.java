package tubez;

public class Body implements Color {
    private String Merk;
    private int Tangki;
    private String Headlamp;
    private int Seat;
    private String warna;
    private String type;
    
    public Body (String Merk, int Tangki, String Headlamp, int Seat) {
        this.Merk = Merk;
        this.Tangki = Tangki;
        this.Headlamp = Headlamp;
        this.Seat = Seat;       
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public void setTangki(int Tangki) {
        this.Tangki = Tangki;
    }

    public void setHeadlamp(String Headlamp) {
        this.Headlamp = Headlamp;
    }

    public void setSeat(int Seat) {
        this.Seat = Seat;
    }

    public String getMerk() {
        return Merk;
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
    
    public void setcolor(String color, String type){
        this.warna = color;
        this.type = type;
    }
    
}
