package dao;

import entities.Utilisateur;
import util.Connexion;
import java.sql.*;

public class UtilisateurDao {

    public void create(Utilisateur u) throws Exception {

        String sql = "INSERT INTO utilisateur(username,password) VALUES (?,?)";

        PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
        ps.setString(1, u.getUsername());
        ps.setString(2, u.getPassword());
           ps.setString(3, u.getEmail());

        ps.executeUpdate();
    }

    public Utilisateur findByUsername(String username) throws Exception {

        String sql = "SELECT * FROM utilisateur WHERE username=?";

        PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
        ps.setString(1, username);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Utilisateur u = new Utilisateur();
            u.setId(rs.getInt("id"));
            u.setUsername(rs.getString("username"));
            u.setPassword(rs.getString("password"));
             u.setEmail(rs.getString("email"));
            return u;
        }

        return null;
    }
    public void updatePassword(int id, String newPassword) throws Exception {

    String sql = "UPDATE utilisateur SET password=? WHERE id=?";
    PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
    ps.setString(1, newPassword);
    ps.setInt(2, id);

    ps.executeUpdate();
}
}