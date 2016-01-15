package OOP_Port;

/**
 * Created by Admin on 17.12.2015.
 */
public class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private static int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];
    private AbstractShip[] tempArray = new AbstractShip[1];


    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {
        float min = 0;
        int n = -1;
        AbstractShip[] tempArray = new AbstractShip[3];
        if (arrayShips == null)
        {
            return "";
        }
        else {

            for (int barrier = 0; barrier < arrayShips.length; barrier++) {
                for (int index = arrayShips.length - 1; index >= barrier; index--) {
                    if (index == 0) {
                        break;
                    } else {
                        if (arrayShips[index].calculatePayment() < arrayShips[index - 1].calculatePayment()) {
                            tempArray[0] = arrayShips[index];
                            arrayShips[index] = arrayShips[index - 1];
                            arrayShips[index - 1] = tempArray[0];
                        }
                    }
                }
            }

            String s = "";
            for (int q = 0; q < arrayShips.length; q++) {
                s = s + arrayShips[q].getName() + "=" + arrayShips[q].calculatePayment();
            }
            return s;
        }
    }


    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort + 1 == SeaPortQueue.LENGTH_QUEUE_SHIP)
        {
            return -1;
        }
        else {
        arrayShip[indexShipInPort + 1] = ship;
        indexShipInPort++;
        return indexShipInPort;
        }
    }

    @Override
    public int removeShipFromBeginQueue() {
        if (indexShipInPort == NO_SHIP_IN_ARRAY)
        {
            return -1;
        }
        else {
            for (int i = 0; i < arrayShip.length-1; i++) {
                arrayShip[i] = arrayShip[i+1];
                if (i == arrayShip.length-2) {
                    arrayShip[arrayShip.length-1] = null;
                }
            }
            return 1;
        }
    }

    @Override
    public String printQueueShip() {
        if (indexShipInPort == NO_SHIP_IN_ARRAY)
        {
            return "QueueEmpty";
        }
        else {
            String s = "";
            for (int i = 0; i < arrayShip.length-1; i++) {
                s = s + "{" + arrayShip[i].toPrint() + "};";
            }
            return s;
        }
    }
}
