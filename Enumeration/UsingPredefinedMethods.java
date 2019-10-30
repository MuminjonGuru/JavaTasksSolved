enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class UsingPredefinedMethods {

    public static void main(String args[]) {
        Apple ap;

        System.out.println("Here are all Apple constants:");

        // use values()
        for(Apple a : Apple.values())
            System.out.println(a);

        System.out.println();

        // use valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);

    }
}
