package chapter03;

public class ElseStatement {

    public static void main(String[] args) {

        int hourOfDay = 20;

        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
    }
}
