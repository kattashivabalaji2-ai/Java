package Generics;
class Test<T>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }
}
class Driver{
    public static void main(String[] args) {
        Test<Integer> obj1=new Test<>(15);
        Test<String> obj2=new Test<>("Shiva");
    }
}
