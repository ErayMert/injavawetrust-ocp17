package chapter15.getting_data_from_a_resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsingBindVariables {

    void test() throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "SELECT id FROM exhibits WHERE name = ?";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setString(1, "Zebra");
            try (var rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    System.out.println(id);
                }
            }
        }
    }
}