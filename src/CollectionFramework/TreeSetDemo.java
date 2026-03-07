package CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(10);
        System.out.println(set);

        System.out.println(set.contains(20));
        System.out.println(set.remove(30));
        System.out.println(set.size());

        System.out.println(set);
    }
}
/**
 * Features
 * Doesnt allow duplicates
 * Automatically sort the data
 * Uses red and black tree internally
 * it is slower than hashsets
 * used when we want the data to be sorted!
 */