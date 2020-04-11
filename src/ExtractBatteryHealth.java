import java.util.function.Function;

public class ExtractBatteryHealth implements Function<Main.Sensor, Integer> {
    @Override
    public Integer apply(Main.Sensor sensor) {
        return sensor.batteryHealth();
    }
}
