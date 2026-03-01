package dao;

import entities.Client;
import util.Connexion;
import java.sql.*;
import java.util.*;

public class ClientDao implements IDao<Client> {

    public void create(Client c) throws Exception {
        String sql = "INSERT INTO Client(nom, telephone) VALUES (?, ?)";
        PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
        ps.setString(1, c.getNom());
        ps.setString(2, c.getTelephone());
        ps.executeUpdate();
    }

    public List<Client> findAll() throws Exception {
        List<Client> list = new ArrayList<>();
        String sql = "SELECT * FROM Client";
        ResultSet rs = Connexion.getConnection()
                                   .createStatement()
                                   .executeQuery(sql);

        while(rs.next()){
            Client c = new Client();
            c.setId(rs.getInt("id"));
            c.setNom(rs.getString("nom"));
            c.setTelephone(rs.getString("telephone"));
            list.add(c);
        }
        return list;
    }

    public void update(Client c) throws Exception {
        String sql = "UPDATE Client SET nom=?, telephone=? WHERE id=?";
        PreparedStatement ps = Connexion.getConnection().prepareStatement(sql);
        ps.setString(1, c.getNom());
        ps.setString(2, c.getTelephone());
        ps.setInt(3, c.getId());
        ps.executeUpdate();
    }

    public void delete(int id) throws Exception {
        String sql = "DELETE FROM Client WHERE id=?";
        PreparedStatement ps =Connexion.getConnection().prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public Client findById(int id) { return null; }
}