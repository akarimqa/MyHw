package MyKeyWords;

/**
 * Created by ahmadkarim on 12/7/16.
 */
public class Automotives {
    public String Type;
     public String Maker;
    public static int WheelDrive;
    public final static int NoEngine=1;
    private double Price;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }
    public static void Engine(String b){
        System.out.println(b+" Car has "+NoEngine+" Engine.");

    }
    public void  Refill(String str){
        System.out.println("Automotive gets :"+str);

    }



}
