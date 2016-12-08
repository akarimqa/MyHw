package MyKeyWords;

/**
 * Created by ahmadkarim on 12/8/16.
 */
public class RegularCar extends Automotives {


    private static int GasTank;

    public static int getGasTank() {
        return GasTank;
    }

    public static void setGasTank(int gasTank) {
        GasTank = gasTank;
    }



    public void  Refill(String str){
        System.out.println("Regular Car gets :"+str);

    }

}
