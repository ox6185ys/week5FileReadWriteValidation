package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Hello.txt");
        BufferedWriter buffWriter = new BufferedWriter(writer);

        buffWriter.write("My name is Patrick.\r\n");
        buffWriter.write("My favorite color is green.\r\n");
        buffWriter.write("The Java class code is 2545\r\n");
        buffWriter.close();

        BufferedReader bufReader = new BufferedReader(new FileReader("Hello.txt"));
        String line = bufReader.readLine();
        while (line != null){
            System.out.println(line);
            line = bufReader.readLine();
        }
        bufReader.close();





/*        FileReader reader = new FileReader("Slide20.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();

    while (line != null);
            System.out.println(line);
            //line = bufferedReader.readLine();
        bufferedReader.close();*/


/*        FileReader reader = new FileReader("Hello.txt");
        BufferedReader bufReader = new BufferedReader(reader);
        String line = bufReader.readLine();

        while (line != null){
            System.out.println(line);
            line = bufReader.readLine();
        }
        bufReader.close();*/

/*        FileWriter writer = new FileWriter("Hello.txt");
        BufferedWriter buffWriter = new BufferedWriter(writer);

        buffWriter.write("Hello\n");
        buffWriter.write("Data here\n");
        buffWriter.write("Goodbye\n");
        buffWriter.close();*/


    }
}

