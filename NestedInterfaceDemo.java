// A nested interface example
public class NestedInterfaceDemo {

    public static void main(String[] args) {
        // use a nested interface reference
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("10 is not negative");

        if(nif.isNotNegative(-12))
            System.out.println("This won't be displayed");
    }
}

// This class contains a member interface
class A {
    // this is a nested interface
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// B implements the nested interface
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
