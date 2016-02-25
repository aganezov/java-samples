package gwu.jetbrains.patterns.behavioral;


interface Strategy {
    void run();
}

abstract class StrategyOne implements Strategy {
    abstract void start();

    abstract boolean nextTry();

    abstract boolean solved();

    abstract void end();

    @Override
    public void run() {
        start();
        while (nextTry() && !solved()) ;
        end();
    }
}

abstract class StrategyTwo implements Strategy {
    abstract void preProcess();

    abstract boolean search();

    abstract void postProcess();

    @Override
    public void run() {
        while (true) {
            preProcess();
            if (search()) break;
            postProcess();
        }
    }
}

class Impl1SO extends StrategyOne {
    @Override
    void start() {
        System.out.println("StrategyOne Impl1 starting off");
    }

    @Override
    boolean nextTry() {
        return true;
    }

    @Override
    boolean solved() {
        System.out.println("Solving...");
        boolean solved = new java.util.Random().nextInt(10) <= 5;
        if (solved) {
            System.out.println("Solved!!!");
            return true;
        } else {
            System.out.println("Failed...");
            return false;
        }
    }

    @Override
    void end() {
        System.out.println("StrategyOne Impl1 ending");
    }
}

class Impl1ST extends StrategyTwo {
    @Override
    void preProcess() {
        System.out.println("StrategyTwo Impl1 PreProcessing");
    }

    @Override
    boolean search() {
        System.out.println("Searching...");
        boolean found = new java.util.Random().nextInt(10) < 5;
        if (found) {
            System.out.println("FOUND the solution!!!");
            return true;
        } else {
            System.out.println("Failed...");
            return false;
        }
    }

    @Override
    void postProcess() {
        System.out.println("StrategyTwo Impl1 PostProcessing");
    }
}


public class StrategyDemo {
    public static void clientCode(Strategy strategy) {
        strategy.run();
    }

    public static void main(String[] args) {
        Strategy[] approaches = {new Impl1SO(), new Impl1ST()};
        for (Strategy approach : approaches) {
            System.out.println();
            clientCode(approach);
        }

    }
}
