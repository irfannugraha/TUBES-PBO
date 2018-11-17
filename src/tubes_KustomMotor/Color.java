package tubes_KustomMotor;

public abstract class Color {
    
    String warna;
    String tipe;

    public Color(String warna, String tipe) {
        this.warna = warna;
        this.tipe = tipe;
    }
    
    public abstract String getcolor();
    public abstract String gettipe();
}
