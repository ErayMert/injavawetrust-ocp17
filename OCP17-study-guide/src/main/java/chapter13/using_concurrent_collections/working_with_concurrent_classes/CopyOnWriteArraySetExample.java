package chapter13.using_concurrent_collections.working_with_concurrent_classes;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {

    public static void main(String[] args) {

        Set<Integer> set = new CopyOnWriteArraySet<>();
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);

        System.out.println(set);
    }
}
