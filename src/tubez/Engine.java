package tubez;

public class Engine implements Color {
    private int cc;
    private String merk;
    private int cylinder;
    private String warna;
    private String type;

    public Engine(int cc, String merk, int cylinder) {
        this.cc = cc;
        this.merk = merk;
        this.cylinder = cylinder;
    }

    public void setcolor(String color, String type){
        this.warna = color;
        this.type = type;
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
}