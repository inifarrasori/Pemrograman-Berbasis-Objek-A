class Tumbuhan extends MakhlukHidup {
    public Tumbuhan(String nama) {
        super(nama);
    }

    @Override
    public void bernafas() {
        System.out.println(nama + " melakukan respirasi melalui stomata.");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak mengikuti arah cahaya matahari (fototropisme).");
    }
}