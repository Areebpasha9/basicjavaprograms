import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class checkedException {
/*
FileNotFoundException
*/ 

 
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("demo.txt");
        BufferedReader bfr = new BufferedReader(file);
        System.out.println(bfr.readLine());

    }
}