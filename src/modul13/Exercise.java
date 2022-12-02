package modul13;

import java.math.BigDecimal;
import java.sql.*;

public class Exercise {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://192.168.9.35:3306/a1";

        try(Connection con = DriverManager.getConnection(URL, "hack", "nurul21")){
//            String sql = "select * from user";
//
//            PreparedStatement stmt = con.prepareStatement(sql);
//
//
//            ResultSet rs = stmt.executeQuery();
//
//            while(rs.next()){
//                System.out.println(rs.getString("username"));
//            }

//            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
