package ExceptionHandling;
import java.io.BufferedReader;

import java.io.InputStreamReader;
public class E4 {
    public static  void main(String[] args)throws Exception{
        String str;
        BufferedReader br=null;
        try{
            br=new BufferedReader(new InputStreamReader(System.in));
            str=br.readLine();
            System.out.println(str);
        }finally{
            br.close();
        }
    }
}
