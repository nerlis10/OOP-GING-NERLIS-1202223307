class Kendaraan {
    private String nomorIdentifikasi;
    private double kecepatanMaksimum;
    private int kapasitasPenumpang;

    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang) {
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String toString() {
        return "Nomor Identifikasi: " + nomorIdentifikasi + "\nKecepatan Maksimum: " + kecepatanMaksimum +
                "\nKapasitas Penumpang: " + kapasitasPenumpang;
    }

    public double hitungWaktuTempuh(double jarak) {
        // Implementasi perhitungan waktu tempuh
        return jarak / kecepatanMaksimum;
    }
}