class Manusia extends MakhlukHidup {
    public Manusia(String nama) {
        super(nama);
    }

    @Override
    public void bernafas() {
        System.out.println(nama + " bernafas menggunakan paru-paru.");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berjalan dengan dua kaki.");
    }
}