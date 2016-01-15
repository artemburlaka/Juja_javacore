package OOP_Port;

/**
 * Created by Admin on 17.12.2015.
 */
public class Liner extends AbstractShip {
    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

//    public Liner(String name, float length, float width, float displacement) {
//        super(name, length, width, displacement);
//    }



    public Liner(String testLinerName, float testLinerLength, float testLinerWidth, float testLinerDisplacement, int testLinerPassengers) {
        super(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement);
        this.passengers = testLinerPassengers;
    }

    @Override
    public float calculatePayment () {
        float s = 0;
        s = passengers * DEFAULT_RENTAL;
        return s;
    }

    public float calculatePayment(float testRentTaxNegative) {
        float s = 0;
        s = passengers * testRentTaxNegative;
        if (testRentTaxNegative <= 0 )
            s = passengers * DEFAULT_RENTAL;
        return s;
    }

//    @Override
//    public float calculatePayment(int tax) {
//        float s = 0;
//        s = passengers * DEFAULT_RENTAL;
//        if (tax <= 0 )
//            s = DEFAULT_RENTAL;
//        return s;
//    }
}
