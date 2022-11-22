package modul12;

import java.io.*;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
//        readInputScanner();
//        filePath();
//        readInputBuff();
        writeOutput();
    }

    public static void writeOutput(){
        //file output
        File file = new File("out/output1.txt");

        try {
            PrintWriter writer = new PrintWriter(file);

            writer.write("Java adalah bahasa pemrograman favorit saya.");
            writer.write("love love love.");

            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void filePath(){
//        String absolutePath = "C:/Users/NurulQ/Documents/file_abs_path.txt";
        String relativePath = "out/file_relative_path.txt";
        String newFolder = "docs";

//        File absPath = new File(absolutePath);
        File relPath = new File(relativePath);
        File fold = new File(newFolder);

        File file = new File(fold, "newfile.txt");

        try {
            fold.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void readInputScanner(){
        File file = new File("out/input.txt");

        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextInt()){
                System.out.println(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readInputBuff(){
        File file = new File("out/input.txt");

        try {
            FileReader read = new FileReader(file);
            BufferedReader buff = new BufferedReader(read);
            String line;

            while((line = buff.readLine()) != null){
                System.out.println(line);
            }

            read.close();
            buff.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
