import java.util.ArrayList;

public class Main {
    private ArrayList<Kendaraan> daftarKendaraan;
    private ArrayList<Penyewaan> daftarPenyewaan;

    public Main() {
        daftarKendaraan = new ArrayList<>();
        daftarPenyewaan = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan k) {
        daftarKendaraan.add(k);
        System.out.println("Sukses tambah: " + k.getMerk() + " " + k.getModel());
    }

    public void sewaKendaraan(String merk, String model, String namaPenyewa) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getMerk().equalsIgnoreCase(merk) && k.getModel().equalsIgnoreCase(model)) {
                if (k.isTersedia()) {
                    k.sewa(); 
                    Penyewaan sewaBaru = new Penyewaan(namaPenyewa, k);
                    daftarPenyewaan.add(sewaBaru); 
                    System.out.println("✅ " + namaPenyewa + " berhasil menyewa " + k.getMerk() + " " + k.getModel());
                    return;
                } else {
                    System.out.println("❌ Maaf, " + k.getMerk() + " " + k.getModel() + " sedang disewa.");
                    return;
                }
            }
        }
        System.out.println("⚠️ Kendaraan " + merk + " " + model + " tidak ditemukan.");
    }

    public void tampilkanKendaraanTersedia() {
        System.out.println("\n--- DAFTAR KENDARAAN TERSEDIA ---");
        int count = 0;
        for (Kendaraan k : daftarKendaraan) {
            if (k.isTersedia()) {
                System.out.println(k.getDetailInfo());
                System.out.println("---------------------------------");
                count++;
            }
        }
        if (count == 0) System.out.println("Tidak ada kendaraan yang tersedia.");
    }

    public void tampilkanDaftarPenyewa() {
        System.out.println("\n--- DAFTAR PENYEWA AKTIF ---");
        if (daftarPenyewaan.isEmpty()) {
            System.out.println("Belum ada penyewa aktif.");
            return;
        }
        
        for (Penyewaan p : daftarPenyewaan) {
            System.out.println("Penyewa: " + p.getNamaPenyewa() + " | Unit: " + p.getKendaraan().getMerk());
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        
        System.out.println("=== MEMULAI SISTEM ===");
        app.tambahKendaraan(new Mobil("Toyota", "Avanza", "2022", 4));
        app.tambahKendaraan(new Motor("Honda", "Vario", "2023", 2));
        app.tambahKendaraan(new Sepeda("Polygon", "Monarch", "2021", "Gunung"));

        app.tampilkanKendaraanTersedia();

        app.sewaKendaraan("Honda", "Vario", "Budi"); // Berhasil
        app.sewaKendaraan("Honda", "Vario", "Siti"); // Gagal (sedang disewa)

        app.tampilkanDaftarPenyewa();
        app.tampilkanKendaraanTersedia();
    }
}

