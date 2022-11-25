package modul12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IOWithObjectExercise {
    public static void main(String[] args){
        File input = new File("out/input.txt");
        ArrayList<LineSummation> lines = new ArrayList<>();
        int maxOperands = 0;

        try {
            //try reading input
            Scanner scanInput = new Scanner(input);

            System.out.println("Membaca input...." + input.getName());
            while (scanInput.hasNextLine()){
                LineSummation baris = new LineSummation();
                String[] hasilSplit = scanInput.nextLine().split(" ");

                //menghitung jumlah operand terbanyak
                if(hasilSplit.length > maxOperands){
                    maxOperands = hasilSplit.length;
                }

                //parse hasiilSplit sebagai integer, dan simpan dalam arraylist pada objek LineSummation
                for(String s: hasilSplit){
                    baris.getOperands().add(Integer.parseInt(s));
                }

                //melakukan operasi penjumlahan pada setiap bilangan
                for(int i : baris.getOperands()){
                    baris.setResult(baris.getResult() + i);
                }

                lines.add(baris);
            }

            System.out.println("===> " + lines.size());
            System.out.println("Pilih tipe file yang diinginkan: ");
            System.out.println("1. TXT File");
            System.out.println("2. CSV File");

            System.out.println("Masukkan pilihan: ");
            Scanner scanner = new Scanner(System.in);
            int pilihan = scanner.nextInt();

            if(pilihan == 1){
                toTxt(lines);
            } else {
                toCsv(lines, maxOperands);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void toTxt(ArrayList<LineSummation> lines) throws FileNotFoundException {
        File output = new File("out/output.txt");

        PrintWriter writer = new PrintWriter(output);

        for(LineSummation line : lines){
            String s = line.getOperands().stream().map(integer -> String.valueOf(integer))
                    .collect(Collectors.joining(" + "));

            writer.write(s + " = " + line.getResult() + "\n");
        }

        writer.close();
    }

    public static void toCsv(ArrayList<LineSummation> lines, int maxOperands) throws FileNotFoundException {
        File output = new File("out/output.csv");

        PrintWriter writer = new PrintWriter(output);

        String columnHeader = "";

        for(char c = 'a'; c < (char)('a' + maxOperands); ++c){
            columnHeader += String.valueOf(c) + ",";
        }

        columnHeader += columnHeader.substring(0, columnHeader.length()-1).replace(",", " + ");

        writer.write(columnHeader + "\n");

        for(LineSummation line : lines){
            String s = line.getOperands().stream().map(integer -> String.valueOf(integer))
                    .collect(Collectors.joining(" , "));

            writer.write(s + " , " + line.getResult() + "\n");
        }

        writer.close();
    }
}
