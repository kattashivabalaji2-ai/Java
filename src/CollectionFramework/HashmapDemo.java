package CollectionFramework;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"Shiva");
        map.put(2,"Balaji");
        map.put(3,"Sap");
        System.out.println(map);
        //get()->Used to retrive the val
        System.out.println(map.get(0));

        //containsKey()
        System.out.println(map.containsKey(1));

        //map.remove()
        map.remove(1);
        System.out.println(map);

    }
}
/**
 * stores the element as key value pairs
 * key must be unique
 * values can be duplicated
 * doesn't maintain the insertion order
 * uses hashing internally
 * here we use put(0,get(),remove(),containsKey()->Important
 * */
