import java.util.ArrayList; 

public class Mahasiswa {
    private String nrp;
    private String nama;
    private ArrayList<MataKuliah> daftarMk; 

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
        this.daftarMk = new ArrayList<MataKuliah>();
    }

    public void ambilMataKuliah(MataKuliah mk) {
        this.daftarMk.add(mk);
        System.out.println(this.nama + " berhasil mengambil mata kuliah: " + mk.getNamaMk());
    }

    public void lihatFRS() {
        System.out.println("==============================================");
        System.out.println("FORMULIR RENCANA STUDI (FRS) - " + this.nama + " (" + this.nrp + ")");
        System.out.println("----------------------------------------------");
        if (daftarMk.isEmpty()) {
            System.out.println("Belum ada mata kuliah yang diambil.");
        } else {
            for (int i = 0; i < daftarMk.size(); i++) {
                MataKuliah mk = daftarMk.get(i);
                System.out.println((i + 1) + ". " + mk.getInfo());
            }
        }
        System.out.println("==============================================");
    }
    
    public String getNRP() {
        return this.nrp;
    }
    public String getNama() {
        return this.nama;
    }
}
