package DAO;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import conecction.ConnectionDB;
import entities.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

    public void registerUser(User user) {

        String sql = "INSERT INTO user(name, login, email, senha) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getLogin());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
