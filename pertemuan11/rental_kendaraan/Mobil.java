public class Mobil extends Kendaraan {
    private int jumlahRoda;

    public Mobil(String merk, String model, String tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi); 
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public String getDetailInfo() {
        return "Tipe: Mobil\n" +
               "Merk: " + merk + "\n" +
               "Model: " + model + "\n" +
               "Tahun: " + tahunProduksi + "\n" +
               "Jumlah Roda: " + jumlahRoda;
    }
}