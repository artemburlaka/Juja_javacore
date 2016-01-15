package OOP_Port;

/**
 * Created by Admin on 17.12.2015.
 */
public class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL=550;

    public Cargo(String name, float length, float width, float displacement) {
        super(name, length, width, displacement);
    }
    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment () {
        float s = 0;
        s = tonnage * DEFAULT_RENTAL;
        return s;
    }

    public float calculatePayment(float newTonnage) {
        float s = 0;
        s = tonnage * newTonnage;
        if (newTonnage <= 0 )
            s = tonnage * DEFAULT_RENTAL;
        return s;
    }
}
