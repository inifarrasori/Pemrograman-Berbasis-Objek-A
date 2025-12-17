public class Sepeda extends Kendaraan {
    private String jenisSepeda; 

    public Sepeda(String merk, String model, String tahunProduksi, String jenisSepeda) {
        super(merk, model, tahunProduksi); 
        this.jenisSepeda = jenisSepeda;
    }

    @Override
    public String getDetailInfo() {
        return "Tipe: Sepeda\n" +
               "Merk: " + merk + "\n" +
               "Model: " + model + "\n" +
               "Tahun: " + tahunProduksi + "\n" +
               "Jenis: " + jenisSepeda;
    }
} 