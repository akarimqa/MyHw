package MyKeyWords;

/**
 * Created by ahmadkarim on 12/8/16.
 */
public class TestCar {
    public static void main(String[] args) {
Automotives car=new Automotives();
        RegularCar Sadan =new RegularCar();
        RegularCar Suv =new RegularCar();
      ElectricCar Tesla=new ElectricCar();
        ElectricCar Other=new ElectricCar();

        car.setPrice(20000.00);


        System.out.println("Automotive average price :"+car.getPrice());
        car.Refill("Fuel");


        Sadan.Maker="Toyota";
        Sadan.Type="MidSize";
        Sadan.setPrice(15000.00);
        System.out.println("Price of a "+Sadan.Type+" "+Sadan.Maker+" is : $" + Sadan.getPrice());
        Sadan.Refill("Gasoline.");
        Sadan.Maker="Nissan";
        Sadan.Type="Full Size";
        Sadan.setPrice(18000.00);
        System.out.println("Price of a "+Sadan.Type+" "+Sadan.Maker+" is : $" + Sadan.getPrice());
        Automotives.Engine("Regular Car");
        Automotives.Engine("Toyota ");

        Suv.Maker="Audi";
        Suv.Type="Q7";
        Suv.Refill(" Gasoline");
        Suv.setPrice(68000.00);

        System.out.println(Suv.Maker +" Model "+Suv.Type+" costs $"+Suv.getPrice()+" which has ");
        Automotives.Engine("Audi Q7 ");
        RegularCar.setGasTank(25);
        System.out.println("Audi Q7 has "+RegularCar.getGasTank()+" Gal Tank.");
        Automotives.Engine("Electric Car ");
        Tesla.setPrice(1000000.00);
        Tesla.setChargeCapacity(10);
        Automotives.Engine("Tesla ");
        System.out.println("Tesla cost $"+Tesla.getPrice()+" which has "+Tesla.getChargeCapacity()+" KW charge capacity. ");
        Tesla.Refill("Charge");




    }
}
