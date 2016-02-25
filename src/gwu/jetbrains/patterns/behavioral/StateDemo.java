package gwu.jetbrains.patterns.behavioral;


interface State {
    boolean pull(Machine machine);

    void doStuff();
}

class Machine {
    State currentState;

    public Machine() {
        currentState = new StartState();
    }

    public void setState(State state) {
        currentState = state;
    }

    public boolean pull() {
         return currentState.pull(this);
    }
}

class StartState implements State {
    @Override
    public boolean pull(Machine machine) {
        System.out.println("setting \"medium\" state");
        machine.setState(new MediumState());
        return true;
    }

    @Override
    public void doStuff() {
        System.out.println("Doing stuff in \"starting\" state");
    }
}

class MediumState implements State {
    @Override
    public boolean pull(Machine machine) {
        System.out.println("setting \"end\" state");
        machine.setState(new EndState());
        return true;
    }

    @Override
    public void doStuff() {
        System.out.println("Doing stuff in \"medium\" state");
    }
}

class EndState implements State {
    @Override
    public boolean pull(Machine machine) {
        return false;
    }

    @Override
    public void doStuff() {
        System.out.println("Doing stuff in \"end\" state");
    }
}

public class StateDemo {
    public static void main(String[] args) {
        Machine machine = new Machine();
        System.out.println("Firing up!!!");
        do {
            machine.currentState.doStuff();
        } while (machine.pull());
    }
}
