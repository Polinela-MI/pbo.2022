package modul13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DBExercise {
    public static void main(String[] args){
        System.out.println("Aplikasi Todo List");
        System.out.println("======================================");
        System.out.println("todo <item to do> : register todo item");
        System.out.println("done <no todo> : checklist todo item");
        System.out.println("list : melihat semua todo item");
        System.out.println("quit : keluar menu");

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        try{
            while((line = buff.readLine()) != null){
                if(line.startsWith("todo")){
                    saveTodo(line.substring(5));
                } else if(line.startsWith("done")){
                    checkTodo(line.substring(5));
                } else if(line.startsWith("list")){
                    listTodo();
                } else if(line.startsWith("quit")){
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid Command!");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
        }

    }

    public static void saveTodo(String item){
        System.out.println("savetodo");
    }

    public static void checkTodo(String item){
        System.out.println("checktodo");
    }

    public static void listTodo(){
        System.out.println("listtodo");
    }
}
