package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo { // Renamed class
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // Use diamond operator
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate, will not be added

        System.out.println(set.contains(20)); // true
        System.out.println(set.remove(30));   // true
        System.out.println(set.size());       // 2

        System.out.println(set);              // [10, 20]
    }
}
/**
 * Doesnt allow duplicates
 * maintains the order of insertion -it acts like linkedlist
 */