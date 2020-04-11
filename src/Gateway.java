public class Gateway implements Main.Sensor {
    private int batteryHealth;
    private boolean triggered;
    @Override
    public int batteryHealth() {
        return batteryHealth;
    }

    public Gateway(int batteryHealth, boolean triggered) {
        this.batteryHealth = batteryHealth;
        this.triggered = triggered;
    }

    @Override
    public void batteryHealth(int health) {
        this.batteryHealth = health;
    }
    @Override
    public boolean triggered() {
        return triggered;
    }
    @Override
    public void triggered(boolean state) {
        triggered = state;
    }
}

