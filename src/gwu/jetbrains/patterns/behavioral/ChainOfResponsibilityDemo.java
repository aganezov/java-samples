package gwu.jetbrains.patterns.behavioral;


class Handler {
    private static java.util.Random s_rn = new java.util.Random();
    private static int next = 1;
    private int handler_id = next++;
    private Handler next_in_chain;

    public void add(Handler next) {
        if (next_in_chain == null) next_in_chain = next;
        else next_in_chain.add(next);
    }

    public void handle(int entry) {
        boolean available = s_rn.nextInt(6) % 2 == 0;
        if (available) {
            System.out.println(handler_id + " - is busy right now; passing on");
            next_in_chain.handle(entry);
        } else {
            System.out.println(handler_id + " - handled the entry!!!");
        }
    }
}


public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler root = new Handler();
        root.add(new Handler());
        root.add(new Handler());
        root.add(new Handler());
        root.add(new Handler());

        for (int i = 0; i < 5; i++) {
            System.out.println("\nSupplied " + i);
            root.handle(i);
        }
    }
}
