package tubes_KustomMotor;

public class Engine extends Color {
    private int cc;
    private String merk;
    private int cylinder;

    public Engine(int cc, String merk, int cylinder, String warna, String tipe) {
        super(warna, tipe);
        this.cc = cc;
        this.merk = merk;
        this.cylinder = cylinder;
    }
    
    public int getCc() {
        return cc;
    }

    public String getMerk() {
        return merk;
    }

    public int getCylinder() {
        return cylinder;
    }
    
    public String getcolor(){
        return warna;
    };
    
    public String gettipe(){
        return tipe;
    };    
}