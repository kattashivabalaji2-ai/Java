package ExceptionHandling;
import java.io.IOException;
//Usage of Throws keyword!!
//throws-used for checked exceptions.
/*EXCEPTION PROPOGATION: If an exception is thrown and not caught in the
method where it occurs, it propagates to the calling method.
This process continues until a suitable catch block is found.
 If no handler is found, the program terminates with an error message.
 */
public class CheckedException {
    static void readFile() throws IOException {
        throw new IOException("File not found");
    }

    static void display() throws IOException {
        readFile();
    }

    public static void main(String[] args) {
        try{
            display();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}