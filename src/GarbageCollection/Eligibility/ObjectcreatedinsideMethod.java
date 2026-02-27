package GarbageCollection.Eligibility;

public class ObjectcreatedinsideMethod {
    static void createObject() {
        ObjectcreatedinsideMethod obj = new ObjectcreatedinsideMethod();//after the execution is over this object in the heap
    }

    public static void main(String[] args) {
        createObject();
    }
}