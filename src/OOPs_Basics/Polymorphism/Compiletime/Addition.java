package OOPs_Basics.Polymorphism.Compiletime;
//Overloading
public class Addition {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    float add(float a,float b){
        return a+b;
    }
}
class driver{
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(90, 89);
        a.add(98, 98, 89);
    }
}
