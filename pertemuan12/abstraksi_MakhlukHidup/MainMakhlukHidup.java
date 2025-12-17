public class MainMakhlukHidup {
    public static void main(String[] args) {
        // Kita tidak bisa melakukan: new MakhlukHidup("X"); -> Error

        MakhlukHidup andi = new Manusia("Andi");
        MakhlukHidup kucing = new Hewan("Kucing");
        MakhlukHidup mawar = new Tumbuhan("Bunga Mawar");

        // Polimorfisme: Memanggil method yang sama tapi perilakunya berbeda
        andi.statusHidup();
        andi.bernafas();
        
        System.out.println("---");
        
        kucing.statusHidup();
        kucing.bergerak();
        
        System.out.println("---");
        
        mawar.statusHidup();
        mawar.bernafas();
        mawar.bergerak();
    }
}