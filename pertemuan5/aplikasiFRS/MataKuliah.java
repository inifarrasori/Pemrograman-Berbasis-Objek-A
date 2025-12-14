public class MataKuliah {
    private String kodekelas;
    private String namaMk;
    private int sks;
    private Dosen pengampu;
    public MataKuliah(String kodekelas, String namaMk, int sks, Dosen pengampu) {
        this.kodekelas = kodekelas;
        this.namaMk = namaMk;
        this.sks = sks;
        this.pengampu = pengampu;
    }

    public String getInfo() {
        return "Kelas: " + kodekelas + ", Mata Kuliah: " + namaMk + 
               ", SKS: " + sks + ", Dosen: " + pengampu.getNama();
    }
    
    public String getNamaMk() {
        return this.namaMk;
    }
}