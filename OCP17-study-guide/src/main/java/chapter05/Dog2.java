package chapter05;

public class Dog2 {

    public static void main(String[] args) {
        var name = new StringBuilder("Webby");
        speak(name);
        System.out.print(name); // WebbyGeorgette
    }

    public static void speak(StringBuilder s) {
        s.append("Georgette");
    }
}
