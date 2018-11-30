package Class;

public class Motor {
    private String nama;
    private String merk;
    private String jenis;
    
    private Engine engine;
    private Tires tires;
    private Body body;

    public Motor(String nama, String merk, String jenis) {
        this.nama = nama;
        this.merk = merk;
        this.jenis = jenis;
    }
    
    public void CreateEngine(int id, int cc, String knalpot, int cylinder){
        engine = new Engine( id, cc, knalpot, cylinder);
    }
    
    public void CreateBody(int id, String Badan, int Tangki, String Headlamp, String Seat, String warna){
        body = new Body( id, Badan, Tangki, Headlamp, Seat, warna);
    }
    
    public void CreateTires(int id, String Velg, String Type, int diameter, int lebar, String warna){
        tires = new Tires(id, Velg, Type, diameter, lebar, warna);
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

    public Engine getEngine() {
        return engine;
    }

    public Tires getTires() {
        return tires;
    }

    public Body getBody() {
        return body;
    }
    
    public String toString(){
        return ( "Nama : " + getNama() + "\nMerk : " + getMerk() + "\nJenis : " + getJenis() );
    }
    
    public String toStringKomponen(){
        return ("\nKomponen : \n\n>Engine : " + getEngine().toString() + "\n\n>Body : " + getBody().toString() + "\n\n>Roda : " + getTires().toString() );
    }
}