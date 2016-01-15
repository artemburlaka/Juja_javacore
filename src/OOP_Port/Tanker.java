package OOP_Port;

/**
 * Created by Admin on 17.12.2015.
 */
public class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement) {
        super(name, length, width, displacement);
    }
    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment () {
        float s = 0;
        s = volume * DEFAULT_RENTAL;
        return s;
    }

    public float calculatePayment(float newVolume) {
        float s = 0;
        s = volume * newVolume;
        if (newVolume <= 0 )
            s = volume * DEFAULT_RENTAL;
        return s;
    }
}
