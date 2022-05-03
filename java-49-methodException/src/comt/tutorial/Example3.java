package comt.tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("inputs.txt");
        System.out.println(input.read());
    }
}
