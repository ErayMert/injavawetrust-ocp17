package chapter04;

public class GettingASingleCharacter {

    public static void main(String[] args) {

        var name = "animals";
        System.out.println(name.charAt(0)); // a
        System.out.println(name.charAt(6)); // s
        System.out.println(name.charAt(7)); // StringIndexOutOfBoundsException
    }
}
