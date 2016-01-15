package OOP_Port;

/**
 * Created by Admin on 17.12.2015.
 */
public class Test {
    public static void main(String[] args) {
        String testLinerName = "TestLinerName";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;


        float testRentTaxNegative=-1;
        float expectedLinerPaymentRentTaxDefault = testLinerPassengers * Liner.DEFAULT_RENTAL;


        Liner liner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);
        float actualLinerPaymentRentTaxNegative = liner.calculatePayment(testRentTaxNegative);

        //check payment if rent tax is default
        float actualLinerPaymentRentTaxDefault = liner.calculatePayment();
        if (actualLinerPaymentRentTaxDefault == expectedLinerPaymentRentTaxDefault);
        System.out.print("OK");
//            throw new AssertionError("Rent tax is default" + Liner.DEFAULT_RENTAL + " and expected payment value= " + expectedLinerPaymentRentTaxDefault + " but found " + actualLinerPaymentRentTaxDefault);


    }
}
