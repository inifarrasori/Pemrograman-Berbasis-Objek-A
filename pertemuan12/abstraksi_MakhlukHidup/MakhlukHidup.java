abstract class MakhlukHidup {
    protected String nama;

    public MakhlukHidup(String nama) {
        this.nama = nama;
    }

    // Abstract method: method ini TIDAK punya body di sini,
    // tapi WAJIB di-override (diimplementasikan) oleh kelas turunan.
    public abstract void bernafas();
    
    public abstract void bergerak();

    // Concrete method: method biasa yang bisa langsung dipakai
    public void statusHidup() {
        System.out.println(nama + " adalah makhluk hidup.");
    }
}