package modul13;

import java.sql.*;

public class Exercise {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb";

        try(Connection con = DriverManager.getConnection(URL, "root", "")){
            String sql = "select * from cobacoba";

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet hasil = stmt.executeQuery(sql);

            hasil.last();
            System.out.println(hasil.getInt("id") + " " + hasil.getString("text"));
            System.out.println(hasil.getRow());

            hasil.first();
            System.out.println(hasil.getInt("id") + " " + hasil.getString("text"));

            hasil.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
