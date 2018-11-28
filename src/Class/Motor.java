package Class;

public class Motor {
    private String id;
    private String nama;
    private String merk;
    private String jenis;
    
    private Engine engine;
    private Tires tires;
    private Body body;

    public Motor(String id, String nama, String merk, String jenis) {
        this.id = id;
        this.nama = nama;
        this.merk = merk;
        this.jenis = jenis;
    }
    
    public void CreateEngine(int cc, String knalpot, int cylinder){
        int i = 0;
        engine = new Engine("E"+(i+1), cc, knalpot, cylinder);
    }
    
    public void CreateBody(String Badan, int Tangki, String Headlamp, int Seat, String warna, String tipe){
        int i = 0;
        body = new Body("B"+(i+1), Badan, Tangki, Headlamp, Seat, warna);
    }
    
    public void CreateTires(String Velg, String Type, int diameter, int lebar, String warna, String tipe){
        int i = 0;
        tires = new Tires("T"+(i+1), Velg, Type, diameter, lebar, warna);
    }

    public String getIdMotor() {
        return id;
    }
    
    public String getNama() {
        return nama;
    }

    public String getMerk() {
        return merk;
    }
    
    public String getJenis() {
        return jenis;
    }
    
}