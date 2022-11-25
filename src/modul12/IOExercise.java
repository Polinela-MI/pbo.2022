package modul12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class IOExercise {
    public static void main(String[] args){
        //file input
        File input = new File("out/input.txt");

        System.out.println("Pilih tipe output:");
        System.out.println("1. Text File");
        System.out.println("2. CSV File");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a == 1)
            toTxt();
        else
            toCsv();
    }

    public static void toTxt(){
        File input = new File("docs/newfile.txt");
        File output = new File("docs/out.txt");

        //membaca input
        try {
            Scanner scanner = new Scanner(input);
            PrintWriter writer = new PrintWriter(output);

            while(scanner.hasNextLine()){
                String[] hasilSplit = scanner.nextLine().split(" ");

                int result = 0;
                for(int i = 0; i < hasilSplit.length; i++){
                    result += Integer.parseInt(hasilSplit[i]);
                }

                String formatOutput = "";

                for(int i = 0; i < hasilSplit.length - 1; i++){
                    formatOutput += hasilSplit[i] + " + ";
                }
                formatOutput += hasilSplit[hasilSplit.length-1] + " = " + result;

                writer.write(formatOutput);
                writer.write("\n");
            }

            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void toCsv(){
        File input = new File("docs/newfile.txt");
        File output = new File("docs/out.csv");
        int max = 0;
        ArrayList<String> out = new ArrayList<>();
        //membaca input
        try {
            Scanner scanner = new Scanner(input);
            PrintWriter writer = new PrintWriter(output);

            while(scanner.hasNextLine()){
                String[] hasilSplit = scanner.nextLine().split(" ");
                if(hasilSplit.length > max){
                    max = hasilSplit.length;
                }

                int result = 0;
                for(int i = 0; i < hasilSplit.length; i++){
                    result += Integer.parseInt(hasilSplit[i]);
                }

                String formatOutput = "";

                for(int i = 0; i < hasilSplit.length; i++){
                    formatOutput += hasilSplit[i] + ",";
                }
                formatOutput += result;

                out.add(formatOutput);
            }

            char init = 'a';
            String header = "";
            for(int j = 0; j < max; j++){
                header += (char)(init + j) + ",";
            }

            header += header.replace(","," + ");
            writer.write(header.substring(0, header.length()-2) + "\n");

            for(String s: out){
                writer.write(s + "\n");
            }

            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
