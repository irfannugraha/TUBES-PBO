package tubes_KustomMotor;

public class motor {
    private String nama;
    private String merk;
    private Engine engine;
    private Tires tires;
    private Body body;

    public motor(String nama, String merk) {
        this.nama = nama;
        this.merk = merk;
    }
    
    public void CreateEngine(int cc, String merk, int cylinder, String warna, String tipe){
        engine = new Engine(cc, merk, cylinder, warna, tipe);        
    }
    
    public void CreateBody(String Merk, int Tangki, String Headlamp, int Seat, String warna, String tipe){
        body = new Body(Merk, Tangki, Headlamp, Seat, warna, tipe);
    }
    
    public void CreateTires(String Velg, String Type, int diameter, int lebar, String warna, String tipe){
        tires = new Tires(Velg, Type, diameter, lebar, warna, tipe);
    }

    public String getNama() {
        return nama;
    }

    public String getMerk() {
        return merk;
    }
    
    
}