package modul13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;

public class DBExercise {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
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
        if(item == null || item.length() == 0){
            throw new IllegalArgumentException("Perintah kurang lengkap: todo <item to do>");
        }

        String insertTodo = "INSERT INTO todo VALUES(?,?,?)";

        TodoItem todo = new TodoItem(item);

        try(Connection con = DriverManager.getConnection(URL, "root", "")){
            PreparedStatement stmt = con.prepareStatement(insertTodo);

            stmt.setString(1, todo.getId());
            stmt.setString(2, todo.getItem());
            stmt.setBoolean(3, todo.isState());

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Todo List berhasil di-update.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void checkTodo(String item){
        if(item == null || item.length() == 0){
            throw new IllegalArgumentException("Perintah kurang lengkap: done <nomor item>");
        }

        String insertTodo = "UPDATE todo SET statuspengerjaan = true WHERE id LIKE ? ";

        try(Connection con = DriverManager.getConnection(URL, "root", "")){
            PreparedStatement stmt = con.prepareStatement(insertTodo);

            stmt.setString(1, item+"%");

            stmt.executeUpdate();
            stmt.close();

            System.out.println("Todo List berhasil di-update.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void listTodo(){
        ArrayList<TodoItem> lists = new ArrayList<>();

        String sql = "SELECT * FROM todo WHERE statuspengerjaan = false";

        try(Connection con = DriverManager.getConnection(URL, "root", "")){
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String id = rs.getString("id");
                String item = rs.getString("todo");
                boolean state = rs.getBoolean("statuspengerjaan");

                lists.add(new TodoItem(id, item, state));
            }

            stmt.close();

            System.out.println(lists.size() + " thing(s) to do.");
            for(TodoItem todo : lists){
                System.out.println(todo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
