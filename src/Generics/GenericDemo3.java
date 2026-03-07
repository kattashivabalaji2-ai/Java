package Generics;
class Test2<K,V>{
    K key;
    V value;

    Test2(K key,V value){
        this.key=key;
        this.value=value;
    }
    void display(){
        System.out.println(key+" "+value);
    }
}
class Driver1{
    public static void main(String[] args) {
        Test2<String,Integer>obj1=new Test2<>("Shiva",123);
        obj1.display();
    }
}
