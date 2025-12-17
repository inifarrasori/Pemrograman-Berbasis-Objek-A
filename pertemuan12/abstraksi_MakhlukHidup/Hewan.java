class Hewan extends MakhlukHidup {
    public Hewan(String nama) {
        super(nama);
    }

    @Override
    public void bernafas() {
        System.out.println(nama + " bernafas bisa dengan paru-paru, insang, atau kulit.");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan kaki, sayap, atau sirip.");
    }
}