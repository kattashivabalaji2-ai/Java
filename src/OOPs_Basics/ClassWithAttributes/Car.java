package OOPs_Basics.ClassWithAttributes;

public class Car{
    //atributes of car
    String BrandName;
    int ManuDate;
    String Colour;
    //constructor (access specifier can be added if you want to access it outside this class)
    public Car(String BName, int ManuDate, String Colour){
        BrandName=BName;//removed this keyword because the parameter variable ame is different from BrandName
        this.ManuDate=ManuDate;//this keyword represents c1 and c2
        this.Colour=Colour;
    }
    void print(){//method
        System.out.printf("Car Brandname:%s\n",BrandName);
        System.out.printf("Car Manufacturing Date:%d\n",ManuDate);//this.Manudate to be used if we use S.O.Pln
        System.out.printf("Car Colour:%s\n",Colour);
        System.out.println();
    }
}
class Driver{
    public static void main(String[] args) {
        Car c1=new Car("Audi",2026,"RED");//object creation
        Car c2=new Car("BMW",1995,"Black");
        c1.print();
        c2.print();
    }
}