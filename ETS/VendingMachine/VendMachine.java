import java.util.*;

public class VendMachine
{
    private Coffee espresso;
    private Coffee americano;
    private Coffee cappucino;
    
    private int kopi;
    private int susu;
    private int gula;
    
    private int balance;
    /**
     * Constructor for objects of class VendMachine
     */
    public VendMachine()
    {
        espresso = new Coffee("espresso",8000);
        americano = new Coffee("americano", 9000);
        cappucino = new Coffee("cappucino", 12000);
        
        kopi = 20;
        susu = 20;
        gula = 20;
        
        balance = 0;
    }

    public void brew(Coffee coffee)
    {
        Scanner ac = new Scanner(System.in);
        Scanner bc = new Scanner(System.in);
        System.out.println("Tambah gula: ");
        int usegula = 0;
        usegula = ac.nextInt();
        
        System.out.println("Tambah susu: ");
        int usesusu = 0;
        usesusu = bc.nextInt();
                
        int harga = coffee.getPrice() + (500 *(usegula + usesusu));
        System.out.println("Harga: " + harga);
        if (balance < harga){
            System.out.println("Uang tidak cukup");
        }
        else{
        kopi--;
        gula = gula - usegula;
        susu = susu - usesusu;
        balance = balance - harga;
        System.out.println("Kopi akan disajikan");
        }
    }
    
    public void refill()
    {
        kopi += 10;
        susu += 10;
        gula += 10;
        System.out.println("Mesin di-refill");
    }
    
    public void showMenu(){
        System.out.println("Pilih kopi");
        System.out.println("0. Admin");
        System.out.println("1. Espresso");
        System.out.println("2. Americano");
        System.out.println("3. Cappucino");
        System.out.println("4. Add Balance");
        System.out.println("5. Exit");
    }
    public void adminview(){
        System.out.println("Stok Kopi: " + kopi);
        System.out.println("Stok Susu: " + susu);
        System.out.println("Stok Gula: " + gula);
        System.out.println("=====================");
        refill();
    }
    public void menu()
    {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        
        while (choice != 5){
            showMenu();
            choice = sc.nextInt();
            
            switch (choice){
                case 0:
                    adminview();
                    break;
                case 1:
                    brew(espresso);
                    break;
                case 2:
                    brew(americano);
                    break;
                case 3:
                    brew(cappucino);
                    break;
                case 4:
                    System.out.println("How much to add?");
                    Scanner cc = new Scanner(System.in);
                    int addbalance = 0;
                    addbalance = cc.nextInt();
                    balance += addbalance;
                case 5:
                    System.out.println("Goodbye");
            }
        }
    }
}