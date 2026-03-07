package CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("abc");
        list.add("efg");
        list.add("hij");

        list.addFirst("ABC");
        list.addLast("xyz");
        System.out.println(list);

    }
}
/**
 * Features
 * maintains insertion order
 * allows duplicates
 * uses node structure internally
 * slower reading but faster insertions and deletions compared to ArrayList
 */
