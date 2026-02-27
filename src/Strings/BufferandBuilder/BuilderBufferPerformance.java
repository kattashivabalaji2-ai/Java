package Strings.BufferandBuilder;

public class BuilderBufferPerformance {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        StringBuffer sbf=new StringBuffer("Placement");
        for(int i=0;i<1000000;i++){
            sbf.append("Training");
        }
        System.out.println("Time Taken by String Buffer:"+(System.currentTimeMillis()-startTime)+"ms");
        long startT=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder("Placement");
        for(int i=0;i<1000000;i++){
            sbf.append("Training");
        }
        System.out.println("Time Taken by String Builder:"+(System.currentTimeMillis()-startT)+"ms");
    }
}
