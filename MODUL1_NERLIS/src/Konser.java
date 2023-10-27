public class Konser {
    private String NamaBand;
    private int Tanggal;
    private String Lokasi;
    private int Harga;

    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    public void setNamaband(String NamaBand) {
        this.NamaBand = NamaBand;
    }

    public void setTanggal(int Tanggal) {
        this.Tanggal = Tanggal;
    }

    public void setLokasi(String Lokasi ) {
        this.Lokasi = Lokasi;
    }
    
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getNamaBand() {
        return NamaBand;
    }
    public int getTanggal() {
        return Tanggal;
    }
    public String getLokasi() {
        return Lokasi;
    }
    public int getHarga() {
        return Harga;
    }
}