package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);
        System.out.println(dq);
    }
}
/**
 *allows adding and removing from both the sides
 * faster than stack class which is now legacy
 * can work like stack and queues
 */