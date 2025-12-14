//Class FRS
import java.util.ArrayList; 
import java.util.Scanner;

public class FRS {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("FB", "Fajar Baskoro");
        Dosen dosen2 = new Dosen("IS", "Irfan Subakti");

        ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();
        daftarMataKuliah.add(new MataKuliah("IF105", "Pemrograman Berorientasi Objek", 3, dosen1));
        daftarMataKuliah.add(new MataKuliah("IF002", "Struktur Data", 4, dosen1));
        daftarMataKuliah.add(new MataKuliah("IF309", "Pemrograman Web", 3, dosen2));
        
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Sistem Akademik Sederhana =====");
            System.out.println("1. Tambah Mahasiswa Baru");
            System.out.println("2. Ambil Mata Kuliah");
            System.out.println("3. Lihat FRS Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();


            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Mahasiswa Baru ---");
                    System.out.print("Masukkan NRP: ");
                    String nrp = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    
                    Mahasiswa mhsBaru = new Mahasiswa(nrp, nama);
                    daftarMahasiswa.add(mhsBaru);
                    
                    System.out.println("Mahasiswa '" + nama + "' berhasil ditambahkan!");
                    System.out.println("--- Lanjut ke Pengambilan Mata Kuliah ---");
                    
                    while (true) {
                        System.out.println("\nDaftar Mata Kuliah yang Tersedia:");
                        for (int i = 0; i < daftarMataKuliah.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarMataKuliah.get(i).getInfo());
                        }
                        System.out.println("0. Selesai mengambil mata kuliah");
                        System.out.print("Pilih nomor mata kuliah (atau 0 untuk selesai): ");
                        
                        int pilihanMk = scanner.nextInt();
                        scanner.nextLine();
                        
                        if (pilihanMk == 0) {
                            System.out.println("Proses pengambilan mata kuliah untuk " + mhsBaru.getNama() + " selesai.");
                            break; 
                        }
                        
                        if (pilihanMk > 0 && pilihanMk <= daftarMataKuliah.size()) {
                            MataKuliah mkDipilih = daftarMataKuliah.get(pilihanMk - 1);
                            mhsBaru.ambilMataKuliah(mkDipilih); 
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("\n--- Ambil/Tambah Mata Kuliah (untuk Mahasiswa Terdaftar) ---");
                    System.out.print("Masukkan NRP Mahasiswa: ");
                    String nrpCari = scanner.nextLine();
                    
                    Mahasiswa mhsDitemukan = null;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNRP().equals(nrpCari)) { 
                            mhsDitemukan = mhs;
                            break;
                        }
                    }
                    
                    if (mhsDitemukan == null) {
                        System.out.println("Mahasiswa dengan NRP " + nrpCari + " tidak ditemukan.");
                    } else {
                        System.out.println("Daftar Mata Kuliah yang Tersedia untuk " + mhsDitemukan.getNama() + ":");
                        for (int i = 0; i < daftarMataKuliah.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarMataKuliah.get(i).getInfo());
                        }
                        System.out.print("Pilih nomor mata kuliah yang akan diambil: ");
                        int pilihanMk = scanner.nextInt();
                        scanner.nextLine();
                        
                        if (pilihanMk > 0 && pilihanMk <= daftarMataKuliah.size()) {
                            MataKuliah mkDipilih = daftarMataKuliah.get(pilihanMk - 1);
                            mhsDitemukan.ambilMataKuliah(mkDipilih);
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("\n--- Lihat Formulir Rencana Studi ---");
                    System.out.print("Masukkan NRP Mahasiswa: ");
                    String nrpFrs = scanner.nextLine();
                    
                    Mahasiswa mhsFrs = null;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNRP().equals(nrpFrs)) {
                            mhsFrs = mhs;
                            break;
                        }
                    }
                    
                    if (mhsFrs != null) {
                        mhsFrs.lihatFRS();
                    } else {
                        System.out.println("Mahasiswa dengan NRP " + nrpFrs + " tidak ditemukan.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Terima kasih telah menggunakan aplikasi. Sampai jumpa!");
                    scanner.close(); 
                    return;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        
        }
    }
}

