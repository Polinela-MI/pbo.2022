package modul12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOExercise {
    public static void main(String[] args){
        //file input
        File input = new File("out/input.txt");

        //file output
        File output = new File("out/output.txt");

        String temp;

        try {
            Scanner scan = new Scanner(input);

            PrintWriter writer = new PrintWriter(output);

            while(scan.hasNextLine()){
                temp = scan.nextLine();//5 7

                String[] hasilSplit = temp.split(" ");//[0] = 5, [1] = 7
                //5 + 7 = 12
                int hasilPenjumlahan = Integer.parseInt(hasilSplit[0]) + Integer.parseInt(hasilSplit[1]);

                writer.write(hasilSplit[0] + " + " + hasilSplit[1] + " = " + hasilPenjumlahan);
                writer.write("\n");

            }
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
