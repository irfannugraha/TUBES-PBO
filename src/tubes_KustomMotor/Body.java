package tubes_KustomMotor;

public class Body extends Color {
    private String Merk;
    private int Tangki;
    private String Headlamp;
    private int Seat;
    
    public Body(String Merk, int Tangki, String Headlamp, int Seat, String warna, String tipe) {
        super(warna, tipe);
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
    
    public String getcolor(){
        return warna;
    };
    
    public String gettipe(){
        return tipe;
    };
}
