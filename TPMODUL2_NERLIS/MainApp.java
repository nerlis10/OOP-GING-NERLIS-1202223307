public class MainApp {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("M1", 120.0, 5, 4);
        Bus bus = new Bus("B1", 80.0, 40, 30);

        System.out.println("Informasi Mobil:");
        System.out.println(mobil.toString());
        System.out.println("\nWaktu Tempuh dengan Mobil " + mobil.hitungWaktuTempuh(300));

        System.out.println("\nInformasi Bus:");
        System.out.println(bus.toString());
        System.out.println("\nWaktu Tempuh dengan Bus: " + bus.hitungWaktuTempuh(300));
    }
}