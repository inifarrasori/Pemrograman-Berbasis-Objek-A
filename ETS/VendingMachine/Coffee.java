public class Coffee
{
    // instance variables - replace the example below with your own
    private String name;
    private int price;

    /**
     * Constructor for objects of class Coffee
     */
    public Coffee (String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
    
    public String getName()
    {
        return name;
    }
}