package gwu.jetbrains.patterns.structural;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static java.lang.Thread.sleep;

/**
 * created by aganezov on 02/01/2016
 */




class File {
    Processing destination;
    String name;
    int value;

    public File(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public File(String name, int value, String destination){
        this(name, value);
        switch (destination) {
            case "local":
                this.destination = new Local();
                break;
            case "state":
                this.destination = new State();
                break;
            default:
                this.destination = new Federal();
                break;
        }
    }

    public void process() throws InterruptedException {
        this.destination.process();
    }
}

class Paper extends File {

    public Paper(String name, int value, String destination) {
        super(name, value, destination);
    }

    public void process() throws InterruptedException {
        System.out.println("Paper takes time. sleeping for 3 seconds");
        sleep(3000);
        super.process();
    }
}

class Paperless extends File {

    public Paperless(String name, int value, String destination) {
        super(name, value, destination);
    }

    public void process() throws InterruptedException {
        System.out.println("Instant preparation. PAPERLESS");
        super.process();
    }

}

class Mixed extends File {

    public Mixed(String name, int value, String destination) {
        super(name, value, destination);
    }

    @Override
    public void process() throws InterruptedException {
        System.out.println("Paper takes time. sleeping for 1.5 seconds");
        sleep(1500);
        super.process();
    }
}




interface Processing {
    void process() throws InterruptedException;
}

class Local implements Processing {
    @Override
    public void process() throws InterruptedException {
        System.out.println("local processes");
        System.out.println("sleeping for 8 seconds");
        sleep(8000);
        System.out.println("DONE!\n");
    }

}

class State implements Processing {

    @Override
    public void process() throws InterruptedException {
        System.out.println("state processes");
        System.out.println("sleeping for a 3 seconds");
        sleep(5000);
        System.out.println("DONE!\n");
    }

}

class Federal implements Processing {

    @Override
    public void process() throws InterruptedException {
        System.out.println("federal processes");
        System.out.println("sleeping for 2 seconds");
        sleep(2000);
        System.out.println("DONE!\n");
    }

}




public class BridgeDemo {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        String name = "Chris";

        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        BufferedReader readerMine = new BufferedReader(new FileReader("test.txt"));


        Paper paperLocal = new Paper(name, 5000, "local");
        Paper paperState = new Paper(name, 5000, "state");
        Paper paperFederal = new Paper(name, 5000, "federal");

        paperLocal.process();
        paperState.process();
        paperFederal.process();

        Paperless paperLessLocal = new Paperless(name, 5000, "local");
        Paperless paperLessState = new Paperless(name, 5000, "state");
        Paperless paperLessFederal = new Paperless(name, 5000, "federal");

        paperLessLocal.process();
        paperLessState.process();
        paperLessFederal.process();

        Mixed mixedLocal = new Mixed(name, 5000, "local");
        Mixed mixedState = new Mixed(name, 5000, "state");
        Mixed mixedFederal = new Mixed(name, 5000, "federal");

        mixedLocal.process();
        mixedState.process();
        mixedFederal.process();
    }
}