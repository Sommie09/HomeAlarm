import java.util.function.Predicate;

public class HasWarning implements Predicate<Main.Sensor> {
    public static final int BATTERY_WARNING = 10;
    @Override
    public boolean test(Main.Sensor sensor) {
        return sensor.batteryHealth() < BATTERY_WARNING;
    }
}
