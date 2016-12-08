package MyKeyWords;

/**
 * Created by ahmadkarim on 12/8/16.
 */
public class ElectricCar extends  Automotives {


    private int ChargeCapacity;

    public int getChargeCapacity() {
        return ChargeCapacity;
    }

    public void setChargeCapacity(int chargeCapacity) {
        this.ChargeCapacity = chargeCapacity;
    }


    //Overide method

    public void  Refill(String str){
        System.out.println("Electric car gets :"+str);

    }

}
