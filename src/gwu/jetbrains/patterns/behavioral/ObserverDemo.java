package gwu.jetbrains.patterns.behavioral;

class SensorSystem {
    private java.util.Vector<AlarmListener> listeners = new java.util.Vector<>();

    public void register(AlarmListener al) {
        listeners.addElement(al);
    }

    public void unregister(AlarmListener al) {
        listeners.remove(al);
    }

    public void soundAlarm() {
        for (AlarmListener listener : listeners)
            listener.alarm();
    }

}


interface AlarmListener {
    void alarm();
}

class Lights implements AlarmListener {
    private String name;

    public Lights(String name) {
        this.name = name;
    }

    @Override
    public void alarm() {
        System.out.println("Turning the " + this.name + " lights on!");
    }
}

class Fan implements AlarmListener {

    @Override
    public void alarm() {
        System.out.println("Turning a fan on!");
    }
}

class ComplexSubSystem implements AlarmListener {

    @Override
    public void alarm() {
        System.out.println("Alarming system part I");
        System.out.println("Alarming system part II");
        System.out.println("Alarming system part III");
    }
}


public class ObserverDemo {
    public static void main(String[] args) {
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Lights("Bedroom"));
        sensorSystem.register(new Lights("Kitchen"));
        sensorSystem.register(new Fan());
        sensorSystem.register(new ComplexSubSystem());
        for (int i = 0; i < 6; i ++) {
            System.out.println("\nTrying out with " + i);
            if (new java.util.Random().nextInt(6) < i) {
                System.out.println("ALARM!!!");
                sensorSystem.soundAlarm();
                break;
            } else {
                System.out.println("Disappointment...");
            }
        }
    }
}
