import java.util.function.Predicate;

public class HasAlarm implements Predicate<Main.Sensor> {

    @Override
    public boolean test(Main.Sensor sensor) {
        return false;
    }
}
