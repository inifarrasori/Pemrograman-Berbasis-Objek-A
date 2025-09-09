
public class TicketMachine
{
    // instance variables - replace the example below with your own
    private int price;
    private int balance;
    private int total;

    /**
     * Constructor for objects of class TicketMachine
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance =0;
        total=0;
    }

    public int getprice(){
        return price;
    }
    public int getbalance(){
        return balance;
    }
    public void insertmoney(int amount){
        if (amount  > 0){
            balance += amount;
        }
        else{
            System.out.println("Amount cant be negative");
        }
    }
    public void printTicket()
    {
        if(balance >= price){
            System.out.println("BlueJ Line Ticket");
            System.out.println("Price: " + price);
            
            total = total + price;
            balance = balance - price;
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

}