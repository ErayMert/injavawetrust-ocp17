package chapter02.comparing_values;

public class InstanceOfOperator2 {


    public static void main(String[] args) {

        openZoo(10);
        openZoo(0.5);
        openZoo2(20);
        nullInstanceOff();
    }

    public static void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.println((Integer) time + " O'clock");
        else
            System.out.println(time);
    }

    // If the compiler can determine that a variable cannot possibly be cast to a specific class, it reports an error.
    public static void openZoo2(Number time) {
        //if (time instanceof String) // DOES NOT COMPILE
        System.out.println(time);
    }

    public static void nullInstanceOff() {
        System.out.println(null instanceof Object); // false
        Object noObjectHere = null;
        System.out.println(noObjectHere instanceof String); // false

        // System.out.print(null instanceof null); // DOES NOT COMPILE
    }
}