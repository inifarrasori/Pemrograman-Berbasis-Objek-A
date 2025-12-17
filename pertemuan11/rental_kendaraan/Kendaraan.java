public class Kendaraan {
    protected String merk;
    protected String model;
    protected String tahunProduksi;
    protected boolean isDisewa;

    public Kendaraan(String merk, String model, String tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.isDisewa = false; 
    }

    public void sewa() {
        this.isDisewa = true;
    }

    public void kembalikan() {
        this.isDisewa = false;
    }

    public boolean isTersedia() {
        return !isDisewa;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public String getDetailInfo() {
        return "Kendaraan: " + merk + " " + model + " (" + tahunProduksi + ")";
    }
}